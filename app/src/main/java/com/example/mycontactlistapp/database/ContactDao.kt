package com.example.mycontactlistapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mycontactlistapp.ContactListData

@Dao
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertContact(contact:ContactListData)
     @Query("SELECT* FROM contacts ORDER BY contactName" )
     fun getALLContacts():LiveData<List<ContactListData>>

    @Query("SELECT * FROM contacts WHERE contactid = :id")
    fun getContactById(id: Int): LiveData<ContactListData>
}