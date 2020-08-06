package com.example.todolist.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.util.Map;

@Controller
public class GreetingController {
  @MessageMapping("/hello")
  @SendTo("/topic/greetings")
  public Map<String, String> greeting(@Payload Map<String, String> message) throws Exception {
    Thread.sleep(1000); // simulated delay
    message.put("timestamp", Long.toString(System.currentTimeMillis()));
    return message;
  }

}
