package io.zulu.webapi.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Player {
    private Long id;
    @NotNull(message = "UserName can't be null")
    private String userName;
    @NotNull(message = "Password can't be null")
    private String password;
    @Email(message = "The email need to have a valid format xyz@domain.com")
    @NotNull(message = "Email can't be null")
    private String email;
    private String avatar;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd--MM-yyyy hh:mm:ss")
    private LocalDateTime lastLoginDate;
}
