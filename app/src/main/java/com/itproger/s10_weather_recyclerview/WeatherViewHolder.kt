package com.itproger.s10_weather_recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.itproger.s10_weather_recyclerview.R.drawable.baseline_cloud_24
import com.itproger.s10_weather_recyclerview.R.drawable.baseline_wb_sunny_24

class WeatherViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val dayView: TextView
    private val cloudsView: ImageView
    private val temperatureView: TextView
    private val backgroundView: LinearLayout

    init {
        dayView = itemView.findViewById(R.id.day)
        cloudsView = itemView.findViewById(R.id.clouds)
        temperatureView=itemView.findViewById(R.id.temperature)
        backgroundView=itemView.findViewById(R.id.background)
    }
    fun bind(model:Weather) {
        dayView.text = model.day
       val cloudsIcon = if (model.clouds) {
            R.drawable.baseline_cloud_24
        } else {
           R.drawable.baseline_wb_sunny_24
        }
        cloudsView.setImageResource(cloudsIcon)


        val tempString = if(model.temperature<0) {
            "${model.temperature}°С"
        } else if (model.temperature>0){
            "${itemView.context.getString(R.string.plus)}${model.temperature}°С"
        } else{
            "${model.temperature}°С"
        }
        temperatureView.text = tempString

        val tempColor = if (model.temperature <-10) {
            R.color.blue
        } else if (model.temperature in -10..0) {
             R.color.green
        } else if (model.temperature in 1..10) {
            R.color.orange
        } else {
            R.color.yellow
        }
        backgroundView.setBackgroundColor(itemView.context.getColor(tempColor as Int))
    }
}

