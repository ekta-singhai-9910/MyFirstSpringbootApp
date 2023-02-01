package com.blogrestapi.demo.controller;

import com.blogrestapi.demo.payload.JWTAuthResponse;
import com.blogrestapi.demo.payload.LoginDto;
import com.blogrestapi.demo.payload.RegisterDto;
import com.blogrestapi.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    @Autowired
    private AuthService authService ;

//    @PostMapping(value = {"/login", "/signin"})
//    public ResponseEntity<JWTAuthResponse> login(@RequestBody LoginDto loginDto){
//        System.out.println("logging in");
//        String token = authService.login(loginDto) ;
//        JWTAuthResponse jwtAuthResponse = new JWTAuthResponse() ;
//        jwtAuthResponse.setAccessToken(token);
//        return  ResponseEntity.ok(jwtAuthResponse) ;
//    }

    @PostMapping(value = {"/register", "/signup"})
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto){
        String response = authService.register(registerDto);
        return ResponseEntity.ok(response) ;
    }
}
