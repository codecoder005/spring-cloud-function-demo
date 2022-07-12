package com.dmi.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Entity
@Table(
        name = "users"
)
public class UserEntity {
    @Id
    private String uid;
    private String firstName;
    private String lastName;
    private String email;
}
