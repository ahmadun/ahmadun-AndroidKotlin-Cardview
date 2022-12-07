package com.example.praktikum5.model

class mahasiswa {
    private var foto:Int=0
    private var nim:String=""
    private var nama:String=""
    private var alamat:String=""
    private var prodi:String=""

    constructor(foto:Int,nim:String,nama:String,alamat:String,prodi:String){
        this.foto   =foto
        this.nim   =nim
        this.nama   =nama
        this.alamat   =alamat
        this.prodi   =prodi
    }

    fun getfoto():Int{
        return  foto
    }

    fun getnim():String{
        return  nim
    }

    fun getnama():String{
        return  nama
    }

    fun getalamat():String{
        return alamat
    }

    fun getprodi():String{
        return  prodi
    }
}