package com.example.controller;

import com.example.model.ResultadoValidacao;
import com.example.service.ValidarSenhaService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@RestController

public class ValidarSenhaController {

    @Autowired
    private ValidarSenhaService validarSenhaService;

    /*
        A API retorna HTTPSTATUS.BADREQUEST (400) para senhas invalidas. E com isso ela trás também a resposta que
        a função retorna, do por que está invalida a senha.
        Caso a API receba uma senha valida, ela ira retornar HTTPSTATUS.OK (200).
     */
    @PostMapping("/validar-senha")
    public ResponseEntity<ResultadoValidacao> validarSenha(@RequestBody Map<String, String> requestBody) {
        String senha = requestBody.get("password");
        ResultadoValidacao resultado = validarSenhaService.validarSenha(senha);

        if (!resultado.isValid()) {
            return ResponseEntity.badRequest().body(resultado);
        }

        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/teste")
    public String teste(){
        return "Está funcionando";
    }
}
