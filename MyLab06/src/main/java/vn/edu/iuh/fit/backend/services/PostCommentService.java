package vn.edu.iuh.fit.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.models.entities.PostComment;
import vn.edu.iuh.fit.backend.repositories.PostCommentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostCommentService {
    @Autowired
    private PostCommentRepository postCommentRepository;
    public List<PostComment> getAllPostComments() {
        return postCommentRepository.findAll();
    }
    public PostComment getPostCommentById(Long id) {
        return postCommentRepository.findById(id).orElse(null);
    }
    public Optional<PostComment> addPostComment(PostComment postComment) {
        return Optional.of(postCommentRepository.save(postComment));
    }
}
