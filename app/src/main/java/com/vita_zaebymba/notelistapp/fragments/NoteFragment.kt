package com.vita_zaebymba.notelistapp.fragments

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vita_zaebymba.notelistapp.R
import com.vita_zaebymba.notelistapp.databinding.FragmentNoteBinding

class NoteFragment: BaseFragment() {

    private lateinit var binding: FragmentNoteBinding

    override fun onClickNew() {

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = NoteFragment()
    }
}