package com.example.demo0131.Page.controller

import com.example.demo0131.Page.dto.SignUpRequest
import com.example.demo0131.Page.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/users")
@RestController
class Usercontroller {
    private val UserSerivce : UserService

    class UserController(
            val userService: UserService
    ){
        @PostMapping("/signUp")
        fun signUp(@RequestBody signUpRequest: SignUpRequest ) : ResponseEntity{
            return ResponseEntity.status(HttpStatus.OK).body(userService.signUp(signUpRequest))
        }
    }
}