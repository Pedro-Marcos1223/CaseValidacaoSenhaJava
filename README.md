# CaseValidacaoSenhaJava
#### Essa case foi desenvolvida para atender a solução de validar se uma senha está dentro do parametro esperado ou se não está.
<br> 

## Como usar:
Você ira utilizar um cliente de api (Postman, Insomnia, ...) para poder acessar a API. 
<br> 
Acessando o caminho `http://localhost:8080/validar-senha`, você irá utilizar esse esquema de json no body da requisição: 

``` 
{
    "password": "sua_senha"
}
```

#### As senhas só serão validas se passarem nos seguintes requisistos:
- Possuir mais de 9 caracteres.
- Pelo menos um número.
- Pelo menos uma letra maiúscula.
- Pelo menos uma letra minúscula.
- Pelo menos um caracter especial (!@#$%^&*()-+).
- Não possuir espaços em branco.
- E não repetir caracteres.
