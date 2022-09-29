package ni.edu.uca.recarga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ni.edu.uca.recarga.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val arrayList = ArrayList<Recarga>()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun init() {
        this.binding.btnAdd.setOnClickListener {
            this.addRecarga()
        }
    }
    private fun addRecarga() {
        try {
            val number = this.binding.etNumber.text.toString()
            val monto = this.binding.etMonto.text.toString().toDouble()

            val recarga = Recarga(number, monto)
            this.arrayList.add(recarga)
        } catch (ex: Exception) {
            Toast.makeText(this, "Error: ${ex}", Toast.LENGTH_SHORT).show()
        }

    }
}