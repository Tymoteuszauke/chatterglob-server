package com.matek.chatterglob.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Mateusz on 02.06.2017.
 */
@Data
@Entity
@Table(name = "c_users")
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "mail")
    private String mail;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<Message> messages;
}
