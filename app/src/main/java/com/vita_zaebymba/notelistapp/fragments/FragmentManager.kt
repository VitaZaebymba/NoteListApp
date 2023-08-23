package com.vita_zaebymba.notelistapp.fragments

import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R


object FragmentManager {
    var currentFragment: BaseFragment?= null // используется для отслеживания текущего активного фрагмента

    fun setFragment(newFrag: BaseFragment, activity: AppCompatActivity) {
        val transaction = activity.supportFragmentManager.beginTransaction() // создает новую транзакцию фрагмента
        transaction.replace(R.id.placeHolder, newFrag) // указывается, что текущий фрагмент должен быть заменен на новый фрагмент
        transaction.commit()
        currentFragment = newFrag
    }
}
