package com.kodeanbia.kotlinbukulandmark

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //nama landmark di panggil
        val intent = intent
        val nama = intent.getStringExtra("nama")
        textView.text = nama

        Toast.makeText(applicationContext, nama,Toast.LENGTH_SHORT).show()

        //gambar landmark di panggil
        val pilih = Global.Pilih
        val pilihGambar = pilih.returnGambar()
        imageView.setImageBitmap(pilihGambar)

    }
}
