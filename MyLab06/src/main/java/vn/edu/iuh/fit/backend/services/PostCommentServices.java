package vn.edu.iuh.fit.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.models.entities.PostComment;
import vn.edu.iuh.fit.backend.repositories.PostCommentRepository;

import java.util.List;

@Service
public class PostCommentServices {
    @Autowired
    private PostCommentRepository postCommentRepository;
    public List<PostComment> getAllPostComments() {
        return postCommentRepository.findAll();
    }
}
