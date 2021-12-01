# BlueBank - Projeto Final PanAcademy


## Tópicos

* [O Projeto](#O-Projeto)
* [Desenvolvedores](#Desenvolvedores)
* [Transformadores da Gama Academy](#Transformadores-da-Gama-Academy)
* [Diagrama de Classes](#Diagrama-de-Classes)
* [Gerência do Projeto](#Gerência-do-Projeto)
* [Endpoints](#Endpoints)
* [Patrocinadores](#Patrocinadores)


## O Projeto

Desenvolver uma aplicação de um banco fictício BlueBank. O sistema deve gerenciar as transações e cadastros de clientes, permitindo incluir os dados pessoais e de contato. No sistema o cliente vai ser atrelado a uma conta bancária e registrar histórico de transações entre contas. Software desenvolvido conforme os requisitos descritos no documento do projeto final [Projeto Final PanAcademy.](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/doc/banco_pan_desafio_final_bluebank.pdf)


## Desenvolvedores

Projeto desenvolvido pelo grupo 2 - Squad Undefined Coders 


<table>
  <tr>
    <td align="center"><a href="https://github.com/CarmoPJunior"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/CarmoPJunior" width="100px;" alt=""/><br /><sub><b>Carmo Júnior</b></sub></a><br /><a href="https://github.com/CarmoPJunior" title="Carmo Júnior"></a></td>
    <td align="center"><a href="https://github.com/felipecandidoo"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/felipecandidoo" width="100px;" alt=""/><br /><sub><b>Felipe Cândido</b></sub></a><br /><a href="https://github.com/felipecandidoo" title="Felipe Cândido"></a></td>
    <td align="center"><a href="https://github.com/zecarlos558"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/zecarlos558" width="100px;" alt=""/><br /><sub><b>José Carlos</b></sub></a><br /><a href="https://github.com/hellomp" title="José Carlos"></a></td>
    <td align="center"><a href="https://github.com/tiagodalmeida87"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/tiagodalmeida87" width="100px;" alt=""/><br /><sub><b>Tiago Almeida</b></sub></a><br /><a href="https://github.com/tiagodalmeida87" title="Tiago Almeida"></a></td>
  </tr>
</table>


## Transformadores da Gama Academy

- [Ana Verônica](https://www.linkedin.com/in/ana-ver%C3%B4nica-nascimento-cruz-1896a0158/)
- [Jennifer Plácido](https://www.linkedin.com/in/jenifer-pl%C3%A1cido-00b5611ab/)
- [Jonathan Ferreira](https://www.linkedin.com/in/jferreira33/)



## Modelagem do Software

O sistema foi representado de forma visual sua estrutura a partir do modelo de Diagrama de Classes, o qual foi dividido entre as camadas do MVC as classes a serem implementadas, facilitando a divisão de tarefas entre os membros da equipe.

### Diagrama de Classes

![Diagrama de Classes](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/Diagrama_de_Classes_BlueBank_Squad2.png)

###### Link Diagrama de Classes: [Diagrama de Classes - Blue Bank](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1#R7V1td9soFv41OSf7ITl6t%2F0xdrKdbtNOp2l3Z%2FtlD7GIrVY2riyn8fz6BQn0xpUsJ2A7Hc6ZaSxAMuI%2BXB4eLvjMnSye3iRoNX9PQhyfOVb4dOZenzmOMxyO6B%2BWss1TXGvg5ymzJArzNLtMuIv%2BwjzR4qmbKMTrWsGUkDiNVvXEKVku8TStpaEkIT%2FrxR5IXP%2FWFZphKeFuimI59T9RmM7z1KEzKNN%2Fw9FsLr7ZDvgbL5AozN9kPUch%2BVlJcm%2FO3ElCSJp%2FWjxNcMxaT7RLft8%2FW3KLiiV4mfa54cP9h9%2FXX73%2Fuf9Cwdtv%2F44%2Bjm82F%2Fwpjyje8BfmlU23ogVwSBuEX5IknZMZWaL4pkwdJ2SzDDH7GotelWVuCVnRRJsmfsNpuuXWRZuU0KR5uoh5rvwqvF5rskmmvB4%2Fgjn%2BOiS%2Fb8c%2F0O0fk%2Fdf0ae1qH%2BKkhlOO8oJe7GXqXwDb6k3mCxwmmxpgQTHKI0e69ZHHESzohy%2F9SpJ0LZSYEWiZbquPPkjS6AFRIewOBh4d7iw7UHDavveQT%2FktRBXldcpkzIswLjoatcaLoKYtvD4gWTVKwES%2FNgQkXGxzkx8RQtQez6VmfTTjP1d5B4ifxStWf60PE9CHu0xK%2FaRdVqc8K8QUGS4Wa%2FQNFrOPucwY%2BBL0b3oph6%2FLrqn7eUJH8k6SiOypEkxfkh7QvERJyl%2B6sQOz73wR02b%2BcIJ%2FCx9SBDwtHnFf4xEQQhyFZPvb9FX1rHdnh3bVt6xX9TKrtRvpnFEXx7L4P4ZLWK0xACsURzNGDqn7EaGe4a9iI5JVzwjZc0%2Fns6jOLxFW7JhDbRO0fS7uBrPSRL9RR%2BLhCVodpJyOzlBrcQdu5PbOMGsB38UBrMbSe%2FRU63gLVqnPGFK4hit1tF98RoLartoOSZpSha8kJLeZduN3uWN5N5lj4De5WjrXZ5k9wt%2BC%2FOFmUcPzhw381EsZ0m%2Fl%2F7Js9dpQr1Yo8R09dBdANOumeCziXt2NSB5uXpSvXiIUnSNP6D1NFrQ1iddX81gIUrcRutUOGyRUThs%2Bbb8pkn2scyW0E%2BNnWaoTMh3PCExoTC%2FXpK8O0Rx3EgSPYL7a7g%2F8NHgNitz7ZUpnzgCWBKh9z7EGQ%2BbR2GIl5mbo2%2BFcuCy2vJRnFbUH9P%2FKGYm1qV%2F5tOKT%2Bi1XV7T%2F1jxJKUvTN8FRRmsMe0VP%2FE6BQHf6TZ29wIOeta0fRBvu54mxPu7mWMcZcbLjSyGZftZFl5QW2VDUm3Iv7Als7uy2V3AxDG6x3GFCCR52Ybpj2VdO%2Bjp0Gxd%2FiwArDtm0zE63OOEMtwALbI%2Bl1%2Bf%2F6PW2ce5C6BttpmmJAFyf0Pr%2BYRyweJBNz82KM6eYzyFWiwNemLJ14WlgYSlxjhlmJEaZmSPgiYzghwJNO8oppnKrT%2FckxlF4YQz5pYCMZklKKTzh04KE4UoxF3siZo97HrCcrPA4ivkSkzxyniqbk816I3fDk4DYdXWNuqNDKfRZl3b7WneoSbjCtQYTvPqPYXtef2w5Ae6wCQLpMXk2NAZXXTG8XrSmSJRveEd1XwmJxrX%2BDOm%2FTvr8O2kZYGiuJ5vPEunOtwfdXuSkIEuXcWWJWRDQpSZ17Z6ehBtLERWig0LeaW%2BwraGPWmIowtNvmTVA6zq0XZMtn%2Fy%2B7OL%2F7KLSzdwRML1UzX7elu9%2BoiTiL4%2BIzzdXGHnIiHvSzsXCbmZjrz4f%2BEIKa4gNO7Iq2LgGbdoWv4PjoKrpyjNYHU58hx%2BzZBlX9KOll%2BWuGIX28qFOlQFPVElHIZiWMkgsAfNFU%2FLbfDbvLL8xhIde0PUdZ3GVwmHBuINAmyzroUALSqRG0CqqzLsynpzvjJpJmaKJmaeFN9iuwCt8iGdWdsqg61caE6jFZmUa9rlJTR%2FqxSUn4RmeDmNWrPXKBZSdEg2zHz1%2FHm0plwvmpLPCVqu5WX5lCWjfDmF%2FTv28bo1qMqwPthbvGiGCEF9qG2GaGRqjeYtVhd22dfT5cmclwvVa7JAd8yrQHmbe9agbdlmdnkifqYA3S4g2trWbh1Z5aYshhqmPhwaXqUpsnEIqFVFDGMNAkNtEJD17io7aXCklkBHHpy4WdA%2F52VQOKfl1pQkSR4jWwkXL%2FzOxDm7soB%2FaU%2BVnhTiFRtYSPVJtJgll6ScCyVRpaDxYDs82B6AbmdKIHpHupiSY7R0jea1gU0NoH11aemO0dJ%2FGV9hO7KWDoJJm5buHEdLLzRP%2F6xUPAuFE5Q7W7nGTmnTOZRk6TW3rQ0HDS%2FQolgCjwoG9UcNmrs4WgTFvcVPz2ryL15prVq7I%2BuVavbarXHyGE3xL77bznGbYiS0HciHluW8pjKtzpfIYiQs0pmpk65YIQuQpOG500gbCmShrluSzmZSv1OahxfwPqqi0DUdjqMlaS%2FFJmafG5C7ckkpZeeZUwTtE2u9kWY2xWn6cozZVMVrw406udGwN7r3nEfZlq6JlAtJkmYipci%2B0OrZQSdSLrTd30ykXqWzsN1jT6Rc2Tec9FEDYpjeHfBxMnFEjRnRaNR9iIh8h23VT4vRM7VxZf2Nr7nfibmJIcBqZkGBNAsClo%2BKXX6HWTtwIX3OsIburvIiVgjZVxtpgE4AYIM9uaf98zMJCcQTssyPJKFs4Pwt7cgz2pXZClAoF50mEUq4vzgXsTo0Of8kl8dhlJY3lA%2BPgGeHOMbthQ0nUQtV4Qh2uiJP134tsfmwAtbmJJcJMmZYUjwsiSCocgsXFCkIbuHSFtXgQoKrGZa6%2B43yDVTahiVZeuVxT2iKEmAgyCIGgJxcsH3ASR67aQYFxUABBgUQKIGCMQE8%2B%2FKVTVNdYJo6ukHbIP3T8m7CW9%2F67jy%2B%2Bza%2BOLET8WQRPNOrzVCrdqj1h31mgAc%2BUMMzunF%2FDzrqbfITGWq9NtlY7QyQdcbzSRErSP%2B2z%2BeysmY2pxV2fQfuga7JnHeUkbvc9cq3I4qNr%2FalZbtnh9342vd4XE3nXsvHVDdHn2FzTFG0Q9ER58eLL3LdAwjZHhRIqiJGJ%2BEBy0mUbdn6lQN16HDh1k3nA1qAC%2BlCnjYtwAMkahZePo4YxXxAtBfSy%2FFY2OY%2BqRx%2Bm6eIBK4lfhIW3Vbsed9qTNVtbDUWenzLl721DS0HamtiQCd%2BZhNDkt1x29sZOA13NALa2ztoewNntz4X0oxOnRigwQY%2BLKAHx6AfLyALwxMjC0EzONjteUTAvmRhIG1Ud4Z%2B9YH737Hj%2FAO7%2BWqDnjxIGVOB5E%2FerWMy%2Fc74Bwb5Si5L5GTFqvzvZcQl56vWPUkyzsEKZRMkkbFCYcgOJMtvh6jOiVUjjB6bSZQ3LZtpL6N3bLaakDhmk9EWclckQ99Ok4F6Mv9bacRemSfAISX5TsH44PrNeQcgenlQ%2BFOgT%2FQCFM%2BcG04qcDCypxrZszkfhPbMHviMSAHBRty32I%2BRx2x3x0EZkQruUsq1UUeXSOX3%2BGk1I30%2F17wiePVY0rf4fhP8ZDzRDqj2%2FQkGfQEvPhCGy4Z6Q0eU0xG3GYd7CnRE1jjrVKRrOd50f7grvSIiYn6pS6N5j05E2n6py6zB%2F8pe5QRIhRxFCy3PGI6hn2MEvTmGtjMLfXMmZf%2Feru2XsbQNMvKiAmWQUUkh99lLYXz%2FC9HQN%2F5KG6MMZH3ThNifIlL6sgRtO0ADeRQ42plaIucQPyHQe8ndU76lvK%2B9ZoN3b759eYeT0acv3ltr8c29QxeyZj2%2B%2FXJDU8ZXH9619c%2BuJb7WgTtjT63difUYZtd8fZXTt35eIKOS%2BW2uIsLlNTfPg4RrCHQsFXwL3OOx42DeyuE%2BhnRrOmGqiHCt7mp1Idatwr2CKIAWIepn85ZAeMb5vC2n6YqLNfqxwc28ncf27vtv8fyMLJRcwZzbK6O601W86GABCNcqju0Fa2xO7dVnXPDQXsi6CuaSYI3Nmb2%2Fip8Aj%2ByFoKTipCmwyuoiy2%2FojCPBuYBBjhxSHgzrRAMM4RenFauOeAbbWXFEeXrkFnYd%2F7IRNVZsKzpaG8tyOm8rs1FaccRgMGpa33aBUdEe2gCXb549rcz%2BUNy2IT2dXeVF%2BjlkXV2cB1oc0bNGm5Lzifgdeov%2FIn33Si29w6zV6gQfJNeD4FMg18PETpbra3THDDCKBxivsT5b%2FgRqlSlDmwKVnMQBg8CEI%2FefCVm9Td4hmUD21TXA2JASqHyEyb3GlJyLD5lqmH9sHWSKm8wooxWC0BmLEARVnMoBV1lWdoTtTRCQ%2BkGmufHN8%2BQZrAPti1YSaAwjQNZjaoHGAg4mMqSfD%2FB6g6JjGIIgoCIyBK4yFI1qWIYi8wKxxqB5tbEM6OBUwzL%2BTh4GiCiCBxkVccdwnWWhjOsYhmXoDzX2PEAoFZTyQCxDVtPk7UztsrlxAXB3epGYCiFAG8lwZD3LkAxl5oU2NEHm1UUygN%2BcN2L538e7QCHL4PjyDIJBLxPCgsaKvDcJWs3fE2pimvh%2F)


## Diagrama do Banco de Dados

Falta finalizar...


## Gerência do Projeto

O projeto foi desenvolvido aplicando as técninas de metodologias ágeis para a sua gestão. Através de uma equipe multidisciplinar auto gerenciável, com a rotação de Tech Leader entre os desenvolvedores.

Para o controle e gestão de fluxo do projeto foi utilizado o [Trello](https://trello.com/b/b2gm8LNx/kanban-bluebank-squad2), adicionando e dividindo as tarefas através de um quadro Kanban, que possui a etapas padrão: to do, doing e done. 

As tarefas são adicionadas através de uma reunião de equipe, onde é definido o escopo e priorização de cada atividade. Cada desenvolvedor seleciona a tarefa para realizar, registra a data de conclusão e marca como concluída. Ao final, o código atualizado é enviado para o GitHub e passa por uma revisão antes de ser submetido.


![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/Trello-Squad2.jpg)

###### KANBAN - [Trello](https://trello.com/b/b2gm8LNx/kanban-bluebank-squad2)


## Tecnologias

- Java 11 (JDK)
- Spring Boot
- Spring JPA
- Maven
- Swagger
- Model Mapper
- MySQL
- Git
- Postman
- AWS

Para utilizar e testar o back-end do BlueBank, é necessário:
  - Baixar ou clonar o projeto do Github, 
  - Instalar uma IDE em Java([Eclipse](https://www.eclipse.org/downloads/) ou [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/#section=windows)) ou outra IDE Java e importar o projeto do BlueBank. 
  - Instalar uma base de dados MySQL([MySQL Workbench](https://dev.mysql.com/downloads/workbench/)) para armazenamento dos dados.
  - Alterar a senha da base de dados do MySQL no application.properties na package -> src/main/resources
  - Instalar o [Postman](https://www.postman.com/downloads/), [Insomnia](https://insomnia.rest/download) ou acessar o link do [Swagger](http://localhost:8080/swagger-ui.html#/) para inserção de dados, consulta, alterção e inclusão de dados.
---

## Endpoints

Os endpoints para teste e acesso ao seus métodos HTTPs (GET, POST, PUT e DELETE) do BlueBank são:

### Endepoint do Cliente

#### Endpoint do método GET consulta todos os clientes, o método POST que cria os clientes, o método PUT atualiza o cadastro do cliente e para o método DELETE que exclui o cliente:

##### Método GET - Lista todos os clientes.
```
http://localhost:8080/clientes
```

##### Método POST - Cria o cliente.
```
http://localhost:8080/clientes
```
```json
{
    "nome": "Lionel Andrés Messi Cuccittini",
    "cpf": "214.033.700-01",
    "dataDeNascimento": "18/08/1987"
}
```
###### Exemplo de inclusão JSON
---

##### Método PUT - Atualiza o cliente por ID.
```
http://localhost:8080/clientes/{id}
```
```json
{
    "nome": "Lionel Messi",
    "cpf": "214.033.700-01",
    "dataDeNascimento": "24/06/1987"
}
```
###### Exemplo de inclusão JSON
---

##### Método DELETE - Exclui o cliente por ID.
```
http://localhost:8080/clientes/{id}
```

##### Método GET - Consulta o cliente por ID.
```
http://localhost:8080/clientes/{id}
```
```json
{
    "id": 1,
    "nome": "Lionel Messi",
    "cpf": "214.033.700-01",
    "dataDeNascimento": "18/08/1987"
}
```
###### Exemplo de consulta por ID
---

### Endepoint da Conta

#### Endpoint do método GET consulta todos as contas, o método POST que cria a conta, método PUT atualiza o cadastro da conta do cliente e o método DELETE que exclui a conta do cliente:

##### Método GET - Lista todos as contas.
```
http://localhost:8080/contas
```

##### Método GET - Lista todas as contas com paginação e definição de filtros(id, data, valor, desc, asc) na busca das páginas.
 
```
http://localhost:8080/contas/1/transacoes?page=1&size=2&sort=id,asc

```

```json
{
    "content": [
        {
            "id": 3,
            "nomeClienteOrigem": "Ronaldo Nazário",
            "contaOrigem": "999745",
            "tipoTransacao": "DEPOSITO",
            "data": "24/11/2021 17:48:38",
            "valor": 3000.0
        },
        {
            "id": 4,
            "nomeClienteOrigem": "Ronaldo Careca",
            "contaOrigem": "990045",
            "tipoTransacao": "DEPOSITO",
            "data": "24/11/2021 17:49:01",
            "valor": 3500.0
        }
    ],
    "pageable": {
        "sort": {
            "sorted": true,
            "empty": false,
            "unsorted": false
        },
        "pageSize": 2,
        "pageNumber": 1,
        "offset": 2,
        "unpaged": false,
        "paged": true
    },
    "totalElements": 12,
    "last": false,
    "totalPages": 6,
    "size": 2,
    "number": 1,
    "sort": {
        "sorted": true,
        "empty": false,
        "unsorted": false
    },
    "numberOfElements": 2,
    "first": false,
    "empty": false
}
```

##### Método POST - Cria a conta de acordo com o ID do cliente e pode selecionar o tipoConta (1-Conta Corrente, 2-Conta Poupança, 3-Conta Salário).
```
http://localhost:8080/contas
```
```json
{
    "cliente":{"id":1},
    "tipoConta": 1,
    "numeroConta": "99005",
    "agencia": "0117"
}
```
###### Exemplo de inclusão JSON
---

###### Método PUT - Atualiza a conta por ID.
```
http://localhost:8080/contas/{id}
```
```json
{
    "tipoConta": 2,
    "numeroConta": "99005-x",
    "agencia": "0117"
}
```
###### Exemplo de inclusão JSON
---

##### Método DELETE - Exclui a conta por ID.
```
http://localhost:8080/contas/{id}
```

##### Método GET - Consulta a conta por ID.
```
http://localhost:8080/contas/{id}
```
```json
{
    "id": 1,
    "nomeCliente": "Lionel Messi",
    "status": true,
    "tipoConta": "POUPANÇA",
    "numeroConta": "99005-x",
    "agencia": "0117",
    "saldo": 0.0,
    "transacoes": []
}
```
###### Exemplo de consulta por ID
---


### Endepoint de Endereço

#### Endpoint do método GET consulta todos os endereços, o método POST cria o endereço, método PUT atualiza o cadastro de endereço do cliente e o método DELETE que exclui o endereço do cliente:

##### Método GET - Lista todos os endereços.
```
http://localhost:8080/enderecos
```

##### Método POST - Cria o endereço de acordo com o ID do cliente.
```
http://localhost:8080/enderecos
```
```json
{
    "cliente":{"id": 1},
    "logradouro": "Rua Edson Arantes do Nascimento",
    "cidade": "Campinas",
    "estado": "SP",
    "numero": 800,
    "cep": "13056-340"
}
```
###### Exemplo de inclusão JSON
---

###### Método PUT - Atualiza o endereço por ID.
```
http://localhost:8080/enderecos/{id}
```
```json
{
    "logradouro": "Rua Edson Arantes - Rei Pelé",
    "cidade": "Campinas",
    "estado": "SP",
    "numero": 1000,
    "cep": "13056-340"
}
```
###### Exemplo de inclusão JSON
---

##### Método DELETE - Exclui o endereço por ID.
```
http://localhost:8080/enderecos/{id}
```

##### Método GET - Consulta o endereço por ID.
```
http://localhost:8080/enderecos/{id}
```
```json
{
    "id": 1,
    "nomeCliente": "Lionel Messi",
    "logradouro": "Rua Edson Arantes - Rei Pelé",
    "cidade": "Campinas",
    "estado": "SP",
    "numero": 1000,
    "cep": "13056-340"
}
```
###### Exemplo de consulta por ID
---


### Endepoint de Contato

#### Endpoint do método GET consulta todos os contatos, o método POST que cria o contato, método PUT atualiza o cadastro de contato do cliente e o método DELETE que exclui o cantato do cliente:

##### Método GET - Lista todos os contatos.
```
http://localhost:8080/contatos
```

##### Método POST - Cria o contato de acordo com o ID do cliente.
```
http://localhost:8080/contatos
```
```json
{
    "cliente":{"id":1},
    "numeroTelefone": "(11) 97710-8811",
    "email": "lionel_messi@hotmail.com"
}
```
###### Exemplo de inclusão JSON
---

###### Método PUT - Atualiza o contato do cliente por ID.
```
http://localhost:8080/contatos/{id}
```
```json
{
    "numeroTelefone": "(11) 93384-7744",
    "email": "messi_30@gmail.com"
}
```
###### Exemplo de inclusão JSON
---

##### Método DELETE - Exclui o contato do cliente por ID.
```
http://localhost:8080/contatos/{id}
```

##### Método GET - Consulta o endereço por ID.
```
http://localhost:8080/contatos/{id}
```
```json
{
    "id": 1,
    "nomeCliente": "Lionel Messi",
    "numeroTelefone": "(11) 93384-7744",
    "email": "messi_30@gmail.com"
}
```
###### Exemplo de consulta por ID
---


### Endepoint de Transações

#### Endpoint do método GET consulta todas as transações, o método POST que cria a transação de Depósito, Saque e Transferência:

##### Método GET - Lista todas as transações.
```
http://localhost:8080/transacoes
```

##### Método GET - Consulta a transação por ID.
```
http://localhost:8080/transacoes/{id}
```
```json
{
    "id": 1,
    "nomeCliente": "Lionel Messi",
    "contaOrigem": "99005-x",
    "tipoTransacao": "POUPANÇA",
    "data": "29/11/2021 20:44:57",
    "valor": 79.89
}
```
###### Exemplo de consulta por ID
---

##### Método POST - Cria a transação de Depósito em conta.
```
http://localhost:8080/transacoes/deposito
```
```json
{
    "contaOrigem" : {"id" : 1},
    "valor": 3500
}
```
###### Exemplo de inclusão JSON
---

##### Método POST - Cria a transação de Saque da conta.
```
http://localhost:8080/transacoes/saque
```
```json
{
    "contaOrigem" : {"id" : 1},
    "valor" : 1500
}
```
###### Exemplo de inclusão JSON
---

##### Método POST - Cria a transação de transferência entre contas.
```
http://localhost:8080/transacoes/transferencia
```
```json
{
    "contaOrigem" : {"id" : 1},
    "contaDestino" : {"id" : 2},
    "valor" : 1100,
}
```
###### Exemplo de inclusão JSON
---


## Patrocinadores

###### [Banco PAN](https://www.bancopan.com.br/)
![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/logo_bancoPan.png)


###### [Gama Academy](https://www.gama.academy/)
![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/logo_gamaAcademy.png)
