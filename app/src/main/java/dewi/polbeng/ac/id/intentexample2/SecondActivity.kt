package dewi.polbeng.ac.id.intentexample2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dewi.polbeng.ac.id.intentexample2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val receiveData = intent.getStringExtra("main_activity_data")
        binding.textView.text = receiveData
    }
    }