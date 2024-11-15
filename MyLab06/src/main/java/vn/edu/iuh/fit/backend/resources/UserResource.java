package vn.edu.iuh.fit.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.backend.models.entities.User;
import vn.edu.iuh.fit.backend.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userServices;

    @GetMapping("")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userServices.getAllUsers());
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById( @PathVariable Long id) {
        return ResponseEntity.ok(userServices.getUserById(id));
    }

}
