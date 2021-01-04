package com.example.uas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_datar.*

// membuat class dengan nama ActivityDatar
class ActivityDatar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // menggunakan konten view file activity_datar.xml dari folder layout
        setContentView(R.layout.activity_datar)

        // mereferensikan button btnDatar ke aktivitas selanjutnya (Halaman Bangun Datar)
        btnDatar.setOnClickListener {
            val intent = Intent( this,MainActivity::class.java)
            startActivity(intent)
        }

        // memberi judul DEFINISI BANGUN DATAR pada actionBar
        val actionBar = supportActionBar
        actionBar!!.title = "DEFINISI BANGUN DATAR"
        // untuk menampilkan tanda panah (untuk kembali kehalaman sebelumnya) pada actionBar
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}