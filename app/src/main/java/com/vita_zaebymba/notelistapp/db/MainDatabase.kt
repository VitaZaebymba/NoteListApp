package com.vita_zaebymba.notelistapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.vita_zaebymba.notelistapp.entities.LibraryItem
import com.vita_zaebymba.notelistapp.entities.NoteItem
import com.vita_zaebymba.notelistapp.entities.ShoppingListItem
import com.vita_zaebymba.notelistapp.entities.ShoppingListNames

@Database(entities = [LibraryItem::class,
                      NoteItem::class,
                      ShoppingListItem::class,
                      ShoppingListNames::class
], version = 1)
abstract class MainDatabase: RoomDatabase() {
    abstract fun getDao(): Dao

    companion object {
        @Volatile
        private var INSTANCE: MainDatabase? = null
        fun getDatabase(context: Context): MainDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDatabase::class.java,
                    "note_list.db"
                ).build() // создание базы данных
                instance
            }
        }
    }
}
