package com.example.project0213postservice.user.controller.request

data class SignUpRequest (
    val email: String,
    val password: String,
    val name: String,
)