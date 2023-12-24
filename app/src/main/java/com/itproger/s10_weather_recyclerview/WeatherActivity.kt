package com.itproger.s10_weather_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WeatherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val recycler = findViewById<RecyclerView>(R.id.weatherList)
        val weatherList = listOf(
            Weather("Пн", true, -23),
            Weather("Вт", true, -20),
            Weather("Ср", false, -15),
            Weather("Чт", true, -3),
            Weather("Пт", false, 0),
            Weather("Сб", true, 5),
            Weather("Вс", false, 10)
        )

       // recycler.layoutManager = LinearLayoutManager(this)

        recycler.adapter = WeatherAdapter(weatherList)
    }
}
