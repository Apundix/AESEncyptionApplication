package com.evan.encryptiondemotest

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.evan.encryptiondemotest.AES.Companion.AESDecryptionMethod
import com.evan.encryptiondemotest.AES.Companion.AESEncryptionMethod
import java.security.KeyStore
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import javax.crypto.spec.IvParameterSpec

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Encryption = findViewById<EditText>(R.id.Encryption)
        val New = findViewById<TextView>(R.id.New)
        val Decryption = findViewById<TextView>(R.id.Decryption)
        val Decryption2 = findViewById<TextView>(R.id.New)
        val Button = findViewById<Button>(R.id.Button)
        val Button2 = findViewById<Button>(R.id.Button2)
        val Button3 = findViewById<Button>(R.id.Button3)



        Button.setOnClickListener {

            val msg = Encryption.text.toString()
            val txtView = findViewById<TextView>(R.id.Decryption).apply {
                text = AESEncryptionMethod(msg)

            }


        }


        Button2.setOnClickListener {

            val msg = Decryption.text.toString()
            val txtView = findViewById<TextView>(R.id.New).apply {
                text = AESDecryptionMethod(msg)
            }
        }

        Button3.setOnClickListener {

            val msg = Encryption.text.toString()
            val txtView = findViewById<TextView>(R.id.Decryption).apply {
                text = AESDecryptionMethod(msg)

            }


        }
    }
}
