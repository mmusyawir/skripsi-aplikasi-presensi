package com.id.example.attendance.model

import com.google.gson.annotations.SerializedName

data class AttendanceResponse(

	@field:SerializedName("message")
	val message: String? = null
)
