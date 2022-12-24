package com.uzb7.imo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uzb7.imo.R
import com.uzb7.imo.adapter.ImoAdapter
import com.uzb7.imo.model.Imo

class MainActivity : AppCompatActivity() {
    lateinit var list:ArrayList<Imo>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initVIews()
    }

    private fun initVIews() {
        list=LoadList()
        val rvImo=findViewById<RecyclerView>(R.id.rv_imo)
        val imoAdapter=ImoAdapter(list)
        val layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvImo.adapter=imoAdapter
        rvImo.layoutManager=layoutManager

    }

    private fun LoadList(): ArrayList<Imo> {
        val mylist=ArrayList<Imo>()
        mylist.add(Imo(
            "https://avatars.mds.yandex.net/i?id=2cbb8b05e22a3c404bc48ec66aac1fdaca8ee9d0-8187788-images-thumbs&n=13",
            true,
            "Madirimov Mansurbek",
            "Assalomu alaykum",
            "now"
        ))
        return mylist
    }
}