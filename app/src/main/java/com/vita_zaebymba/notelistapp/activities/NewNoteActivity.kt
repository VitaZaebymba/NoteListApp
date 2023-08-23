package com.vita_zaebymba.notelistapp.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityNewNoteBinding
import com.vita_zaebymba.notelistapp.entities.NoteItem
import com.vita_zaebymba.notelistapp.fragments.NoteFragment
import java.text.SimpleDateFormat
import java.util.*

class NewNoteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        actionBarSettings()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.new_note_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.id_save) {
            setMainResult()
        } else if (item.itemId == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setMainResult(){
        val i = Intent().apply {
            putExtra(NoteFragment.NEW_NOTE_KEY, createNewNote())
        }
        setResult(RESULT_OK, i)
        finish()
    }

    private fun createNewNote(): NoteItem {
        return NoteItem(
            null,
            binding.edTitle.text.toString(),
            binding.edDescription.text.toString(),
            getCurrentTime(),
            ""
            )
    }

    @SuppressLint("SimpleDateFormat")
    private fun getCurrentTime(): String {
        val formatter = SimpleDateFormat("hh:mm - yy/MM/dd", Locale.getDefault())
        return formatter.format(Calendar.getInstance().time)
    }

    private fun actionBarSettings() {
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

}