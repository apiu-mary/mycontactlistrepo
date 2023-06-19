package com.example.mycontactlistapp

//import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.example.mycontactlistapp.databinding.ActivityNewContactBinding

class NewContact : AppCompatActivity() {
    lateinit var binding:ActivityNewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding =ActivityNewContactBinding .inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun validateContacts(){
        val firstname=binding.etFirstNAme.text.toString()
        val secondname = binding.etSecondName.text.toString()
        val email=binding.etemail.text.toString()
        val number=binding.etnumber.text.toString()

        var error=false
        if (firstname.isBlank()) {
            binding.etFirstNAme.error = "firstname is recquired"
            error = true

        }
        if (secondname.isBlank()) {
            binding.etSecondName.error = "secondname is recquired"
            error = true

        }
        if (email.isBlank()) {
            binding.etemail.error = "email is recquired"
            error = true

        }
        if (email.isBlank()) {
            binding.etnumber.error = "number is recquired"
            error = true

        }
        if (!error){
            Toast.makeText(this,"$firstname,$secondname,$email,$number",Toast.LENGTH_LONG).show()

        }


    }



    }

