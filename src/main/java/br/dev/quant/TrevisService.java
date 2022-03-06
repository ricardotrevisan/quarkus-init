package br.dev.quant;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TrevisService {
    public String message(String message){
        System.out.println("message: " + message);
        return "Message: " + message;
    }
}
