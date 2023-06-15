package com.example.mycontactlistapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontactlistapp.databinding.LisstBinding
import com.squareup.picasso.Picasso


class ContactDataRvAdapter(var contactList:List<ContactListData> ):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=LisstBinding.inflate(
            LayoutInflater.from(parent.context),parent,false)
        return  ContactViewHolder(binding)


    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var detail = contactList[position]
        holder.binding.apply {
            tvName.text=detail.contactName
            tvNumber.text=detail.phoneNumber
            tvemail.text=detail.emailAdress
            var binding=holder.binding
            Picasso.get()
                .load(detail.image)
                .resize(80, 80)

                .into(binding.ivimage)



        }

    }
    override fun getItemCount(): Int {
        return contactList.size


    }
}

class ContactViewHolder(var binding: LisstBinding):RecyclerView.ViewHolder(binding.root){

}

