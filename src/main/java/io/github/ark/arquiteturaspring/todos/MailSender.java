package io.github.ark.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class MailSender {

    public void enviar(String mensagem){
        System.out.println("Enviado email: " + mensagem);
    }
}
