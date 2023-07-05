package com.vita_zaebymba.notelistapp.activities

import android.app.Application
import com.vita_zaebymba.notelistapp.db.MainDatabase

class MainApp: Application() {
    // бд доступна на всех активити
    val database by lazy {
        MainDatabase.getDatabase(this)
    }

}