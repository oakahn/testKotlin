package com.example.firstapp.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapp.R
import com.example.firstapp.home.HomeActivity
import kotlinx.android.synthetic.main.activity_main.*

interface MainActivityInterface {
    fun getDataSuccess(text: MainModel)
}

class MainActivity : AppCompatActivity(), MainActivityInterface {

    private var presenter: MainActivityPresenter = MainActivityPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.mockData()
        setupBuilder()
    }

    private fun setupBuilder() {
        button.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    override fun getDataSuccess(model: MainModel) {
        showText.text = model.firstName
    }
}