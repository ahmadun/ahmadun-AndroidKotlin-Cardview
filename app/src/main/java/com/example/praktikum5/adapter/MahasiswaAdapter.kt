package com.example.praktikum5.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.praktikum5.R
import com.example.praktikum5.detailMhsActivity
import com.example.praktikum5.model.mahasiswa

class MahasiswaAdapter(val context:Context):RecyclerView.Adapter<MahasiswaAdapter.MahasiswaHolder>() {
    private val mhs:MutableList<mahasiswa> = mutableListOf()

    override fun getItemCount(): Int {
        return  mhs.size
    }
    override fun onBindViewHolder(holder:MahasiswaAdapter.MahasiswaHolder,position:Int) {
        holder.bindmodel(mhs[position])
    }

    override fun onCreateViewHolder(parent:ViewGroup,viewType:Int):MahasiswaHolder {
        return MahasiswaHolder(LayoutInflater.from(context).inflate(R.layout.list_data,parent,false))
    }

    inner class MahasiswaHolder(item:View):RecyclerView.ViewHolder(item){
        val imgfoto:ImageView=item.findViewById((R.id.img_foto))
        val txtnim:TextView=item.findViewById((R.id.tx_nim))
        val txtnama:TextView=item.findViewById((R.id.tx_nama))

        val cardViewData:CardView=item.findViewById(R.id.list_data)

        fun bindmodel(m:mahasiswa){
            imgfoto.setImageResource(m.getfoto())
            txtnim.text=m.getnim()
            txtnama.text=m.getnama()

            cardViewData.setOnClickListener{
                var i=Intent(context,detailMhsActivity::class.java).apply {

                    putExtra("nim",m.getnim())
                    putExtra("nama",m.getnama())
                    putExtra("alamat",m.getalamat())
                    putExtra("prodi",m.getprodi())
                }
                context.startActivity(i)
            }
        }
    }

    fun setListDataMahasiswa(data:List<mahasiswa>){
        mhs.clear()
        mhs.addAll(data)
        notifyDataSetChanged()
    }
}