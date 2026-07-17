package com.example.novapay.auth;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/auth")

public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public String register(
            @RequestBody @Valid RegisterRequest request
    ) {
        return authService.register(request);
    }
    @PostMapping("/login")
    public AuthResponse login(
            @RequestBody @Valid LoginRequest request
    ) {
        return authService.login(request);
    }
}
