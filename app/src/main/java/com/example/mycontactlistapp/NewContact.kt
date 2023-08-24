package com.example.mycontactlistapp

//import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels

import com.example.mycontactlistapp.databinding.ActivityNewContactBinding
import com.example.mycontactlistapp.viwmodel.ContactsViewModel

class NewContact : AppCompatActivity() {
    lateinit var binding:ActivityNewContactBinding
//
private val contactsviewModel:ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding =ActivityNewContactBinding .inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.save.setOnClickListener{
            validateContacts()
        }
    }
    fun validateContacts(){
        val firstname=binding.etFirstNAme.text.toString()
        val secondname = binding.etSecondName.text.toString()
        val email=binding.etemail.text.toString()
        val number=binding.etnumber.text.toString()

        var error=false
        if (firstname.isBlank()) {
            binding.etFirstNAme.error = getString(R.string.name_recquired)
            error = true

        }
        if (secondname.isBlank()) {
            binding.etSecondName.error = getString(R.string.second_required)
            error = true

        }
        if (number.isBlank()) {
            binding.etemail.error = getString(R.string.email_required)
            error = true

        }
        if (email.isBlank()) {
            binding.etnumber.error = getString(R.string.number_required)
            error = true

        }
        if (!error){
//
            val newContact = ContactListData(contactid = 0, emailAdress = email, contactName = firstname, phoneNumber = number, image = "")

            contactsviewModel.saveContact(newContact)
            Toast.makeText(this,"contactsaved",Toast.LENGTH_LONG).show()
            finish()

        }


    }



    }

