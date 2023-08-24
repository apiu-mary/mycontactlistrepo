package com.example.mycontactlistapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mycontactlistapp.R
import com.example.mycontactlistapp.databinding.ActivityContactDetailsBinding

class ContactDetails : AppCompatActivity() {
    var ContactId=0
    lateinit var binding: ActivityContactDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var bundle=intent.extras
        if (bundle!=null){
            ContactId=bundle.getInt("CONNTACT_iD")
            Toast.makeText(this,"$ContactId",Toast.LENGTH_LONG).show()

        }
    }
}