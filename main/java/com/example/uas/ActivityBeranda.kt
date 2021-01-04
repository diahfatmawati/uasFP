package com.example.uas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_beranda.*

// membuat class dengan nama ActivityBeranda
class ActivityBeranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // menggunakan konten view file activity_beranda.xml dari folder layout
        setContentView(R.layout.activity_beranda)
        // mereferensikan button bDatar ke aktivitas selanjutnya (Halaman Definisi Bangun Datar)
        bDatar.setOnClickListener {
            val intent = Intent( this, ActivityDatar::class.java)
            startActivity(intent)
        }
        // mereferensikan button bRuang ke aktivitas selanjutnya (Halaman Definisi Bangun Ruang)
        bRuang.setOnClickListener {
            val intent = Intent( this, ActivityRuang::class.java)
            startActivity(intent)
        }
        // memberi judul BERANDA pada actionBar
        val actionBar = supportActionBar
        actionBar!!.title = "BERANDA"
        // untuk menampilkan tanda panah (untuk kembali kehalaman sebelumnya) pada actionBar
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}