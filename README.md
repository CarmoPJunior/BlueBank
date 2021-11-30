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

###### Link Diagrama de Classes: [Diagrama de Classes - Blue Bank](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1#R7V1bd9o6Fv41rJV5SJbvwGMgmZ5O08s07cxpX2YpWAG3BlHbpOH8%2BpFsCV%2B0bZwgBdqjtdqAdbFl7Ys%2BfdoSA3e6fHyVoPXiLQlxPHCs8HHgXg0cxxmNxvSDpWyLFNd2nSJlnkRhkWaXCbfRX5gnWjx1E4U4rRXMCImzaF1PnJHVCs%2ByWhpKEvKzXuyexPWnrtEcSwm3MxTLqf%2BNwmxRpI6cYZn%2BB47mC%2FFkO%2BBvvESiMH%2BTdIFC8rOS5F4P3GlCSFZ8Wz5Occx6T%2FRLUe%2BfLbm7hiV4lfWp8O7u3fv0q%2Fc%2F918oeP3tP9GHyfXmnN%2FlAcUb%2FsK8sdlW9AAOaYfwS5JkCzInKxRfl6mThGxWIWaPsehVWeaGkDVNtGniN5xlWy5dtMkITVpky5jnFs9kD2p9N56Ukk0y46V%2BBAv8dUTebyc%2F0M2%2Fp2%2B%2Foo%2BpeKEMJXOcdZQrBMh76hUmS5wlW1oxwTHKood6QxBXovmuHK96mSRoWymwJtEqSyt3%2FsASaAFuEPaIKwM3h3PbChpS21%2FD86s16JeiFeKq8jplUq4LsF50dWNNL4KYdujknuTNKxUk%2BLEhIuM8zUV8SQtQ8T2WmfTbnH0uCw9R3Iq2rLhbkSdpHrWYNfvKjBYn%2FBFCFZnepGs0i1bzT4WaMeXL0J0wU49f78zT9oqEDySNsoisaFKM7zNIFQHNe8BJhh8rSbLu8Nxzf9yUmS%2BcwM%2FShwwtnrao%2BI%2BxKAipXEXkT5foEQ37OXbs9rRjewg6jwMM%2B6BediW7mcURfXksK%2FfPaBmjFQbUGsXRnGnnjFVkes90L6Jj0iXPyFj3T2aLKA5v0JZsWAelGZp9F1eTBUmiv%2BhtkZAEzU4yLicnqJW4ZTW5jBPMLPiDEJjdSHqLHmsFb1Ca8YQZiWO0TqO73Wssqeyi1YRkGVnyQiqsyxvZDevyxrJ12WPAuhxt1uVJcj%2FnVZgvzD16MKDoh3UCy1nR59KPIjvNEurFGiVm6%2FvuApiaZoIHU3dwOSRFuXpSvXiIMnSF36F0Fi1p75OuRzO1ECVuojQTDltk7By2XK2oNM2%2FltmS9lNhZ7lWJuQ7npKYUDW%2FWpHCHKI4biQJi%2BD%2BGrYHPhrc5GWuvDLlI9cAlkRo3fs4x2GLKAzxKndz9K1QobistXwUpw31J%2FQf1ZmpdeEPfNrwKb22y2v6jxVPMvrC9F1QlKs1plbxE6cZqPCdbmO%2FFXClZ13bR%2BNt19Ok8f5%2B5BhHufAKIYth2X6WhJdUVvmQVBvyz21J7K4sdhcQcYzucFwBAklRtiH6Y0nXDno6NFuXPwsA6U7YdIwO9zihCDdAy9zmiuuzf9SMfVK4ANpnm1lGEiD3D5QuphQL7m50%2FWOD4vw%2BxlOo1aVhT13ydenSUNKlxjhlkJEaZGSPgyYyghxJACEjS5f0R09ERlE45Yi5pUBM5gkK6fyhE8JEIQpxF3qiYg%2B77rDaLLF4hNyIGV4bT9XtqYa99bcD00C6amsb9cYG02iTru32FO9Ik3CF1hhM88t7Ctvz%2BumSH%2BhSJpkg3U2ODZxRBGdGbgPOOF5POLNLVC94RzWeKYDGFf6EqX3nBt8OWpYoiuv5xrN0ssP9te6JIGSoi1exZQrZgBBl4rWtnh5EGwqRmWKDQn5RX2Fbo54wxNGlTb4k1RdY1aP9mGz%2F5PXziy%2Fs4sINHJFw9VjNvtpWrz7gJKKvzwBPN1bYu0jIbWnvIiEX04msEdrBUYT2GGW5zC7GnsOvmdjsC6rFxWUpNHaxrVyoE1nQU2TCGtXJDI6vOLeHzeVEy22Ax6KxvGIp%2FKcGf5w7I6fxKEHOtkV%2FnDtWs3XPqVKPMalHjAA3kHpkxyGLVy3ELPWIsugTmTIuFhfN3ErR3MoLJBm7ADLyIapY20KBrZwrzqI1mZbL0uUlNAWrFJTvhOZ4NYtas1MUCzY5JBsmvnr%2BIkopXItm5FOCVqm8sp6xZFSsiLC%2FEx%2BnrXFRBrjB3uKgSR6k6iNtkzzDNGsU726BYJ98PV2ezDmca07JEt0yrwLlbe5Yh7ZlmwniifiZndLtU0Rb2%2FKrIxPVFMVQwdSHQ4OrFOEqb3Th15HVCPBGu0DEmhKMtCmBTFpX8UkDJbVEK%2FIIw82SfpyVkd0cmFszkiRFoGsl5nvneabO4NIC%2FlJble4U4jUbWkj1TrSYJZekqAslUaWg8WF7fNgTVLodK4HaO9aFlRxDiGsUrw3sTADlq4sQdwwh%2Ftv4CtuRCXFQmbQR4s5JEeL%2BYA8dLjjZQcnH8lqtdGwrStlLvQq%2FuZ97Vc6XtzCNnjWsY6XhaFi%2FSQv1CtwqaN6qudejhbN8MotLIR78pNa2%2BU5L2%2FrXsK3AaRiHhl1%2Fjsy7qtn2l%2BLkIZrh33zjnyMo1DJgZSSPrj60Qug1GXZ1HlEmVWGy0UwBdYUtWQC1Ds8Ax9q0QCYcu6n1fD74noJVvIS3dO0KXVFQEa1Ieyk2vfzUULlLl5SUfJE5Q9CWtdaKNLNJstOXY%2FisSsIbhNeJ8Ea9tfuJs0Hb0jUddCFq1UwHFckXWgV80emgC508YKaDv6SzsN1jTwdd2Tec9KkHYpg%2B1hTt6SEtw8ZEZezX5ik9arzM1MaVWUQeO3Ar5iYGAKuZBQXSLAgI23eg00%2F0rYC4EMtoUEO3qRyECiH5agMN0GEEbLAnd9Q%2BP5GQQDghz%2FxAEooGzl5TQ55TU2brWKFcdJZEKOH%2B4kzEHNHk4ptcHodRVlYobx4B9w5xjNsLG0yiVlWFI9jrijxdW8fEPsiKsjYnuYyQMcOS4mFJBHOVuANY%2BoJ3k2mLznAhwtUMS912o3wvl7ZhSaZeefwWmqEEGAjyuAcgpyBs73FSxKCaQUGxogCDAqgogYIxATyG84jTVCWnbrrAvHV8jbZB9qflXYc3vvXdeXjzbXJ%2B6Kmbh9mjTILnfLUZatUOtb50Zmn%2FjdvazvbwDG%2Fc34OOe4v8RIZar402VjsDZMZ4Nt1FPNLP9vlcXtbM5rSqXd%2BBe6hrMucdZeQu440ugvEuyOhLNfeFNuD2PabXUX5ML0wvB35j6Bk2526KNnP6TZZThHlrZbE9KBZWRYBOwmOukyjfd%2FY7R%2Bl4TkNy%2Fkj2Ii7ECXnaeAAPoKdZgPwkYvDyHlEjpJeTiRDNXVI5g7dIEQmcR%2FwoBLqtiPOuVZaqu7hxEKHvj2VHbUMrgdp6GKCIn9nDEFt31O72m5t5PQ%2Fobu9Fuxs4QPa5Cs2A1GmpM9i%2FL6vOw2PgjgOAwujUgILVnKM2jwxTFC88lH4MwhrWfsDj6TX2HOBgN1%2FN74mBlKEUiPfkVh2T2XeGPTCIVQo%2BogAqVuW%2Fl4OWAqtadyTJ8QYrlM%2BMRMYahSE7FK2oDsGcE2tGGD00kyhmWjXTDoN2bJqakDhms9AWYLdLhp5Ok4F2Mvdb6cRemSeAHyXeTsHwMG4CStsFwr49KPAp0Ed3AVxngQynFX0whKcSDbBtz2%2BqAHScysseVSnARyPmW%2BzFKOK1u2OgDEEFG5VyXtTRRVD5PX7hzdDezxWvCFw9Fu0tnm8Cn4wn2qOqfX8JQl%2Bwiw%2BE4LLB3gAS5YBkLO1EPAU8IpOcdSzStRZv7B%2B2pV8IiZhfDNMo3qMjkbZfDDML8L%2BzVzkBVCGH0EILNAZkvADIAM%2BQBdVB28mLvsx7mVFmn%2Bn8MmFevryyQCFkVGLIp%2BykMM7%2FQG3oG32lDVIGMsNpAuxPUVP6wgRt%2Bz8DeRR40d9cEGd6fankvMTPLfRed%2FeO9hsZ8%2BGbV98%2Bv8HJ%2BONn77W1%2FObeonOZtZ7cfL6mKZPLd2%2Fa7LNrna914M7hU6s5MYthci0WWTl%2B6%2BcFcixZVHMVIS6vCbiG0M8ZjQDDUoG3wA0de44XrhztY1C3pvOlwAOGXQh1q3CvoBZAyxD184VLRXjGGcMtJwKLixT92OBm3t6jh5%2F6d3f%2FHCyUWMGcPSxrdaerOOhYAUivVRw9DLbYnDysT7jgwcOQdBXMJcEWm3OHfxc%2FAR47DKmSinOmwCarCy6%2FpjOOBBcEBjlyVHkjpgkM4hcHLquOega7WXFQeXbkDraGzd%2BKcJ1jd7HMpvOuMpukFW%2BSDsZN6dvgDxeNbADJNw%2B3ViZ%2FKHTbQJ5OUzmIPYekqwvxQEsjepZoM3LGPwd8mTYj3Qu1tIZZqtWpfBBZDyqfArIehnUyWV8DO2aAUTzANNnCMcDCO9CuQCWHcMA6YKKR%2B0%2BDrN4S7%2BBLIPnqGl9siAZUPsAUTmNGzsSXnDIsvraOMbtKZpDRqoLQ8YqQCqo4kANuskzrCNmbECANG5%2Bae9%2FGfKtqTQOgrdFK4oxhFZDZmFqcsdAHExfSzwl4vbWiYxyCVEBFXAjcZCgY1cAMReIFQo1B8WqDGdChqQZm%2FJ08DDSTAQcZFWHHcJtloozzGAZm6I80Hg8BolRgyhdCGTKbJu9maqfNjQuAzekgMhXSAG0gw5H5LAMylIkX2s8EiVcXyHAgpsqQ5X8X7wIFLIPjyzMABr1MCAsZ2%2BW9StB68ZZQEdPE%2FwM%3D)


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
