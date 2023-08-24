package com.example.mycontactlistapp

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Contacts")
data class ContactListData(
   @PrimaryKey(autoGenerate=true) var contactid:Int,
    var contactName:String,
    var phoneNumber:String,
    var emailAdress:String,
    var image:String

)


