package vn.edu.iuh.fit.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.backend.models.entities.PostComment;

@Repository
public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}
