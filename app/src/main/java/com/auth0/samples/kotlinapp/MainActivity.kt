package com.auth0.samples.kotlinapp

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.android.volley.toolbox.Volley
import com.auth0.samples.kotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val queue = Volley.newRequestQueue(this)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding?.loggedIn = false

        val listView = findViewById<ListView>(R.id.list_todo)

        getItems(this, queue, listView)

        val loginButton = findViewById(R.id.login_button)
        loginButton.setOnClickListener { login() }
    }

    private fun login() {

    }
}
