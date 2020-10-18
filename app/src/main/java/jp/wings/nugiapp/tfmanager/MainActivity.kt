package jp.wings.nugiapp.tfmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar)

        val calendarView = findViewById<CalendarView>(R.id.calendar)

        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            val date = "$year/$month/$dayOfMonth"
            Toast.makeText(this, date, Toast.LENGTH_SHORT).show()

            val intent = Intent(applicationContext, ItemListActivity::class.java)
            startActivity(intent)
        }

    }


}
