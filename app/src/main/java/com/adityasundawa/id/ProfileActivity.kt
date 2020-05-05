package com.adityasundawa.id
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*
class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        ambilData()
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
