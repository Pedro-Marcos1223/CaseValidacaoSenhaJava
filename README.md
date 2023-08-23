# CaseValidacaoSenhaJava
#### Essa case foi desenvolvida para atender a solução de validar se uma senha está dentro do parametro esperado ou se não está.
<br> 

## Pré requesitos:
- JDK 20
- Alguma IDE para facilitar a inicialização do código
<br> 

## Como usar:
Você ira utilizar um cliente de api (Postman, Insomnia, ...) para poder acessar a API. 
<br> 
Acessando o caminho `http://localhost:8080/validar-senha`, você irá utilizar o método HTTP POST e esse esquema de json no body da requisição: 

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


## Retorno da API:
Caso a Api receba uma senha invalida ela irá retornar um `Bad_request (400)`, uma mensagem dizendo qual das regras não foi atendida e um boolean como false para `isValid`.
<br>
Agora, caso você tenha setado uma senha valida no body da requisição, ela ira retornar `OK (200)`, devolver uma mensagem dizendo que a senha é valida e um boolean como true em `isValid`.


