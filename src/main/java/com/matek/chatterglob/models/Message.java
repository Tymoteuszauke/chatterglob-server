package com.matek.chatterglob.models;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Mateusz on 02.06.2017.
 */
@Data
@Entity
@Table(name = "c_messages")
public class Message {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "message")
    private String message;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;

}
