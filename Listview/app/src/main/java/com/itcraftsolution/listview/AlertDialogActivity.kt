package com.itcraftsolution.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class AlertDialogActivity : AppCompatActivity() {
    private lateinit var alertDialog: AlertDialog
    private lateinit var btnDialog: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        btnDialog = findViewById(R.id.btnExitDialog)

        btnDialog.setOnClickListener {
            var alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("Exit App")
                .setMessage("Are want to sure to Exit this App?")
                .setPositiveButton("Yes"){dialog, which ->
                    finish()
                }
                .setNegativeButton("No"){dialog, which ->

                }

            val alertDialog : AlertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }

    }
}