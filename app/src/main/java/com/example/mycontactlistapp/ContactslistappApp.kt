package com.example.mycontactlistapp

import android.app.Application
import android.content.Context

class ContactslistappApp:Application() {
    companion object{
        lateinit var appContext: Context
    }

    override fun onCreate() {
        super.onCreate()
//        access global context
        appContext=applicationContext
    }
}