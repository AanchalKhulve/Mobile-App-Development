package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod
import android.view.Menu
import android.view.MenuItem
import android.content.Context
import android.support.v7.widget.AppCompatTextView
import android.widget.Button
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenActivity1 : Button = findViewById<Button>(R.id.button1)
        btnOpenActivity1.setOnClickListener {
            val intent = Intent(this, DetailActivity1::class.java)
            startActivity(intent)
        }

        val btnOpenActivity2 : Button = findViewById(R.id.button2)
        btnOpenActivity2.setOnClickListener {
            val intent = Intent(this, DetailActivity2::class.java)
            startActivity(intent)
        }

        val btnOpenActivity3 : Button = findViewById(R.id.button3)
        btnOpenActivity3.setOnClickListener {
            val intent = Intent(this, DetailActivity3::class.java)
            startActivity(intent)
        }

        val btnOpenActivity4 : Button = findViewById(R.id.button4)
        btnOpenActivity4.setOnClickListener {
            val intent = Intent(this, DetailActivity4::class.java)
            startActivity(intent)
        }

        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {
        val intent = Intent(this,DetailContactMe::class.java)
        startActivity(intent)}

        //val textViewHyperlink = findViewById<TextView>(R.id.textView2)
        //textViewHyperlink.setOnClickListener {
            //textViewHyperlink.movementMethod = LinkMovementMethod.getInstance()
        //}
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
