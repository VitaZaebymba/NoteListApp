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

        assertEquals(1, noteItem.id)
        assertEquals("Fruits", noteItem.title)
        assertEquals("apples, oranges", noteItem.content)
        assertEquals("2023-07-04", noteItem.time)
        assertEquals("Home", noteItem.category)
    }
}