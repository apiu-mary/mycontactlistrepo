package com.example.mycontactlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontactlistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
        var contact1=ContactListData("Mary","+254704953840","apiuagouu@gmail.com","Han")
        var contact2=ContactListData("May","+254704953840","apiuagoui@gmail.com","Han")
        var contact3=ContactListData("Maria","+254704953840","apiuagour@gmail.com","Han")
        var contact4=ContactListData("Marsh","+254704953840","apiuagouz@gmail.com","Han")
        var contact5=ContactListData("Musy","+254704953840","apiuagouu@gmail.com","Han")
        var contact6=ContactListData("Moris","+254704953840","apiuagoou@gmail.com","Han")
        var contact7=ContactListData("Marvel","+254704953840","apiuaguou@gmail.com","Han")
        var contact8=ContactListData("Moses","+254704953840","apiuagrou@gmail.com","Han")
        var contact9=ContactListData("Marves","+254704953840","apiuaou@gmail.com","Han")
        var contact10=ContactListData("Moris","+254704953840","apiiuagou@gmail.com","Han")
        var contact11=ContactListData("Mach","+254704953840","apiugou@gmail.com","Han")
        var contactlistz= listOf<ContactListData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        var adaptercontacts=ContactDataRvAdapter(contactlistz)
        binding.rvContacts.adapter=adaptercontacts





    }
}




