package com.matek.chatterglob.controllers;

import com.matek.chatterglob.models.Message;
import com.matek.chatterglob.models.view.MessageView;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mateusz on 02.06.2017.
 */
@RestController
@RequestMapping(name = "/messages")
public class MessagesController {

    @MessageMapping("/ws/chat")
    @SendTo
    public MessageView sendMessage(@DestinationVariable("id") long id,
                                   Message message) throws Exception {
        return new MessageView();
    }

}
