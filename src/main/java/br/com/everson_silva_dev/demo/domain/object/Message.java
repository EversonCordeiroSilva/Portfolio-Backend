package br.com.everson_silva_dev.demo.domain.object;

import lombok.Data;

@Data
public class Message {
    private String nome;
    private String titulo;
    private String message;
    private String email;
    private String dateTime;

}
