package com.vita_zaebymba.notelistapp

import com.vita_zaebymba.notelistapp.entities.ShoppingListItem
import org.junit.Assert.*
import org.junit.Test

class ShoppingListItemTest {

    /**  Тест проверяет корректность создания объекта ShoppingListItem и соответствие значений его полей */
    @Test
    fun testShoppingListItem() {
        val shoppingListItem = ShoppingListItem (
            id = 1,
            name = "milk",
            itemInfo = "1 l",
            itemChecked = 1,
            listId = 3,
            itemType = "item"
        )

        assertEquals(1, shoppingListItem.id)
        assertEquals("milk", shoppingListItem.name)
        assertEquals("1 l", shoppingListItem.itemInfo)
        assertEquals(1, shoppingListItem.itemChecked)
        assertEquals(3, shoppingListItem.listId)
        assertEquals("item", shoppingListItem.itemType)
    }

}