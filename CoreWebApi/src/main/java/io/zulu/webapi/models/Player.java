package io.zulu.webapi.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Player {
    private Long id;
    private String userName;
    private String password;
    private String email;
    private String avatar;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd--MM-yyyy hh:mm:ss")
    private LocalDateTime lastLoginDate;
}
