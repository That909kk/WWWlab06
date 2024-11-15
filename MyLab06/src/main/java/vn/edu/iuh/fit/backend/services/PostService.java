package vn.edu.iuh.fit.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.models.entities.Post;
import vn.edu.iuh.fit.backend.repositories.PostRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }
    public Optional<Post> addPost(Post post) {
        return Optional.of(postRepository.save(post));
    }


}
