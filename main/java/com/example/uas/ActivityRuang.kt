package com.example.uas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ruang.*

// membuat class dengan nama ActivityRuang
class ActivityRuang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // menggunakan konten view file activity_ruang.xml dari folder layout
        setContentView(R.layout.activity_ruang)

        // mereferensikan button btnRuang ke aktivitas selanjutnya (Halaman Bangun Ruang)
        btnRuang.setOnClickListener {
            val intent = Intent( this,MainActivity2::class.java)
            startActivity(intent)
        }

        // memberi judul DEFINISI BANGUN RUANG pada actionBar
        val actionBar = supportActionBar
        actionBar!!.title = "DEFINISI BANGUN RUANG"
        // untuk menampilkan tanda panah (untuk kembali kehalaman sebelumnya) pada actionBar
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}