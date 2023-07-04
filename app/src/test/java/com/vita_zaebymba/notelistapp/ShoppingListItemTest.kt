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

        val id = 1
        val name = "milk"
        val itemInfo = "1 l"
        val itemChecked = 1
        val listId = 3
        val itemType = "item"

        assertEquals(id, shoppingListItem.id)
        assertEquals(name, shoppingListItem.name)
        assertEquals(itemInfo, shoppingListItem.itemInfo)
        assertEquals(itemChecked, shoppingListItem.itemChecked)
        assertEquals(listId, shoppingListItem.listId)
        assertEquals(itemType, shoppingListItem.itemType)
    }

}