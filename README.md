# BlueBank - Projeto Final PanAcademy


## Tópicos

* [O Projeto](#O-Projeto)
* [Desenvolvedores](#Desenvolvedores)
* [Transformadores da Gama Academy](#Transformadores-da-Gama-Academy)
* [Diagrama de Classes](#Diagrama-de-Classes)
* [Gerência do Projeto](#Gerência-do-Projeto)
* [Swagger do BlueBank](#Swagger-do-BlueBank)
* [Endpoints](#Endpoints)
* [Tratamento de Exceção](#Tratamento-de-Exceção)
* [AWS BlueBank](#AWS-BlueBank)
* [Agradecimentos](#Agradecimentos)


## O Projeto

Desenvolver uma aplicação de um banco fictício **BlueBank**. O sistema deve gerenciar as transações, cadastros de clientes, permitindo incluir os dados pessoais e de contato. No sistema o cliente vai ser atrelado a uma conta bancária e registrar histórico de transações entre contas. Software desenvolvido conforme os requisitos descritos no documento do projeto final [Projeto Final PanAcademy.](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/doc/banco_pan_desafio_final_bluebank.pdf)


## Desenvolvedores

Projeto desenvolvido pelo grupo 2 - Squad **Undefined Coders** 


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

###### Link do Diagrama de classes: [Diagrama de Classes - Blue Bank](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1#R7V1bc9u2Ev41mvF5sId3iY%2BW7KZtnMSN3Z6evJyBRVhiQgkKRTl2f30BEuANS4qSAFnO0NPGJi4kiL19WCyWA3uyeH4Xo9X8AwlwNLCM4HlgXw0s%2BuP49BcreclKbNO2spJZHAZZmVkU3IX%2FYF5o8NJNGOB1pWFCSJSEq2rhlCyXeJpUylAckx%2FVZo8kqj51hWZYKribokgu%2FW8YJPOsdGQNi%2FJfcTibiyebHn%2FjBRKN%2BZus5yggP0pF9vXAnsSEJNlfi%2BcJjtjsiXnJ%2Bv3SUJsPLMbLpEuHjw8fP62%2FOP%2B3f0feb1%2F%2FCm%2FH15tzfpcnFG34C%2FPBJi9iBnBAJ4RfkjiZkxlZoui6KB3HZLMMMHuMQa%2BKNjeErGihSQu%2F4iR54dRFm4TQonmyiHit%2FCp8XGuyiad8HN%2B9Of4yIp9ext%2FRzR%2BTD1%2FQ57UYf4LiGU5a2gl6sZcpPYHP1DtMFjiJX2iDGEcoCZ%2Bq1EeciWZ5O971Mo7RS6nBioTLZF268y0roA2EQBicGbg4nJvmsEa1XXvQP7JRiKvS6xRFKS%2FAfNE2rxW%2B8CI6w%2BNHkg6vYBDv%2B4aIivN1SuJL2oDS87mopH%2FN2O9FpiGyW9GRZXfL6iTOoxKzYn8yocUxf4RgRcY36xWahsvZfcZmjPkS9CDE1OHXuXiaTlZwS9ZhEpIlLYrwY9KRFZ9wnODnVt7hteeuX6eZK5TAj0KHeB4vm5f0x4gTF2S5Esl3p6gtUXQahfQlsTztP8JFhJYYmHAUhTM2b1PWkVGEzUpIteUlr0gYKcbTeRgFN%2BiFbNhrrRM0%2FSauxnMSh%2F%2FQ2yIx47Q6TrhqsLxKizvWk6uVGDPeuhWEMWtFH9BzpeENWie8YEqiCK3W4UP%2BGguqLsLlmCQJWfBGSuhujGp0dzyZ7qYP0D0Xc%2BV0dyS6n%2FMuTEpTXeMNqF1mk8BqlvS59FdWvU5iKl%2B1FtPVY3sDTK1BjAcTe3A5JFm7alG1eYASdIU%2FovU0XNDZJ22PZmwhWtyE60SoElGRqxK5W9Zpkv5ZVEvcT4mdpFwZk294QiJC2fxqSTJxCKOoViQkgmsSWB64nrpJ21w5RclnzgGsiNC%2Bj1GKEOZhEOBlalnpW6GMcdlouX2hA3XH9D%2FKMxPjwh24dOATem0W1%2FQ%2F1jxO6AvTd0FhytaYSsUPvE5Ahm9VG9ulgDM9m9ouHG%2BajiaOd7djmihMiZcRWRgMcy8KLyitUhRUMUbnpkR2Wya7DZA4Qg84KpmoOGtbI%2F1rUdd0Oio0U5c%2B8wDqjtlCgSJMHFPs5aFFKnPZ9dl%2FKsI%2BzlQAnbPNNCExUPsrWs8nFKXkN7r%2BvkFRep9eU6jlJbcjL7m6eGko8VJmp6akB0WqQJHpe11AEQSG9YGi0Y6gKAwmHCw3NIjILKbL%2B03cil7CAAW4DThRsgdtd1huFlg8Qh7EFK%2BqfXuF1aawhp15uQXaQHxrajN%2Bfg9ttFHXtDuSd6SJuIJremjz5jWF6TjdeMn1dDGT7MHL18g9tNEFbSy7I7QxtWFa01KNbTLQcY%2BpdKfi3gxfFiiMegTSXa%2BY3XluRwji6XKumLIfuYcgysjrd1Qf2iCI7C3uIcgbVRX%2BqCMEsXQxk%2BxeyRzxPQBRBEBcwRXF5jAAQHI3SsW34mkDIMqdK5RgyWad1T4QEmG0rLVIwhWZFJs8xSWEZEoNQRiDZng5DdtarFEk3DQB2TAy14YTo%2BUaTQleyztVpbqmfe9e9cF65BCUBAqBaWmDSb2nRiN9oZ0DmMC6lJx1uK9mTRbojikSqG7zwCa0qbrHWCeiaExgK6OBEbVxouzoYfYynFbtYA%2B5NEGukQGwgHVcFpBdPmVAUgNHDSE%2FPExns6C%2FzorAPY7YjSmJ4yxarBTSl%2BudiTW4NIB%2FqaRKd1qRzQotp6h8J9rMkFtSmIXikBQVvQbbosF2YOgWqARx71AXUrLkVaKaUNM1jp%2FCKf7Jg01ziFNsr49kheRCC39HW6ypJS8Bs2VPFgDI%2Fh27eN1bJX07EQaETCDBpuKjiwvkNVC7I4AFgrasuul9mC5vXnVTO3dfY7NLmxQugaxyiuoBqKlx%2FETXOHgBB4nmja6oNg6XpLkVe4XGMdBKXEHrvTFrNWajznKwozEzTV3brja0LuzX%2FYroazpWNwLr2h%2BxoXMx%2Ff7Im1QWoBMJYiZtGyS2vJfKPeF3Arv2AEkNSnYklAwEssOeG0cXSrahzdbeVrSLivI9AG2mAjqGwlQ8eaDyeU8CAlmHtPKWxNQGnP1GBXlGRZk9SG45jUMUc3VxJjbQaHH2l9weJdSQhP8UfdpvH%2BAIJ90ap66edOC8NTz%2B3n6pZXBbDjFscD1rA7vyWZz62oct83tjptuYWUPZmJkjiBe0xYXZkBuvN2btcnNQ2B9EX23GTHboKTVma%2FR9g8%2F%2BSh08wrsD2aQVoxDZ2jB1Nj7iOI3jSN00W4Z3df%2BpN1d6WRgwV7CKsrXhbdkfmfJGb5%2FU2ifXci%2FcvZdb2kI2nN411128%2Fc5EP5HlltPkmdvDQk1J43qLiePZJN8Tp79bVlodl1jpPXvro5U9uy6WhrrWSo6sbI6QWItOY%2FzyN%2B%2BfXvyPXVyMbHF99VyuvXopX93iOKRvzwxcu23YmqbL4avb18rTJafVsuqpegy%2FZniysfJ%2BBfV3TfmVh4iJJzl%2Be8YvqUM%2BNK0ZvxzoYI%2BKOIyYo%2FY4TEOef%2BZgDHkf3rNzLFRSPTakemx9KaAARzNz2o1Dhl4fERVdejkeC%2Bo8xKU8SlmJKOAevs%2BCpi8lij40klP5LNckxDMNYJZzKHmUXCIO4O%2Fdc5LzOIXXnWZ3VIfxrgNxc75Dcpx5BhIA7cvMDHmdGCs3TPFxWXn4KljlOUxSqHLheBa%2FztCKkS6H2XWBVtjFS%2BmijlUK5ENv55XRj3lhGM6R4c%2FoxOCPV88qatdjAbN32gH9NOOZ%2BrOG9SV%2BA9JShmwg5yVXBRGZfmN4BYP4JvOPZODGKP3vpEAn4wnjgcQpRmGN0vWXqFihIGBRbFl3CBqd2DCC8KleRHHWsl52GBxki%2BaYRBFb6zaAwbwYejotBsbJdHZpEjtVngDmlPyICmyK5Uh223c9wKg4I1s2Kp6lzaoA7tcMTU5KLNH7YNUwgedLTGCDIHnoykxgajsc7MpO2PRALXfBZ3G17TFQvS8MFquDNhMhLrB0%2BcLcDlnne0%2F8vuQV4YrbyKvLEy%2Ber2uvuHSbWzQDdn93jYzCQdgx0mlbWFSvqdSyMpQoFLRX2lxnLhCiy%2BBAD1nUbxuLzGVbAAuYTk3b8URX9p1WwUpbBEGvAGBhUp9xVRv5%2B2TyGskLJZMHyasNqzRlkz8uVukSVcBRChQsALa8S5MmCaAyztIm9UEIr6nN3I4Z2fQdT3TlKF0oYvs00Y1tvGF0AzhkXAfyylnGEMI32gCu7Byv4JtdAvp7BQELW%2FcoJShIEmAHfZ6ZPm2ZRvK6UIwkJO260Kwne181wJ1ypoUuh9juWPA%2FXHXFN%2Bfh2vtymH%2BvjVSzK3CoCGZXbd4XT9Y%2BRw1EcAdFGIKo6R6C0Iga1MULiIbq4gW60ms2fP%2Fu65%2Fvcex%2F%2FtP5zVh8te8Q8NXQ8c2f17RkfPnxfZOAtm2HNhqMFMc1yhMTGUbXbC%2BaA8luaiAFtSW8qQD6iXCaPJ7TA1LGgWdhVBw996%2FRi5f8bTjXwY1rfLOe3n8dA4Sq5AwsJco5Hfj%2Fpp2bcmToyATUqw2tBlWoV5ALoI2aatrAghH2SB245na9IctfUNj2covtSQVf9998tEkVffQ5CmUxadU9Bx0tggRFxR4AOGJ1kb3X%2FPOCrxzYW0th2hA%2BbQE7bSpiTsE5VhzVm7zyFJuGFITlWGBk71FnWXb%2F8dnqz8Aq3sx0HOkMrG0A5B%2BZgMVXEYMH0h%2BKhO3dO62icliOBoC6CvaywAFDrjs9B2ATcjYR35ITn2QHjsFG9NZFj%2B5nYeXGPaBSyqlgKgaIUxW4mWEIKPshM2SU7TP01kixNXJGckYGU%2Fj6y7AaOsmlJCEHzAZ9HGj3VZPRmegtyyaIvrrsEfAhSvWbDY3peyDjJVZfZ9f5V94N8cH3RvuVd%2BpkwJpa9xZMLXND%2BRwg5va1mTA5LlDQ%2FjSjJ964Aav50D0LjJ2AjslqtF%2ByY6gSOyEYoo%2BX6KYFnM5s0WLiIBZQES8BDxmKH%2BwRjCLyAidZQPJqQzBQTkvlS%2BrdUEmPM47KgtBXVCAWVBGfBw9ZdtlxJ0kPM44RpDm0IaBhijxhyk%2FNwkwg%2B%2FbkQyjNTvxeC8AiddiJWYADtOEM8HOjPc5QRF7wxCxAXl04A%2FiEp4ZPBXT33JeOmvSO%2B5NSROCBWMgUqYgZ%2BvXTcHgXf4lv3o%2FR%2B9%2FRH0%2Fv%2FnCAyLHPaWghles6tSmIvYzjdNLJKp3ySmbKgCMG0xIQQrQOQrQgy%2BB%2BzpLeVNBFmlQlLfglZOPOYi93DAnNU0OxTFDuoJIYc0hN7R6poUTI6LlBbymSVfHkVaN9I0drQZ37hZIKH%2Fv2UNJWZERnRpicA1NPnTvSFyulz3Q3JJ%2BS75VHSjTfS1Eaz%2FP89FbpUaNto6t3sbmpATN5FjcQgyKPj2t8aE4sUIxl37xxcQGIMGXBG2a8B3LILRC326qos5tTo7PEU6F3B%2FkHtyQdWGX3Zl3UEoOzI78epBflPAHmobMpUNJpTOdRZ1N2rgOzeTLmZQv7P%2FBVaqMZqpogd4sB6m4cDtT51Jj5I1uR1jf9ui50xFmSk9b68ofj%2BLCbRyd1sYeVLq%2Bn9WVv9U8sVud54tBS3nNvi3C1ojsG7oZVcEfXhK8J7oZqBL0aD2wrwnn11LZyivVTlHhXepTJZ6RxdHIXm38fR1XGdlCaZc%2Fw60izqVOahehVxC4dwp75gFO1UNUKjmvtoxYUCnJni50tOY4tyfUVm69uwSbdSpkc1z%2BjMBx57WOTepiGU1nh6RFj2bf%2F84oxEz7Trsry%2FqJsVMVYHXAuy2vbGabt%2Bbz9VxBX16id7xnWv2rTWVxdox42atjDC9%2B1DPFj6ZHefEM1Py5ptH81Re7hD49gg4EQ1jfsD63Kk2%2Fs9ZWgii%2FUr8Jlf3fDrdLKdj1Wv8XKUsTgi09QHbwuHnkXvmcUP04d6BrDi5G7p%2FzaJp10xy9%2BpDNJQ%2BvCEMGUyoXYlg2quUWK6118%2F0Q8pkA481t0mZ6Sz9T8GZymJ%2BQ1NV%2F5uy0q0qUoUfSdPzeXNZSpdyi96GVMWDqAQgPFaDX%2FQALGx9f%2FAg%3D%3D)


## Diagrama do Banco de Dados

Diagramas Entidade Relacionamento(DER) são mais utilizados para projetar ou depurar bancos de dados relacionais. Também conhecidos como DERs, ou modelos ER, usam um conjunto definido de símbolos, tais como retângulos, diamantes, ovais e linhas de conexão para representar a interconectividade de entidades, relacionamentos e seus atributos.

![Diagrama do Banco de Dados](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/DIAGRAMA_DER_BLUE_BANK.PNG)

###### Diagrama de ER do Banco de Dados SQL - BlueBank

## Gerência do Projeto

O projeto foi desenvolvido aplicando as técninas de metodologias ágeis para a sua gestão, a equipe é multidisciplinar e auto gerenciável, com possui a presença de Tech Leader entre os desenvolvedores.

Para o controle e gestão de fluxo do projeto foi utilizado o [Trello](https://trello.com/b/b2gm8LNx/kanban-bluebank-squad2), adicionando e dividindo as tarefas através de um quadro Kanban, que possui a etapas padrão: to do, doing e done. 

As tarefas são adicionadas através de uma reunião de equipe, onde é definido o escopo e priorização de cada atividade. Cada desenvolvedor seleciona a tarefa para realizar, registra a data de conclusão e marca como concluída. Ao final, o código atualizado é enviado para o GitHub e passa por uma revisão antes de ser submetido.


![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/Trello-Squad2.jpg)

###### KANBAN - [Trello da Squad - Undefined Coders](https://trello.com/b/b2gm8LNx/kanban-bluebank-squad2)


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

Para utilizar e testar o *back-end* do BlueBank em sua máquina local(localhost), é necessário:
  - Baixar ou clonar o projeto do Github. 
  - Instalar o Java JDK (Versão 11 ou superior).
  - Instalar uma IDE em Java([Eclipse](https://www.eclipse.org/downloads/) ou [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/#section=windows)) ou outra IDE Java e importar o projeto do BlueBank. 
  - Instalar uma base de dados MySQL([MySQL Workbench](https://dev.mysql.com/downloads/workbench/)) para armazenamento dos dados.
  - Alterar a senha da base de dados do MySQL no application.properties na package -> src/main/resources
  - Instalar o [Postman](https://www.postman.com/downloads/), [Insomnia](https://insomnia.rest/download) ou acessar o link do [Swagger](http://localhost:8080/swagger-ui.html#/) para inserção de dados, consulta, alterção e inclusão de dados.

Para usar o BlueBank na **AWS** no serviço de **Elastic Beanstalk**, é necessário:
 - Foi adicionado no projeto o arquivo application-beanstalk.properties em src/main/resources e adicionar informações no pom.xml. 
 - No arquivo raiz do projeto BlueBank, clica com o botao direito vai em "run as-> Mavem build", na tela tem o campo Goals inseri o nome "clean install", marca na caixa de seleção "Skip Tests" e depois "Run" e aguarda a criação do arquivo BlueBank-0.0.1-SNAPSHOT.jar.
 - No ambiente da AWS:
  - Pesquisa o serviço Elastic Beanstalk e vai em criar um novo ambiente.
  - Seleciona o Ambiente Servidor Web 
  - Informa o Nome do Aplicativo (minusculo), escolhe a Plataforma (do exemplo Java 11), ramificação (qual versão do Java) e versão da plataforma.
  - Faz Upload do arquivo gerado BlueBank-0.0.1-SNAPSHOT.jar. 
  - Depois seleciona - Configurar mais opções, vai em banco de dados e clica em Editar: 
     - não modifica nada em Snapshot, escolhe a versão do MySQL "Recomendado a versão 8.0.23", mantêm a classe "db.t2.micro", deixa disponibilidade "Baixa" e cria o "nome do usuário do BD" e a "senha do BD" e marca em Excluir e salvar. E aguarda o ambiente ser criado, demora alguns minutos.
 - Com o ambiente criado, no lado Esquerdo abaixo do ambiente criado em clica em "configurações", na nova tela em "software" e depois em "editar", nas propriedades de ambiente adiciona os dois campos abaixo:
```
SERVER_PORT                 5000
SPRING_PROFILES_ACTIVE      beanstalk, mysql
```

Clica em Aplicar, o ambiente é criado e a Integridade fica OK!. Com o link Criado agora é testar a aplicação.


![Elastic Beanstalk - BlueBank](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/AWS/Elastic%20Beanstalk%20ok.jpg)
###### Elastic Beanstalk - BlueBank


---

## Swagger do BlueBank

A Swagger UI fornece uma página que lê um documento de especificação OpenAPI e gera um site de documentação interativo a partir de seu projeto em spring boot.

![Swagger BlueBank](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/Swagger%20BlueBank.jpg)
###### Swagger BlueBank

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
###### Exemplo de atualização via JSON
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

#### Endpoint do método GET consulta todas as contas, o método POST que cria a conta, método PUT atualiza o cadastro da conta do cliente e o método DELETE que exclui a conta do cliente:

##### Método GET - Lista todos as contas.
```
http://localhost:8080/contas
```

##### Método GET - Lista todas as contas com paginação e definição de filtros(id, data, valor, desc, asc) na busca das páginas.
Os filtros pode ser ajustados conforme a necessidade através dos campos:
  - Page: deve informar qual página apresentar.
  - Size: informa a quantidade de itens para apresentar na página.
  - Sort: informa a coluna chave da pesquisa(id, valor, data).
  - Asc ou Desc: apresenta a listagem em ordem crescente ou decrescente.
 
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

##### Método POST - Cria a conta de acordo com o ID do cliente e pode selecionar o tipoConta (0-Conta Corrente, 1-Conta Poupança, 2-Conta Salário).
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
###### Exemplo de atualização via JSON
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
###### Exemplo de atualização via JSON
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
###### Exemplo de atualização via JSON
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

##### Método GET - Consulta o tipo de transação por ID - (0-SAQUE, 1-DEPOSITO, 2-TRANSFERENCIA).
```
http://localhost:8080/transacoes/tipo/{id}
```
```json
{
        "id": 2,
        "nomeClienteOrigem": "Lionel Messi",
        "contaOrigem": "99005-x",
        "nomeClienteDestino": "Riquelme",
        "contaDestino": "4444",
        "tipoTransacao": "TRANSFERENCIA",
        "data": "01/12/2021 19:34:13",
        "valor": 550.0
    },
    {
        "id": 3,
        "nomeClienteOrigem": "Lionel Messi",
        "contaOrigem": "99005-x",
        "nomeClienteDestino": "Riquelme",
        "contaDestino": "4444",
        "tipoTransacao": "TRANSFERENCIA",
        "data": "01/12/2021 19:37:43",
        "valor": 1550.0
    },
    {
        "id": 4,
        "nomeClienteOrigem": "Lionel Messi",
        "contaOrigem": "99005-x",
        "nomeClienteDestino": "Riquelme",
        "contaDestino": "4444",
        "tipoTransacao": "TRANSFERENCIA",
        "data": "01/12/2021 19:51:57",
        "valor": 750.0
}
```
###### Exemplo de consulta por tipo de transação
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
    "valor" : 1100
}
```
###### Exemplo de inclusão JSON
---


## Tratamento de Exceção

O tratamento de exceções do BlueBank é realizado de diversas formas e parâmetros nas classes do projeto. O package de Exceptions apresenta as exceções das classes de Cliente, Conta, Contato, Endereço e Transações. E suas mensagens de validação pode ser verificadas e alteradas em -> src/main/resources/ValidationMessages.properties


![Exemplos de tratamento de exceção do Cliente](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/Excecoes_cliente.jpg)
###### Exemplos de tratamento de exceção do Cliente
---

![Exemplos de tratamento de exceção da Conta](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/Excecoes_Conta.jpg)
###### Exemplos de tratamento de exceção da Conta
---

![Exemplos de tratamento de exceção da Transferência](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/Excecoes_Transferencia.jpg)
###### Exemplos de tratamento de exceção da Transferência
---


## AWS BlueBank

### Amazon Elastic Beanstalk

O **AWS Elastic Beanstalk** é um serviço de fácil utilização para implantação e escalabilidade de aplicações e serviços da web desenvolvidos com Java, .NET, PHP, Node.js, Python, Ruby, Go e Docker em servidores familiares como Apache, Nginx, Passenger e IIS. Basta fazer o upload de seu código e o Elastic Beanstalk se encarrega automaticamente da implementação, desde o provisionamento de capacidade, o balanceamento de carga e a escalabilidade automática até o monitoramento da saúde do aplicativo.

![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/AWS/Consulta_Cliente_AWS.jpg)
###### Exemplo de Consulta de Clientes e Endereço na AWS - Elastic Beanstalk
---

![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/AWS/2%20-%20Paginacao%20Cliente%20aws.jpg)
###### Exemplo de Consulta paginada de Clientes na AWS - Elastic Beanstalk
---

![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/AWS/Inclus%C3%A3o%20Contato_Cliente_Aws.jpg)
###### Exemplo de inclusão de dados de Contatos via Postman na AWS - Elastic Beanstalk
---

![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/AWS/Exemplo%20Transacao_Cliente_Aws.jpg)
###### Exemplo de Transação entre Clientes via Postman na AWS - Elastic Beanstalk
---

### Amazon Simple Notification Service (Amazon SNS)

O **Amazon Simple Notification Service** (Amazon SNS) é um serviço de mensagens totalmente gerenciado para a comunicação de aplicação para aplicação (A2A) e de aplicação para pessoa (A2P), seus sistemas editores podem repassar mensagens para um grande número de sistemas de assinantes, incluindo filas do Amazon SQS, funções do AWS Lambda e endpoints HTTPS e o Amazon Kinesis Data Firehose para processamento paralelo. A funcionalidade A2P permite enviar mensagens para usuários em grande escala por SMS, push de dispositivos móveis e e-mail.

![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/AWS/Exemplo2_SNS_AWS_Smartphone.jpg)
###### Exemplo de transação para o Cliente via AWS - Simple Notification Service (Amazon SNS)
---

![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/AWS/Exemplo_EMAIL_SNS_AWS.jpg)
###### Exemplo de envio de Email para o Cliente via AWS - Simple Notification Service (Amazon SNS)
---

### Amazon CodePipeline

O **AWS CodePipeline** é um serviço gerenciado de entrega contínua que ajuda a automatizar pipelines de liberação para oferecer atualizações rápidas e confiáveis de aplicativos e infraestruturas. O CodePipeline automatiza as fases de compilação, teste e implantação do processo de liberação sempre que ocorre uma mudança no código, de acordo com o modelo de liberação que você definiu.

![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/AWS/Pipeline_Blubankpip.jpg)
###### Exemplo de Pipeline do BlueBank via AWS - CodePipeline
---

### Amazon API Gateway

O **Amazon API Gateway** é um serviço gerenciado que permite que desenvolvedores criem, publiquem, mantenham, monitorem e protejam APIs em qualquer escala com facilidade. APIs agem como a “porta de entrada” para aplicativos acessarem dados, lógica de negócios ou funcionalidade de seus serviços de back-end.

![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/AWS/AWS%20Api%20Gateway.jpg)
###### Exemplo de API Gateway do BlueBank via AWS - API Gateway
---

### Amazon Lambda

O **AWS Lambda** é um serviço de computação sem servidor e orientado a eventos que permite executar código para praticamente qualquer tipo de aplicação ou serviço de backend sem provisionar ou gerenciar servidores.

![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/AWS/Envio%20email%20Lambda.jpg)
###### Exemplo de envio de email para o Cliente via AWS - Lambda
---


### Swagger na AWS

![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/AWS/Swagger_na_Aws.jpg)
###### Swagger na AWS - Elastic Beanstalk
---


## Agradecimentos

###### [Banco PAN](https://www.bancopan.com.br/)
![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/logo_bancoPan.png)


###### [Gama Academy](https://www.gama.academy/)
![](https://github.com/CarmoPJunior/BlueBank/blob/main/src_readme/img/logo_gamaAcademy.png)

Feito com 💙 pela Squad - Undefined Coders 💻