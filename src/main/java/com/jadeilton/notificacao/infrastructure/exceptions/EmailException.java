package com.jadeilton.notificacao.infrastructure.exceptions;

public class EmailException extends RuntimeException{



    public EmailException(String messagem){
        super(messagem);
    }


    public EmailException(String mensagem, Throwable throwable){


        super(mensagem, throwable);
    }
}
