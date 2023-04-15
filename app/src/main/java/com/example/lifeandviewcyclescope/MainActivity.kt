package com.example.lifeandviewcyclescope
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    lateinit var buttonSecond: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

           buttonSecond = findViewById(R.id.buttonSecond)
           buttonSecond.setOnClickListener {
               lifecycleScope.launch{
                   delay(2000)
                   startActivity(Intent(this@MainActivity,SecondActivity::class.java))
                   finish()
               }
           }
    }
}