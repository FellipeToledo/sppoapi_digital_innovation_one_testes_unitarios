<h2>Implementação de testes unitários no projeto SPPO-API</h2>

Este projeto tem como objetivo testar, unitariamente, a API REST SPPO. 
Construindo testes unitários nos métodos das classes Service e Controller com JUnit e Mockito para validar o sistema de gerenciamento de consórcios e empresas
desenvolvido em Spring Boot.
Além disso, será desenvolvido funcionalidades da API através da prática do TDD.

As seguintes dependências foram adicionadas ao projeto:

- [spring-boot-starter-actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html) 
- [spring-boot-starter-data-jpa](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#dependencies)
- [spring-boot-starter-web](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#dependencies)
- [spring-boot-devtools](https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html)
- [h2-console](https://github.com/h2database/h2database)
- [lombok](https://projectlombok.org/setup/maven)
- [mapstruct](https://mapstruct.org/documentation/installation/)
- [spring-boot-starter-test](https://spring.io/guides/gs/spring-boot/)
- [junit-vintage-engine](https://mvnrepository.com/artifact/org.junit.vintage/junit-vintage-engine)

Durante o desenvolvimento foram abordados os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de consórcios e empresas (Cadastro, leitura, atualização e remoção).
* Relação de cada uma das operações acima com o padrão arquitetural REST.
* Desenvolvimento de testes unitários para validação das funcionalidades
* Implantação do sistema na nuvem através do Heroku
* Utilização de bibliotecas como Lombock e MappStruct.

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, abra os seguintes endereços para visualizar a execução do projeto:

```
http://localhost:8080/api/v1/consortium
http://localhost:8080/api/v1/company
```


São necessários os seguintes pré-requisitos para a execução do projeto:

* Java 14 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Conta no GitHub para o armazenamento do seu projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem
