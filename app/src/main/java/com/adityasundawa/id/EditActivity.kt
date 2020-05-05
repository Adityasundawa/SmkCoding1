package com.adityasundawa.id

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit.*
import kotlinx.android.synthetic.main.activity_profile.*
class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        val intentData = intent.extras
        val namaPengguna = intentData?.getString("nama")

        edt_nama.setText(namaPengguna)
        btn_simpann.setOnClickListener{ saveData()}
    }
    private fun saveData() {
        val edit = edt_nama.text.toString()
        if(!edit.isEmpty()) {
            val result = Intent()
            result.putExtra("nama", edit)
            setResult(Activity.RESULT_OK, result)
        } else {
            setResult(Activity.RESULT_CANCELED)
        }
        finish()
    }
}
