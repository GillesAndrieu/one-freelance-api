package com.freelance.model.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Profile implements Serializable {

    String firstname;
    String lastname;
    String email;
    @Builder.Default
    List<String> roles = List.of();
    Boolean active;
    Instant createAt;
    Instant updateAt;
}
