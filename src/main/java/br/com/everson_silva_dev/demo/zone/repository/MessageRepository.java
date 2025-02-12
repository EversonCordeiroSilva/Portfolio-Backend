package br.com.everson_silva_dev.demo.zone.repository;

import br.com.everson_silva_dev.demo.domain.object.Message;
import br.com.everson_silva_dev.demo.services.port.MessagePort;

import java.util.HashMap;
import java.util.Map;

public class MessageRepository implements MessagePort {
    private final Map<Integer, Message> database = new HashMap<>();
    @Override
    public void post(String nome, String titulo, String msg, String email, String dateTime) {
        Message message = new Message();
        message.setNome(nome);
        message.setEmail(email);
        message.setTitulo(titulo);
        message.setMessage(msg);
        message.setDateTime(dateTime);
        database.put(database.size()+1,message);
    }
}
