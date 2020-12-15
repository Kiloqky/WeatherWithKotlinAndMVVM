package ru.kiloqky.weather.rest.openWeatherMap.entitiesOpenWeather

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class WindRestModel : Serializable {
    @SerializedName("speed")
    var speed = 0f

    @SerializedName("deg")
    var deg = 0f
}