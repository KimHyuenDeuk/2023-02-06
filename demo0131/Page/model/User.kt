package com.example.demo0131.Page.model

import jakarta.validation.constraints.Email

class User (
        @Column(name = "email")
        val email: String,

        @Column(name = "password")
        val password: String,

        @Column(name = "nickname")
        val nickname: String,
)