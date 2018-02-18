package org.turkisi.jug.training.websocketserver.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.turkisi.jug.training.websocketserver.message.ChatMessage;

/**
 * @author Gökalp Gürbüzer (gokalp.gurbuzer@yandex.com)
 */
@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/rooms/general")
    public ChatMessage chat(ChatMessage chatMessage) {

        return chatMessage;
    }
}
