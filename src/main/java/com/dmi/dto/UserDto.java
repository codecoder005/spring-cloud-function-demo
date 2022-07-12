package com.dmi.dto;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class UserDto implements Serializable {
    private static final long serialVersionUID = -68497940754667710L;
    private String userId;
    private String email;
    private String fullName;
}
