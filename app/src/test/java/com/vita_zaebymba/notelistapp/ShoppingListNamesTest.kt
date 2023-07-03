package com.vita_zaebymba.notelistapp

import com.vita_zaebymba.notelistapp.entities.ShoppingListNames
import org.junit.Test

import org.junit.Assert.*
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class ShoppingListNamesTest {

    /**  Тест проверяет корректность создания объекта ShoppingListNames и соответствие значений его полей */
    @Test
    fun testShoppingListNamesObject() {
        val shoppingList = ShoppingListNames(
            id = 1,
            name = "Grocery List",
            time = "2023-07-03",
            allItemCounter = 5,
            checkedItemsCounter = 2,
            itemsIds = "1,2,3"
        )

        assertEquals(1, shoppingList.id)
        assertEquals("Grocery List", shoppingList.name)
        assertEquals("2023-07-03", shoppingList.time)
        assertEquals(5, shoppingList.allItemCounter)
        assertEquals(2, shoppingList.checkedItemsCounter)
        assertEquals("1,2,3", shoppingList.itemsIds)
    }

    /**  Тест выполняет проверку сериализации и десериализации объекта ShoppingListNames */
    @Test
    fun testShoppingListNamesSerialization() {
        val originalShoppingList = ShoppingListNames(
            id = 1,
            name = "Grocery List",
            time = "2023-07-03",
            allItemCounter = 5,
            checkedItemsCounter = 2,
            itemsIds = "1,2,3"
        )

        // Serialize the object
        val outputStream = ByteArrayOutputStream()
        val objectOutputStream = ObjectOutputStream(outputStream)
        objectOutputStream.writeObject(originalShoppingList)
        objectOutputStream.close()

        val serializedData = outputStream.toByteArray()

        // Deserialize the object
        val inputStream = ByteArrayInputStream(serializedData)
        val objectInputStream = ObjectInputStream(inputStream)
        val deserializedShoppingList = objectInputStream.readObject() as ShoppingListNames
        objectInputStream.close()

        // Assert the deserialized object matches the original one
        assertEquals(originalShoppingList.id, deserializedShoppingList.id)
        assertEquals(originalShoppingList.name, deserializedShoppingList.name)
        assertEquals(originalShoppingList.time, deserializedShoppingList.time)
        assertEquals(originalShoppingList.allItemCounter, deserializedShoppingList.allItemCounter)
        assertEquals(originalShoppingList.checkedItemsCounter, deserializedShoppingList.checkedItemsCounter)
        assertEquals(originalShoppingList.itemsIds, deserializedShoppingList.itemsIds)
    }
}