package vn.edu.iuh.fit.backend.resources.dto;

import lombok.*;

import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class UserDTO {
    private Long id;
    private String email;
    private String firstName;
    private String intro;
    private Instant lastLogin;
    private String lastName;
    private String middleName;
    private String mobile;
    private String password;
    private String profile;
    private Instant registeredAt;
}
