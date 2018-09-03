package com.kodeanbia.kotlinbukulandmark

import android.graphics.Bitmap

class Global {

    companion object Pilih {
        var pilihGambar : Bitmap? = null
        fun returnGambar() : Bitmap{
            return pilihGambar!!
        }
    }

}