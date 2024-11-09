package vn.edu.iuh.fit.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.backend.models.entities.PostComment;
import vn.edu.iuh.fit.backend.services.PostCommentService;

import java.util.List;

@RestController
@RequestMapping("/api/post-comments")
public class PostCommentResource {
    @Autowired
    private PostCommentService postCommentService;
    @GetMapping("")
    public ResponseEntity<List<PostComment>> getAllPostComments() {
        return ResponseEntity.ok(postCommentService.getAllPostComments());
    }
    @GetMapping("/{id}")
    public ResponseEntity<PostComment> getPostCommentById(@PathVariable Long id) {
        return ResponseEntity.ok(postCommentService.getPostCommentById(id));
    }
}
