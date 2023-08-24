package com.vita_zaebymba.notelistapp.db

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.NoteListItemBinding
import com.vita_zaebymba.notelistapp.entities.NoteItem

class NoteAdapter(private val listener: Listener): ListAdapter<NoteItem, NoteAdapter.ItemHolder>(ItemComparator()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder.create(parent) // создание заметки
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.setData(getItem(position), listener) // заполнение заметки
    }


    class ItemHolder(view: View): RecyclerView.ViewHolder(view) {
        private val binding = NoteListItemBinding.bind(view)

        fun setData(note: NoteItem, listener: Listener) = with(binding) {
            tvTitle.text = note.title
            tvDescription.text = note.content
            tvTime.text = note.time
            imDelete.setOnClickListener {
                listener.deleteItem(note.id!!)
            }
        }
        companion object {
            fun create(parent: ViewGroup): ItemHolder {
                return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.note_list_item, parent, false))
            }
        }
    }

    class ItemComparator: DiffUtil.ItemCallback<NoteItem>() {
        override fun areItemsTheSame(oldItem: NoteItem, newItem: NoteItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: NoteItem, newItem: NoteItem): Boolean {
            return oldItem == newItem
        }
    }

    interface Listener {
        fun deleteItem(id: Int)
    }

}