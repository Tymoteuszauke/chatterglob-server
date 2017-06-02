package com.matek.chatterglob.models.view;

import com.matek.chatterglob.models.Message;
import lombok.Data;

import java.util.Date;

/**
 * Created by Mateusz on 02.06.2017.
 */
@Data
public class MessageView {
    private String message;
    private String userName;
    private Date date;
    private String time;

    public static MessageView fromMessage(Message message) {
        MessageView messageView = new MessageView();
        messageView.setMessage(message.getMessage());
        messageView.setUserName(message.getUser().getUserName());
        messageView.setDate(new Date());

        return messageView;
    }
}
