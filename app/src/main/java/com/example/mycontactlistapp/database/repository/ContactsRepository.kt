package com.example.mycontactlistapp.database.repository

import android.provider.ContactsContract.Contacts
import androidx.lifecycle.LiveData
import com.example.mycontactlistapp.ContactListData
import com.example.mycontactlistapp.ContactslistappApp
import com.example.mycontactlistapp.database.ContactsDb
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database=ContactsDb.getDatabase(ContactslistappApp.appContext)
    suspend fun saveContact(contact:ContactListData){
        //        switching context of coroutine 2 iothread
        withContext(Dispatchers.IO){
            database.contactDao().insertContact(contact)
        }

    }
    fun getDbContacts():LiveData<List<ContactListData>>{
        return  database.contactDao().getALLContacts()
    }
}