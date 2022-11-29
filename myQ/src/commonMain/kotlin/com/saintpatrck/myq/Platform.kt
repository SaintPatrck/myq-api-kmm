package com.saintpatrck.myq

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform