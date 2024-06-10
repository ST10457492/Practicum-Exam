package com.example.practicumexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val weatherInfo = findViewById<TextView>(R.id.weatherInfo)

        val day = intent.getStringExtra("day")
        if (day != null && day.equals("monday", ignoreCase = true)) {
            val minTemp = 12
            val maxTemp = 25
            //a message will also display with the temperatures
            val message = "It's sunny"
            weatherInfo.text = "Day: $day\nMin Temp: $minTemp°C\nMax Temp: $maxTemp°C\n$message"

            val day = intent.getStringExtra("day")
            if (day != null && day.equals("tuesday", ignoreCase = true)) {
                val minTemp = 11
                val maxTemp = 20
                //a message will also display with the temperatures
                val message = "It's sunny"
                weatherInfo.text = "Day: $day\nMin Temp: $minTemp°C\nMax Temp: $maxTemp°C\n$message"

                val day = intent.getStringExtra("day")
                if (day != null && day.equals("wednesday", ignoreCase = true)) {
                    val minTemp = 12
                    val maxTemp = 2
                    //a message will also display with the temperatures
                    val message = "It's sunny"
                    weatherInfo.text =
                        "Day: $day\nMin Temp: $minTemp°C\nMax Temp: $maxTemp°C\n$message"

                    val day = intent.getStringExtra("day")
                    if (day != null && day.equals("thursday", ignoreCase = true)) {
                        val minTemp = 7
                        val maxTemp = 18
                        //a message will also display with the temperatures
                        val message = "It's sunny"
                        weatherInfo.text =
                            "Day: $day\nMin Temp: $minTemp°C\nMax Temp: $maxTemp°C\n$message"

                        val day = intent.getStringExtra("day")
                        if (day != null && day.equals("friday", ignoreCase = true)) {
                            val minTemp = 11
                            val maxTemp = 25
                            //a message will also display with the temperatures
                            val message = "It's sunny"
                            weatherInfo.text =
                                "Day: $day\nMin Temp: $minTemp°C\nMax Temp: $maxTemp°C\n$message"

                            val day = intent.getStringExtra("day")
                            if (day != null && day.equals("saturday", ignoreCase = true)) {
                                val minTemp = 14
                                val maxTemp = 30
                                //a message will also display with the temperatures
                                val message = "It's sunny"
                                weatherInfo.text =
                                    "Day: $day\nMin Temp: $minTemp°C\nMax Temp: $maxTemp°C\n$message"

                                val day = intent.getStringExtra("day")
                                if (day != null && day.equals("sunday", ignoreCase = true)) {
                                    val minTemp = 18
                                    val maxTemp = 34
                                    //a message will also display with the temperatures
                                    val message = "It's sunny"
                                    weatherInfo.text =
                                        "Day: $day\nMin Temp: $minTemp°C\nMax Temp: $maxTemp°C\n$message"
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
