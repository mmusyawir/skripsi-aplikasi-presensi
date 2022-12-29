package com.id.example.attendance.networking

object ApiServices {
    fun getLiveAttendanceServices(): LiveAttendanceApiServices {
        return RetrofitClient.getClient()
            .create(LiveAttendanceApiServices::class.java)
    }
}