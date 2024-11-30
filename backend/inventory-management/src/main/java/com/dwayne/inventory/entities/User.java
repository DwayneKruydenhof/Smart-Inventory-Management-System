package com.dwayne.inventory.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor

@Table
public class User {


    private @Id @Setter(AccessLevel.PUBLIC) Long id;
    private String username;
    private String password;

    @ElementCollection
    private List<String> roles;

    public User(List<String> roles, String password, String username, long id) {
        this.roles = roles;
        this.password = password;
        this.username = username;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
