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

###### Link Diagrama de Classes: [Diagrama de Classes - Blue Bank](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1#R7V3Zcts4Fv0aV3kenOIu6dGSPelMnLQnTma68zIFi7DEhBIUiHKs%2FvoBSEBccEnRNmDJaVR1xyIWEsRdcHBwAZ74k8XDW4pW8w8kxumJ58QPJ%2F7Fied5w%2BGI%2FeEp2yLFdwZhkTKjSVykuWXCTfIXFomOSN0kMV7XCmaEpFmyqidOyXKJp1ktDVFKftaL3ZG0%2FtQVmmEl4WaKUjX1v0mczYvUoTco03%2FDyWwun%2BxG4o0XSBYWb7Keo5j8rCT5lyf%2BhBKSFb8WDxOc8t6T%2FVLU%2B2dL7q5hFC%2BzPhU%2B3n78ff01%2BJ%2F%2FLxS9%2B%2Faf5Hp8uTkTd7lH6Ua8sGhstpU9gGPWIeKS0GxOZmSJ0ssydUzJZhlj%2FhiHXZVlrghZsUSXJX7DWbYV0kWbjLCkebZIRa76KqJda7KhU9GOH9Ecfx2S37fjH%2Bjq35MPX9GntWx%2FhugMZx3lpLz4y1SeIHrqLSYLnNEtK0BxirLkvi59JJRotisnqp5TiraVAiuSLLN15c7XPIEVEAbhDoUyCHM4c52oIbX9NYKwWoP9KFohryqvUyblugDrRVe%2F1vQiSlkPj%2B9I3rxSQaIfGyIzzta5iM9ZASbPhzKT%2FZrxv4vCQxS3Yi0r7lbkKZrHLGbFf3KjxVQ8Qqoi15v1Ck2T5exzoWZc%2BTJ0K800ENc783SDIuGarJMsIUuWlOK7rKcq3mOa4YdO3RG5Z%2BGoKbNQOoGfpQ8ZOCJtXvEfI1kQUrmKyB8v0Vdm2H5Pw3a1G%2FazetlX7GaaJuzlsarcP5NFipYYUGuUJjOunVNekes9172EjUnnIiPj3T%2BezpM0vkJbsuEdtM7Q9Lu8Gs8JTf5it0VSEiybZkJOXlQrccNrChlTzC34WgrMbSR9QA%2B1gldonYmEKUlTtFont7vXWDDZJcsxyTKyEIV0WFcwdBvWFYxU63JHgHV5xqwrUOR%2BJqpwX5h79OjE83MfxXOW7LnsT5G9zijzYo0S09VddwHMTJPik4l%2Fcj4gRbl6Ur14jDJ0gT%2Bi9TRZsN4nXY%2FmaiFLXCXrTDpsmbFz2Gq1otIk%2F1lmK9rPhJ3lWknJdzwhKWFqfrEkhTkkadpIkhYh%2FDVsD2I0uMrLXARlyiehATyJsLp3aY7D5kkc42Xu5thboUJxeWvFKM4aGo7Zf0xnJs6b8CRkDZ%2Bwa7e8Zv%2Fx4jRjL8zeBSW5WmNmFT%2FxOgMVvtNt7LcCofS8a%2FtovOsHhjQ%2B3I8c0yQXXiFkOSy7T5LwgskqH5JqQ%2F6Zq4jdV8XuAyJO0S1OK0CAFmUboj%2BUdN2op0NzTfmzCJDumE%2FH2HCPKUO4EVrkNldcn%2F6jZuzjwgWwPttMM0KB3N%2FQej5hWHB3o8sfG5Tm97GeQq8uDXrqUmhKlwaKLjXGKYuM9CAjdxQ1kRHkSCIIGTmmpD98JDJK4olAzC0FUjKjKGbzh04Ik8Qoxl3oiYk97rrDcrPA8hFqI6Z4ZT1Vt6ca9NbfDkwD6aprbNQbWUxjTLqu31O8Q0PClVpjMc2r9xRuEPTTpTAypUwqQbqbHFs4ownODP0GnPGCnnBml6hf8J5uPFMAjQv8GTP7zg2%2BHbQsUJLW861n6WSH%2B2vdI0HIwBSv4qoUsgUh2sTrOj09iDEUojLFFoW8Ul%2FhOsOeMMQzpU2hItUXWNVj%2FUi3f4j6%2BcWf%2FOKNH3ky4eKhmn2xrV5dY5qw1%2BeApxsr7F0kFLa0d5FQiOlI1gjd6CBCe0iyXGZvRoEnrrnY3DdMi4vLUmj8Ylu50CeyqKfIpDVqDthQ4ivO3EFzOdHxG%2BCxaKyoWAr%2FscEfZ97QazxKkrNt0R9nntNs3VOq1GNM6hEjwA2UHtlxyPJVCzErPaIt%2BkSljIvFRTu30jS3CiJFxj6AjEKIKja2UOBq54qzZEUm5bJ0eQlNwSoF1TuhGV5Ok9bsNUolmxyTDRdfPX%2BerBlcS6bkM0XLtbqynvFkVKyI8H%2FHIV63xkVZ4AZ7i2dN8iBVHxqb5Fmm2aB4dwsE%2B%2BQbmPJk3vO55jVZoBvuVaC8zS3v0LZsO0E8Ej%2BzU7p9iugaW371VKKaoRgmmPpwaHGVJlwVDN%2BEdWQ1BLzRLhCxpgRDY0qgktZVfNJASS3RiiLCcLNgf07LyG4BzJ0pobQIdK3EfO88z8Q7OXeAf5mtKneK8YoPLaR6J1bMUUsy1IVoUilofdgeH%2FYIlW7HSqD2jkxhJc8S4gbF6wI7E0D5miLEPUuI%2FzK%2BwvVUQhxUJmOEuHdUhHh4socOl5zsScnHilqtdGwrStlLvUq%2FuZ971c6XtzCNgTOoY6XBcFC%2FSQv1Ctwqat6qudejhbN8NIvLIB78pNa2hV5L2%2FrXcJ3IaxiHgV1%2Fnsq76tn2t8b0PpniX3zjnycp1DJgZaiOriG0Qhg0GXZ9HlElVWGy0U4BTYUtOQC1Ds8AR8a0QCUcu6n1fD74OwOreAFv6doVumCgIlmS9lJ8evm5oXLnPikp%2BSJziqAta60VWWaTZGcvx%2FFZlYS3CK8T4Q17a%2FcjZ4OuY2o66EPUqp0OapIvtAr4otNBHzp5wE4HX6WzcP1DTwd91Tcc9akHcpg%2B1BTt8SEtg8ZEZRTW5ik9arzM1MZXWUQRO3Aj5yYWAOuZBUXKLAgI2%2Feg00%2FMrYD4EMtoUUO3qTwLFULyNQYaoMMI%2BGBPbpl9fiYxgXBCnnlNKEMDp%2B%2BYIc%2BYKfN1rFgtOqUJosJfnMqYI5Zc%2FFLL4zjJygrlzRPg3jFOcXthi0n0qqp0BHtdUWBq65jcB1lR1uYklxMydljSPCzJYK4SdwBLX%2FBuMmPRGT5EuNphqdtutO%2FlMjYsqdSriN9CU0SBgSCPewByCsL2DtMiBtUOCpoVBRgUQEWJNIwJ4DGcr2ya6gPT1NEl2kbZH05wGV%2BFznfv%2Fv238dmRHc6nkuA5X22HWr1DbaicWdp%2F47axsz0Cyxv396Cj3iI%2FkqE2aKON9c4AuTGeTnYRj%2Bxv%2B3wuL2tnc0bVru%2FAPTA1mQte2cgd%2BLpHZJjm9ZpDwLDp2DVtqlQe5PvdsTWtLTNKPwdQEKuOyBoqgqVpkm8Y%2B5XDa5iTb0RWhMBqpQ%2BxOYGxGXwAEMs8tH2ccGB4h5g1ssvxWMrmllZOzy1SZIJgAD9JiW4r8rxtFabuPm6G5IVOqPpYF1rEM9bFALv7xC6GiLbD9rc38Br%2BawT0d%2FCi%2FQ0c%2FvpUleYg6MgUGuzgl1XowSsDDQK1H%2BorG8oYHjnNCWbzvC9Nwb4D5UsO8vs1bfBib409py%2B4zVcLm0NXC3DShlQg0lKYdUqm3zn%2BwCBeKciEAqw4lf%2BDHLgUEyTnltAcc%2FBC%2BbRGZqxQHPMTzYrqENQ5smbEyX0zieGmZTPtefCOzzEpSVM%2BhWwBd7tk6OksGWgn97%2BVTuyVeQQYUiHdNIwPftiwtwigqgIoaCkyR1UBPGWBDScVdbBkpR6yctDYrxtCXxN52UMmpU42orXlLooi0ro7eslSS7BJaWc0PVPUUtjj22yWsH6qeGXI6aEIa%2Fl8G7JkPdEeVe37DQdzYSohEDzLh3oLR7TDEb8ZPXsMcETlOOtQpGsR3Zo%2FbEqvCIjYT30ZFO%2FBgUjbp77syvmv7FWOAFSosa%2FQ8ozFGOYxht8bYxg7MTG0J2L2t3Zjn9YyNsioiwoMQSYlhHzMDgjr%2B5%2BpDX2jpowhykjlN21g%2FDFqSl%2BUYGzfZqSOAi%2F6rQR5FteflZyX%2BExC7yX34GDftpgN3r%2F99uU9pqNPX4J3zuKbf4POVM56fPXlkqWMzz%2B%2Bb7PPriW%2B1oE7R0%2Bt5sQthsu1WF8V8K2fF8ihZFHN1wS4ggbecgfQZ4iGgGHpwFvgzow9xwJXjuSxoNvQuVDgwcA%2BhLp1uFdQC6BFiPq5wKUiPOFs4JaTfOXFGv3Y4Gbe3iODH%2Fvv7v45WCixgj0zWNXqTlfxrOMAIL3WcWQw2GJ7YrA54YIHBkPS1TCXBFtszwv%2BVfwEeFwwpEo6zocCm6wvsvySzTgoLggMcuCQ8qhxQC0Ywi9PStYd8Qz2s%2BaI8uzAPex7YfMrD97g0H2s0umir%2Bz2Zs0Rg9GoKX0X%2FOTQ0AWwfPNYam3yh%2BK2LejpNJVn8eeQdE1hHmhxxMwabUZOJ%2FJD9o74pH33Si2rYddqTSofRNeDyqeBroeBnUrX1%2BCOHWA0DzBNvnAE8PAetCdQy%2FEZsA7YaOT%2BEyGnt8Q7GBNIvqbGFxciArUPMIXTmJJT%2BSMnDYufrWPMrpIdZIyqIHQwIqSCOo7SgJusEjtS9jYGSP8Y09z35vnqBNaDtkVriTOGNUClY2pxxlIdbGBIPx8Q9FaKjmEIUgEdgSFwk6FgVIsyNIkXCDUGxWsMZUCnnVqU8XfyMNBEBhxkdIQdw21WeTJBY1iUYT7S2ANObHIlpHwhlKGSaepupnbW3LoA2JyexaVCGmAMZHgqnWVBhjbxQvuZIPGaAhnAB%2B8tV%2F738S5QxDI4vjwBYLBLSnjM2C7vLUWr%2BQfCRMwS%2Fw8%3D)


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
