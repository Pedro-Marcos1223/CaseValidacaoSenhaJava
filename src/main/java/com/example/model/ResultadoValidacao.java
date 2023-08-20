package com.example.model;

public class ResultadoValidacao {

    private boolean isValid;
    private String mensagem;

    public ResultadoValidacao(boolean isValid, String mensagem) {
        this.isValid = isValid;
        this.mensagem = mensagem;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getMensagem() {
        return mensagem;
    }
}
