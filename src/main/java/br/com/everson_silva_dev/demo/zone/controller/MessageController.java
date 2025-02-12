package br.com.everson_silva_dev.demo.zone.controller;

import br.com.everson_silva_dev.demo.domain.services.MessageService;
import br.com.everson_silva_dev.demo.domain.object.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/post/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping("/create")
    public void create(@RequestBody Message request) {
        messageService.create(request.getNome(), request.getTitulo(), request.getMessage(), request.getEmail(), request.getDateTime());
    }
}