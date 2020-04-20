package com.yeuristic.daggerplayground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yeuristic.flight.FlightActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonFlight.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v) {
            buttonFlight -> Intent(this, FlightActivity::class.java).let {
                startActivity(it)
            }
        }
    }
}
