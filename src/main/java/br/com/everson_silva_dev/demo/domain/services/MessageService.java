package br.com.everson_silva_dev.demo.domain.services;

import br.com.everson_silva_dev.demo.services.port.MessagePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public class MessageService {
    @Autowired
    private MessagePort messagePort;
    public void create(String nome, String titulo, String message, String email, String dateTime) {
        messagePort.post(nome, titulo, message, email, dateTime);
    }

    @GetMapping("/*")
    @PutMapping("/*")
    @PostMapping("/*")
    @PatchMapping("/*")
    @DeleteMapping("/*")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String defaultResponse() {
        return "Not Found! :(";
    }
}
