package th.ac.su.phatchara.hypotenuse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = findViewById<EditText>(R.id.per)
        val b = findViewById<EditText>(R.id.per1)
        val Cal = findViewById<Button>(R.id.Calcu)
        val show = findViewById<TextView>(R.id.show)

        Cal.setOnClickListener() {
            var a: Double = a.text.toString().toDouble()
            var b: Double = b.text.toString().toDouble()
                var da = a * a
                var db = b * b
                var squareRoot = Math.sqrt(da + db)
                show.text = squareRoot.toString()

        }
    }
}