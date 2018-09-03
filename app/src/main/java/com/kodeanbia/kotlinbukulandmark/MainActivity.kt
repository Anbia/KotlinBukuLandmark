package com.kodeanbia.kotlinbukulandmark

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var namaLandmark = ArrayList<String>()
        namaLandmark.add("Monas")
        namaLandmark.add("Pisa")
        namaLandmark.add("Colosseum")
        namaLandmark.add("Eiffel")
        namaLandmark.add("London Brige")

        val monas = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.monas)
        val pisa = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.pisa)
        val colosseum = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.colosseum)
        val eiffel = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.eiffel)
        val londonBrige = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.london_brige)

        var gambarLandmark = ArrayList<Bitmap>()
        gambarLandmark.add(monas)
        gambarLandmark.add(pisa)
        gambarLandmark.add(colosseum)
        gambarLandmark.add(eiffel)
        gambarLandmark.add(londonBrige)

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,namaLandmark)
        listView.adapter = arrayAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, id ->
            val intent = Intent(applicationContext, DetailActivity::class.java)
            intent.putExtra("nama", namaLandmark[i])

            val bitmap = gambarLandmark[i]
            val pilih = Global.Pilih
            pilih.pilihGambar = bitmap

            startActivity(intent)

        }

    }
}
