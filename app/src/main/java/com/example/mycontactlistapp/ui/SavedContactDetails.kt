////package com.example.mycontactlistapp
////
////import androidx.appcompat.app.AppCompatActivity
////import android.os.Bundle
////import com.example.mycontactlistapp.databinding.ActivitySavedContactDetailsBinding
////
////class SavedContactDetails : AppCompatActivity() {
////    lateinit var binding: ActivitySavedContactDetailsBinding
////
////    private var contactId = -1
////
////    private var product: ContactListData? = null
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        var binding=ActivitySavedContactDetailsBinding.inflate(layoutInflater)
////        setContentView(binding.root)
////
////    }
////}
//
//
//package com.example.mycontactlistapp
//
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.lifecycle.LiveData
//import com.example.mycontactlistapp.database.ContactsDb
//import com.example.mycontactlistapp.databinding.ActivitySavedContactDetailsBinding
//import com.example.mycontactlistapp.ContactListData
//
//
//class SavedContactDetails : AppCompatActivity() {
//    lateinit var binding: ActivitySavedContactDetailsBinding
//
//    private var contactId = -1
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivitySavedContactDetailsBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        // Retrieve contactId from intent
//        contactId = intent.getIntExtra("CONTACT_ID", -1)
//
//        // Load and display contact details
//        if (contactId != -1) {
//            val database = ContactsDb.getDatabase(applicationContext)
//            val contactDao = database.contactDao()
//
//            val contact = contactDao.getContactById(contactId)
//            displayContactDetails(contact)
//        } else {
//            // Handle invalid contactId
//        }
//    }
//
//    private fun displayContactDetails(contact: LiveData<ContactListData>) {
//        binding.apply {
//            tvNaming.text =
//            tvNumbers.text = contact.phoneNumber
//            tvemails.text = contact.emailAdress
//
//            // Load contact image using Picasso or any other image loading library
//            // Picasso.get().load(contact.image).into(ivContactImage)
//        }
//    }
//}


package com.example.mycontactlistapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.mycontactlistapp.ContactListData
import com.example.mycontactlistapp.database.ContactsDb
import com.example.mycontactlistapp.databinding.ActivitySavedContactDetailsBinding
import com.squareup.picasso.Picasso

class SavedContactDetails : AppCompatActivity() {
    lateinit var binding: ActivitySavedContactDetailsBinding

    private var contactId = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySavedContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)



        // Retrieve contactId from intent
        contactId = intent.getIntExtra("CONTACT_ID", -1)

        // Load and display contact details
        if (contactId != -1) {
            val database = ContactsDb.getDatabase(applicationContext)
            val contactDao = database.contactDao()

            val contactLiveData = contactDao.getContactById(contactId)
            contactLiveData.observe(this, Observer { contact ->
                if (contact != null) {
                    displayContactDetails(contact)
                }
            })
        } else {
            // Handle invalid contactId
        }
    }

    private fun displayContactDetails(contact: ContactListData) {
        binding.apply {
            tvNaming.text = contact.contactName
            tvNumbers.text = contact.phoneNumber
            tvemails.text = contact.emailAdress
            if (contact.image.isNotEmpty()) {
                Picasso.get()
                    .load(contact.image)
                    .resize(80, 80)
                    .into(ivimagev)


            }




        }
    }
        }


