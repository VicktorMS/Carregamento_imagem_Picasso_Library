package br.pro.moraes.carregarimagensapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Função chamada dentro do XML, ao clicar no botão executa essa função.
    fun callLoadImage(view: View){
        val iv: ImageView = findViewById<ImageView>(R.id.iv_logo)
        Picasso.get().load("https://d27i7n2isjbnbi.cloudfront.net/sites/" +
                "14698/normal_share_image_1517944041.jpg").into(iv)
    }
}