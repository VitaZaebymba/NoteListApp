package com.vita_zaebymba.notelistapp

import com.vita_zaebymba.notelistapp.entities.NoteItem
import org.junit.Assert.*
import org.junit.Test

class NoteItemTest {

    @Test
    fun noteItemTestObject(){
        val noteItem = NoteItem (
            id = 1,
            title = "Fruits",
            content = "apples, oranges",
            time = "2023-07-04",
            category = "Home"
                )

        val id = 1
        val title = "Fruits"
        val content = "apples, oranges"
        val time = "2023-07-04"
        val category = "Home"

        assertEquals(id, noteItem.id)
        assertEquals(title, noteItem.title)
        assertEquals(content, noteItem.content)
        assertEquals(time, noteItem.time)
        assertEquals(category, noteItem.category)
    }
}