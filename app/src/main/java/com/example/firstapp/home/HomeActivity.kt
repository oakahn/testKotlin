package com.example.firstapp.home

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.firstapp.R

interface HomeActivityInterface {

}

class HomeActivity: AppCompatActivity(), HomeActivityInterface {

    val presenter: HomePresenter = HomePresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }
}