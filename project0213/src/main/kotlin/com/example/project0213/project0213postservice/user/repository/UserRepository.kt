package com.example.project0213postservice.user.repository

import com.example.sessionpostservice.user.repository.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findByEmail(email: String): User?
}