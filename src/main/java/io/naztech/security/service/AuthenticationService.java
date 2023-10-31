package io.naztech.security.service;

import io.naztech.security.dto.request.SignInRequest;
import io.naztech.security.dto.request.SignUpRequest;
import io.naztech.security.dto.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);
    JwtAuthenticationResponse signin(SignInRequest request);
}
