package com.adityasundawa.id
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_profile.*
class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        ambilData()
        edit.setOnClickListener { menujuEditProfil() }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                val result = data?.getStringExtra ("nama")
                text_nama.text = result
            } else {
                Toast.makeText (this, "Edit Gagal", Toast.LENGTH_SHORT) .show()
            }
        }
    }
    companion object {
        val REQUEST_CODE = 100
    }

    private fun menujuEditProfil() {
        val intent = Intent (this, EditActivity::class.java)
        val namaPengguna = text_nama.text.toString()
        intent.putExtra("nama", namaPengguna)
        startActivityForResult(intent, REQUEST_CODE)
    }

    private fun ambilData() {
        val bundle = intent.extras
        val nama = bundle?.getString("nama")
        val gender = bundle?.getString( "gender")
        val email = bundle?.getString( "email")
        val telp = bundle?.getString( "telp")
        val alamat = bundle?.getString( "alamat")
        val umur = bundle?.getString("umur")
        text_nama.text = nama
        text_gender.text = gender
        text_email.text = email
        text_telpon.text = telp
        text_alamat.text = alamat
        text_umur.text = umur
    }
}
