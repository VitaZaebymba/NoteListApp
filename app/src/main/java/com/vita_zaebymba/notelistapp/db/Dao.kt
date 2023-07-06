package com.vita_zaebymba.notelistapp.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.vita_zaebymba.notelistapp.entities.NoteItem
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Query("SELECT * FROM note_list")
    fun getAllNotes(): Flow<List<NoteItem>> // Flow подлкючает бд к списку и автоматически обновляет

    @Insert
    fun insertNote(note: NoteItem)

}