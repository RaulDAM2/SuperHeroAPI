package campalans.m8.superheroapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSuperhero = findViewById<Button>(R.id.btnSuperhero)

        btnSuperhero.setOnClickListener { navigateToSuperheroApp() }

    }
    private fun navigateToSuperheroApp(){
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }
}

