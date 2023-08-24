package com.example.mycontactlistapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontactlistapp.ContactListData
import com.example.mycontactlistapp.NewContact
import com.example.mycontactlistapp.databinding.ActivityMainBinding
import com.example.mycontactlistapp.viwmodel.ContactsViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val contactsViewModel:ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ivfloat.setOnClickListener {
            val intent = Intent(this, NewContact::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        contactsViewModel.getContacts().observe(this,{contacts->displayContacts(contacts)})
        super.onResume()



    }


        fun displayContacts(contactList: List<ContactListData>) {
            var adaptercontacts = ContactDataRvAdapter(contactList ,this )

            binding.rvContacts.layoutManager = LinearLayoutManager(this)

            binding.rvContacts.adapter = adaptercontacts


        }
    }






