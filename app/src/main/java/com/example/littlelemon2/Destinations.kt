package com.example.littlelemon2

interface Destinations {
    val route : String
}

object DashBoard : Destinations{
    override val route = "Home"
}

object Details : Destinations{
    override val route = "Details"
}

object Additional : Destinations{
    override val route = "Additional"
}