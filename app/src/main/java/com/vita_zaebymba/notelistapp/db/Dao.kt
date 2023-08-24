package com.vita_zaebymba.notelistapp.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.vita_zaebymba.notelistapp.entities.NoteItem
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Query("SELECT * FROM note_list")
    fun getAllNotes(): Flow<List<NoteItem>> // Flow подключает бд к списку и автоматически обновляет

    @Query("DELETE FROM note_list WHERE id IS :id")
    suspend fun deleteNote(id: Int)
    @Insert
    suspend fun insertNote(note: NoteItem)

}