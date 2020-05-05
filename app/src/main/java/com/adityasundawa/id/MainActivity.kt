package com.adityasundawa.id
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var namaInput : String = ""
    private var emailInput : String = ""
    private var telpInput : String = ""
    private var alamatInput : String = ""
    private var genderInput : String = ""
    private var umurInput : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSimpan.setOnClickListener { goProfileActivity() }
    }
    private fun goProfileActivity() {
//        dalam variabel yang telah dibuat
        namaInput = edit_nama.text.toString()
        emailInput = edit_email.text.toString()
        telpInput = edit_telpon.text.toString()
        alamatInput = edit_alamat.text.toString()
        umurInput = edit_umur.text.toString()
        genderInput = spinner_gender.selectedItem.toString()
        when{
            namaInput.isEmpty() -> edit_nama.error = "Nama tidak boleh kosong"
            genderInput.equals("Pilih Jenis Kelamin", ignoreCase = true) -> tampilToast("Jenis Kelamin harus dipilih")
            emailInput.isEmpty() -> edit_email.error = "Email tidak boleh kosong"
            umurInput.isEmpty() -> edit_umur.error = "Umur Tidak Boleh Kosong"
            telpInput.isEmpty() -> edit_telpon.error = "Telp tidak boleh kosong"
            alamatInput.isEmpty() -> edit_alamat.error = "Alamat tidak boleh kosong"
            else -> {
                goToProfilActivity()
                tampilToast("Navigasi ke halaman profil")
                goToProfilActivity()
            }
        }
    }

    private fun tampilToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    private fun goToProfilActivity() {
        val intent = Intent(this, ProfileActivity::class.java)
        val bundle = Bundle()

        bundle.putString("nama", namaInput)
        bundle.putString("umur", umurInput)
        bundle.putString("gender", genderInput)
        bundle.putString("email", emailInput)
        bundle.putString("telp", telpInput)
        bundle.putString("alamat", alamatInput)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
