package com.example.uas

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_bangun.*

// membuat class dengan nama DetailBangunDatar
class DetailBangunDatar : AppCompatActivity() {

    // menggunakan konten view file detail_bangun.xml dari folder layout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_bangun)

        // memberi judul ALL ABOUT BANGUN pada actionBar
        val actionBar = supportActionBar
        actionBar!!.title = "ALL ABOUT RUANG"
        // untuk menampilkan tanda panah (untuk kembali kehalaman sebelumnya) pada actionBar
        actionBar.setDisplayHomeAsUpEnabled(true)

        // memanggil fungsi activity
        val intentThatStartedThisActivity = getIntent()

// untuk menghubungkan file kt dan file xml untuk detail BANGUN DATAR dengan memanggil id masing-masing view dan data
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            val image = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            val name = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            val desc = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            val test = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            imageBangun.setImageResource(image)
            nameBangun.text = name
            allAboutBangun.text = desc
            soalBangun.text = test
        }
    }
}