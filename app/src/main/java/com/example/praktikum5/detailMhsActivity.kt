package com.example.praktikum5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.praktikum5.databinding.ActivityDetailMhsBinding
import com.example.praktikum5.databinding.ActivityMainBinding

class detailMhsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailMhsBinding
    var b:Bundle?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetailMhsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    fun initView(){
        b=intent.extras

        binding.txnim.text=b?.getString("nim")
        binding.txnama.text=b?.getString("nama")
        binding.txalamat.text=b?.getString("alamat")
        binding.txprodi.text=b?.getString("prodi")

    }
}