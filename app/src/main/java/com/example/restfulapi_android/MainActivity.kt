package com.example.restfulapi_android

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText.setOnClickListener{
            var textId = editText.text.toString()
            var textPw = editText2.text.toString()

            var dialog = AlertDialog.Builder(this)
            dialog.setTitle("알람!")
            dialog.setMessage("id= " + textId +" pw = " + textPw)
            dialog.show()
        }
    }
}

