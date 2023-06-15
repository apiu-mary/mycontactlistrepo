package com.example.mycontactlistapp

import android.content.Intent
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


        binding.ivfloat.setOnClickListener {
            val intent = Intent(this, NewContact::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }


        fun displayContacts() {
            var contact1 = ContactListData(
                "Mary",
                "+254704953840",
                "apiuagouu@gmail.com",
                "https://media.istockphoto.com/id/1446086947/photo/travel-van-and-woman-with-peace-hand-sign-on-road-trip-in-mexico-happy-relax-and-smile-summer.jpg?s=1024x1024&w=is&k=20&c=aYgvlrWlfFid-ubWCUJTIMMoeaoDLjM0owNc9DkmYVE="
            )
            var contact2 = ContactListData(
                "May",
                "+254704953840",
                "apiuagoui@gmail.com",
                "https://media.istockphoto.com/id/1446086947/photo/travel-van-and-woman-with-peace-hand-sign-on-road-trip-in-mexico-happy-relax-and-smile-summer.jpg?s=1024x1024&w=is&k=20&c=aYgvlrWlfFid-ubWCUJTIMMoeaoDLjM0owNc9DkmYVE="
            )
            var contact3 = ContactListData(
                "Maria",
                "+254704953840",
                "apiuagour@gmail.com",
                "https://media.istockphoto.com/id/1446086947/photo/travel-van-and-woman-with-peace-hand-sign-on-road-trip-in-mexico-happy-relax-and-smile-summer.jpg?s=1024x1024&w=is&k=20&c=aYgvlrWlfFid-ubWCUJTIMMoeaoDLjM0owNc9DkmYVE="
            )
            var contact4 = ContactListData(
                "Marsh",
                "+254704953840",
                "apiuagouz@gmail.com",
                "https://media.istockphoto.com/id/1446086947/photo/travel-van-and-woman-with-peace-hand-sign-on-road-trip-in-mexico-happy-relax-and-smile-summer.jpg?s=1024x1024&w=is&k=20&c=aYgvlrWlfFid-ubWCUJTIMMoeaoDLjM0owNc9DkmYVE="
            )
            var contact5 = ContactListData(
                "Musy",
                "+254704953840",
                "apiuagouu@gmail.com",
                "https://media.istockphoto.com/id/1446086947/photo/travel-van-and-woman-with-peace-hand-sign-on-road-trip-in-mexico-happy-relax-and-smile-summer.jpg?s=1024x1024&w=is&k=20&c=aYgvlrWlfFid-ubWCUJTIMMoeaoDLjM0owNc9DkmYVE="
            )
            var contact6 = ContactListData(
                "Moris",
                "+254704953840",
                "apiuagoou@gmail.com",
                "https://media.istockphoto.com/id/1446086947/photo/travel-van-and-woman-with-peace-hand-sign-on-road-trip-in-mexico-happy-relax-and-smile-summer.jpg?s=1024x1024&w=is&k=20&c=aYgvlrWlfFid-ubWCUJTIMMoeaoDLjM0owNc9DkmYVE="
            )
            var contact7 = ContactListData(
                "Marvel",
                "+254704953840",
                "apiuaguou@gmail.com",
                "https://media.istockphoto.com/id/1446086947/photo/travel-van-and-woman-with-peace-hand-sign-on-road-trip-in-mexico-happy-relax-and-smile-summer.jpg?s=1024x1024&w=is&k=20&c=aYgvlrWlfFid-ubWCUJTIMMoeaoDLjM0owNc9DkmYVE="
            )
            var contact8 = ContactListData(
                "Moses",
                "+254704953840",
                "apiuagrou@gmail.com",
                "https://media.istockphoto.com/id/1446086947/photo/travel-van-and-woman-with-peace-hand-sign-on-road-trip-in-mexico-happy-relax-and-smile-summer.jpg?s=1024x1024&w=is&k=20&c=aYgvlrWlfFid-ubWCUJTIMMoeaoDLjM0owNc9DkmYVE="
            )
            var contact9 = ContactListData(
                "Marves",
                "+254704953840",
                "apiuaou@gmail.com",
                "https://media.istockphoto.com/id/1446086947/photo/travel-van-and-woman-with-peace-hand-sign-on-road-trip-in-mexico-happy-relax-and-smile-summer.jpg?s=1024x1024&w=is&k=20&c=aYgvlrWlfFid-ubWCUJTIMMoeaoDLjM0owNc9DkmYVE="
            )
            var contact10 = ContactListData(
                "Moris",
                "+254704953840",
                "apiiuagou@gmail.com",
                "https://media.istockphoto.com/id/1446086947/photo/travel-van-and-woman-with-peace-hand-sign-on-road-trip-in-mexico-happy-relax-and-smile-summer.jpg?s=1024x1024&w=is&k=20&c=aYgvlrWlfFid-ubWCUJTIMMoeaoDLjM0owNc9DkmYVE="
            )
            var contact11 = ContactListData(
                "Mach",
                "+254704953840",
                "apiugou@gmail.com",
                "https://media.istockphoto.com/id/1446086947/photo/travel-van-and-woman-with-peace-hand-sign-on-road-trip-in-mexico-happy-relax-and-smile-summer.jpg?s=1024x1024&w=is&k=20&c=aYgvlrWlfFid-ubWCUJTIMMoeaoDLjM0owNc9DkmYVE="
            )
            var contactlistz = listOf<ContactListData>(
                contact1,
                contact2,
                contact3,
                contact4,
                contact5,
                contact6,
                contact7,
                contact8,
                contact9,
                contact10,
                contact11
            )
            binding.rvContacts.layoutManager = LinearLayoutManager(this)
            var adaptercontacts = ContactDataRvAdapter(contactlistz)
            binding.rvContacts.adapter = adaptercontacts


        }
    }





