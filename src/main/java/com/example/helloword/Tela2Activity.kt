package com.example.helloword

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class Tela2Activity : AppCompatActivity() {

    private val TAG = "Tela2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_2)

        val intent = intent
        val membro = intent.getStringArrayListExtra("membros")
        if (membro != null) {
            val listaDeMembros: ListView = findViewById(R.id.lista_membros)
            val adapter: ArrayAdapter<String> =
                ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, membro)
            listaDeMembros.adapter = adapter
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy()")
    }
}