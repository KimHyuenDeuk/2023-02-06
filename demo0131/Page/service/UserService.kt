package com.example.demo0131.Page.service

import com.example.demo0131.Page.dto.SignUpRequest
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor

interface UserService
fun signUp(result: SignUpRequest) : UserResponse
fun signUp(result: SignUpRequest): UserResponse


