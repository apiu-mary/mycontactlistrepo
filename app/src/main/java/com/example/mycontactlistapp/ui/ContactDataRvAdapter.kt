//package com.example.mycontactlistapp.ui
//
//import android.content.Context
//import android.content.Intent
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.mycontactlistapp.ContactListData
//import com.example.mycontactlistapp.databinding.LisstBinding
//import com.squareup.picasso.Picasso
//
//
//class ContactDataRvAdapter(var contactList: List<ContactListData>, val context: Context ):RecyclerView.Adapter<ContactViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
//        var binding=LisstBinding.inflate(
//            LayoutInflater.from(parent.context),parent,false)
//        return  ContactViewHolder(binding)
//
//
//    }
//
//    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
//
//        var detail = contactList[position]
//        holder.binding.apply {
//            tvName.text = detail.contactName
//            tvNumber.text = detail.phoneNumber
//            tvemail.text = detail.emailAdress
//
//            if (detail.image.isNotEmpty()) {
//                Picasso.get()
//                    .load(detail.image)
//                    .resize(80, 80)
//                    .into(ivimage)
//            } else {
//                // If the image path is empty or invalid, you can set a placeholder image here.
//                // For example:
//                // ivimage.setImageResource(R.drawable.placeholder_image)
//            }
//
//            ivimage.setOnClickListener {
//                val intent = Intent(context, ContactDetails::class.java)
//                intent.putExtra("CONTACT_ID", detail.contactid)
//                context.startActivity(intent)
//            }
//        }
//
//
//    }
//    override fun getItemCount(): Int {
//        return contactList.size
//
//
//    }
//}
//
//class ContactViewHolder(var binding: LisstBinding):RecyclerView.ViewHolder(binding.root){
//
//}
//



package com.example.mycontactlistapp.ui

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontactlistapp.ContactListData
import com.example.mycontactlistapp.databinding.LisstBinding
import com.squareup.picasso.Picasso

class ContactDataRvAdapter(var contactList: List<ContactListData>, val context: Context): RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = LisstBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val detail = contactList[position]
        holder.binding.apply {
            tvName.text = detail.contactName
            tvNumber.text = detail.phoneNumber
            tvemail.text=detail.emailAdress




            if (detail.image.isNotEmpty()) {
                Picasso.get()
                    .load(detail.image)
                    .resize(80, 80)
                    .into(ivimage)
            } else {
                // If the image path is empty or invalid, you can set a placeholder image here.
                // For example:
                // ivimage.setImageResource(R.drawable.placeholder_image)
            }

            // Set click listener for the entire card view
            cvAll.setOnClickListener {
                val intent = Intent(context, SavedContactDetails::class.java)
                intent.putExtra("CONTACT_ID", detail.contactid)
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(var binding: LisstBinding) : RecyclerView.ViewHolder(binding.root)
