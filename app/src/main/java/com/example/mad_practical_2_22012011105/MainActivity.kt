package com.example.mad_practical_2_22012011105

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG = "MAIN_ACTIVITY"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val text = findViewById<TextView>(R.id.text_hello)
        showMessage("onCreate method is called")

    }
    fun showMessage(msg : String){
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
    fun showtext(msg: String) {
        Log.i(TAG, msg)
        val rootView = findViewById<TextView>(R.id.text_hello) // You can use a root view instead of TextView

        Snackbar.make(rootView, msg, Snackbar.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart Method is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause method is called")
    }

    override fun onResume() {
        super.onResume()
        showtext("onResume method is called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop method is called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onStop method is called")
    }


    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy method is called")
    }
}