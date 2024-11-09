package vn.edu.iuh.fit.backend.resources.dto;

import lombok.*;

import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PostDTO {
    private Long id;
    private String content;
    private Instant createdAt;
    private String metaTitle;
    private boolean published;
    private Instant publishedAt;
    private String summary;
    private String title;
    private Instant updatedAt;
    private Long authorId;
    private Long parentId;
}
