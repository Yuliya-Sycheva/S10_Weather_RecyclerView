package com.itproger.s10_weather_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WeatherAdapter(
    private val weather:List<Weather>
) : RecyclerView.Adapter<WeatherViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.weather_view, parent, false)
        return WeatherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return weather.size
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        holder.bind(weather[position])
    }
}