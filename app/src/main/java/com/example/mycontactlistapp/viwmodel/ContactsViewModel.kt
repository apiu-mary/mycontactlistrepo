package com.example.mycontactlistapp.viwmodel

import android.provider.ContactsContract.Contacts
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mycontactlistapp.ContactListData
import com.example.mycontactlistapp.database.repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel :ViewModel() {
    val contactsRepo=ContactsRepository()
    fun saveContact(contact: ContactListData) {
//        you cannot call a suspend function 4rm another suspend it can ony occur on a suspend or cooroutine
        viewModelScope.launch {
            contactsRepo.saveContact(contact)
        }
    }

     fun getContacts(): LiveData<List<ContactListData>> {
            return contactsRepo.getDbContacts()
        }
    }

