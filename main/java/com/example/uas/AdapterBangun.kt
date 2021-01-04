package com.example.uas

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_bangun.view.*

// membuat class dengan nama AdapterBangun
class AdapterBangun (val itemBangunList: List<Bangun>, val clickListener: (Bangun) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {

        // untuk membuat object view dari layout yang dibuat pada file xml
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_bangun, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemBangunList[position], clickListener)
    }
    override fun getItemCount() = itemBangunList.size

    // membuat class baru PartViewHolder
    class PartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        // menghubungkan itemView dengan data Bangun
        fun bind(data : Bangun, clickListener: (Bangun) -> Unit){
            itemView.imgBangun.setImageResource(data.imageBangun)
            itemView.list_Bangun.text = data.nameBangun
            itemView.daftar_Bangun.text = data.listBangun
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}