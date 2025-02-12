package br.com.everson_silva_dev.demo.services.port;

public interface MessagePort {
    void post(String nome, String titulo, String message, String email, String dateTime);
}
