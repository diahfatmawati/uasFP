package com.example.uas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

// membuat class dengan nama ActivityHome
class ActivityHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // menggunakan konten view file activity_home.xml dari folder layout
        setContentView(R.layout.activity_home)

        // memberikan fungsi pada button home
        // mereferensikan button ke aktivitas selanjutnya (Halaman Beranda)
        // Intent digunakan untuk perpindahan Halaman
        home.setOnClickListener {
            val intent = Intent( this, ActivityBeranda::class.java)
            startActivity(intent)
        }
        // memberi judul HOME pada actionBar
        val actionBar = supportActionBar
        actionBar!!.title = "HOME"
    }
}