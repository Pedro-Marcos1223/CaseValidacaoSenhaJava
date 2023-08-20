package com.example.service;

import com.example.model.ResultadoValidacao;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.regex.Pattern;

@Service
public class ValidarSenhaService {


    public static ResultadoValidacao validarSenha(String senha) {
        int tamanhoSenha = senha.length();

        if (tamanhoSenha < 9) {
            return new ResultadoValidacao(false, "A senha deve possuir mais de 9 caracteres.");
        }

        if (!Pattern.compile("[0-9]").matcher(senha).find()) {
            return new ResultadoValidacao(false, "A senha deve possuir pelo menos um numero.");
        }

        if (!Pattern.compile("[A-Z]").matcher(senha).find()) {
            return new ResultadoValidacao(false, "A senha deve possuir pelo menos uma letra maiuscula");
        }

        if (!Pattern.compile("[a-z]").matcher(senha).find()) {
            return new ResultadoValidacao(false, "A senha deve possuir pelo menos uma letra minuscula");
        }

        if (!Pattern.compile("[!@#$%^&*()-+]").matcher(senha).find()) {
            return new ResultadoValidacao(false, "A senha deve possuir pelo menos um caracter especial (!@#$%^&*()-+).");
        }

        if (senha.contains(" ")) {
            return new ResultadoValidacao(false, "A senha não pode conter espaços em branco.");
        }

        HashSet<Character> uniqueChars = new HashSet<>();
        for (char c : senha.toCharArray()) {
            if (uniqueChars.contains(c)) {
                return new ResultadoValidacao(false, "A senha não pode repetir caracteres dentro do conjunto.");
            }
            uniqueChars.add(c);
        }

        return new ResultadoValidacao(true, "Senha valida.");
    }
}
