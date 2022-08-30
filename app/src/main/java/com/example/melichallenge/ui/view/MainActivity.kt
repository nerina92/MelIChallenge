package com.example.melichallenge.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.melichallenge.R


class MainActivity :  AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var searchBtn : Button = findViewById(R.id.search_btn)
        var searchTextField : EditText = findViewById(R.id.editTextSearch)
        searchBtn.setOnClickListener{
            var i = Intent(this, SearchDetailList::class.java)
            i.putExtra("search", searchTextField.text.toString())
            startActivity(i)
        }

    }
}