package com.example.mycontactlistapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mycontactlistapp.ContactListData

@Database(entities = arrayOf(ContactListData::class), version =1)

 abstract class ContactsDb:RoomDatabase() {
    abstract fun contactDao(): ContactDao

    companion object {
        private var database: ContactsDb?=null
        fun getDatabase(context: Context): ContactsDb {
            if (database==null) {
                database=Room.databaseBuilder(context, ContactsDb::class.java, "ContactsDb").build()
            }
            return database as ContactsDb

        }
    }
}
