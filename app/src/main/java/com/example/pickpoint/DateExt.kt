package com.example.pickpoint

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
fun LocalDateTime.formatDateAndTimeToBr(): String? {
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:SSS")
    return this.format(formatter)
}