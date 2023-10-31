package io.naztech.security.controller;


import io.naztech.security.model.User;
import io.naztech.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/resource")
@RequiredArgsConstructor
public class AuthorizationController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello");
    }

    @PostMapping("/get-info")
    public ResponseEntity<?> userInfo(@RequestBody User user ) {
        User usr = this.userRepository.findByEmail(user.getEmail()).get();
        return ResponseEntity.ok(usr);
    }
}
