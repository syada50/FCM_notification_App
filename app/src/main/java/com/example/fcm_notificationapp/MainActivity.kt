package com.example.fcm_notificationapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fcm_notificationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var dataString: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        if (intent!=null){
            if (intent.hasExtra("key1")){
                for (key in intent.extras!!.keySet()){

                    dataString = dataString + intent.extras!!.getString(key)+"\n"
                    Log.d("myTag",key+intent.extras!!.getString(key))

                }

                binding.textView2.text=dataString
            }
        }

    }
}