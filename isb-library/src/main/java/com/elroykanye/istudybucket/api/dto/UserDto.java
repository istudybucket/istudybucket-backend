package com.elroykanye.istudybucket.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("username")
    private String username;

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("dob")
    private LocalDateTime dob;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("user_role")
    private String userRole;

    @JsonProperty("created_date")
    private LocalDateTime createdDate;

    @JsonProperty("user_verified")
    private Boolean userVerified;
}
