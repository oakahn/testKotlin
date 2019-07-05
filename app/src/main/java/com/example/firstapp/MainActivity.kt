package com.example.firstapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

interface MainActivityInterface {
    fun getDataSuccess(text: MainModel)
}

class MainActivity : AppCompatActivity(), MainActivityInterface {

    var presenter: MainActivityPresenter = MainActivityPresenter(this)
//    val builder = AlertDialog.Builder(this@MainActivity)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.mockData()
        setupBuilder()
    }

    private fun setupBuilder() {
        button.setOnClickListener {
            val builder = AlertDialog.Builder(this@MainActivity)

            builder.setTitle("superman")

            builder.setPositiveButton("YES") { dialog, which ->
                Toast.makeText(applicationContext, "Ok, we change the app background.", Toast.LENGTH_SHORT).show()
            }


            builder.setNegativeButton("No") { dialog, which ->
                Toast.makeText(applicationContext, "You are not agree.", Toast.LENGTH_SHORT).show()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }

    override fun getDataSuccess(model: MainModel) {
        showText.text = model.firstname
    }
}