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

        assertEquals(1, libraryItem.id)
        assertEquals("beef", libraryItem.name)
    }
}