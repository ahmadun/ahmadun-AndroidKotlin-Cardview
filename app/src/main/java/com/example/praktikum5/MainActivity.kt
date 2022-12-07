package com.example.praktikum5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.praktikum5.adapter.MahasiswaAdapter
import com.example.praktikum5.databinding.ActivityMainBinding
import com.example.praktikum5.model.mahasiswa

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    lateinit var mahasiswaAdapter: MahasiswaAdapter
    val lm=LinearLayoutManager(this)
    val addMahasiswaList : MutableList<mahasiswa> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    fun initView(){
        binding.rvData.layoutManager=lm
        mahasiswaAdapter= MahasiswaAdapter(this)
        binding.rvData.adapter=mahasiswaAdapter

        addMahasiswaList.add(
            mahasiswa(foto = R.drawable.a,nim="111", nama = "Alhamidi",
                alamat = "Jakarta", prodi = "Sitem Informasi"))

        addMahasiswaList.add(
            mahasiswa(foto = R.drawable.b,nim="120", nama = "Liana",
                alamat = "Jakarta", prodi = "Sitem Informasi"))

        addMahasiswaList.add(
            mahasiswa(foto = R.drawable.d,nim="121", nama = "Maulana",
                alamat = "Jakarta", prodi = "Sitem Informasi"))


            mahasiswaAdapter.setListDataMahasiswa(addMahasiswaList)



    }
}