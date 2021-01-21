package com.gloriesstudio.AD340_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zipcodeEditText: EditText = findViewById(R.id.zipcodeEditText)
        val enterButton: Button = findViewById(R.id.enterButton)

        enterButton.setOnClickListener {
            val zipcode: String = zipcodeEditText.text.toString()
            if(zipcode.length != 5){
                /*Toast.makeText(this, "Zipcode Invalid", Toast.LENGTH_SHORT).show()*/
                Toast.makeText(this, R.string.invalid_zipcode, Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, zipcode, Toast.LENGTH_SHORT).show()
            }
        }
    }

    // region setup methods

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    // endregion setup methods


    // region teardown methods

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    // endregion teardown methods
}