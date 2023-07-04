package com.vita_zaebymba.notelistapp

import com.vita_zaebymba.notelistapp.entities.LibraryItem
import org.junit.Test
import org.junit.Assert.*

class LibraryItemTest {
    @Test
    fun libraryItemTestObject() {
        val libraryItem = LibraryItem (
            id = 1,
            name = "beef"
                )

        val id = 1
        val name = "beef"

        assertEquals(id, libraryItem.id)
        assertEquals(name, libraryItem.name)
    }
}