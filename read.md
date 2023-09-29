## Blog com Spring Boot

Este projeto é um blog básico criado em Spring Boot que tem como objetivo
aprimorar os conhecimento em redenrização de páginas com Thymeleaf.

## Instalação

- Instale o JAVA em sua máquina. Baixe o JDK da Oracle no site oficial.
  (https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

- Utilizaremos o Maven para gerenciar as dependências. Instale o maven.
  (https://maven.apache.org/download.cgi)

- Como banco, utilizamos o Postgres.
  (https://www.postgresql.org/download/)

- Clone o projeto em sua máquina;

- Atualize as dependências no pom.xml;

- Configure o banco da sua máquina no application.properties;


## Rodando o Projeto

-- Acesso o arquivo BlogApplication e rode ele;

-- Acesse no seu navegador http://localhost::8080/

-- Na pasta Controller, você consegue ter acesso aos caminhos para as solicitações HTTP.

- Na pasta templates, há os arquivos .html para edição conforme seu gosto.


## Entendendo o Thymeleaf

O Thymeleaf é uma biblioteca de template engine para a linguagem Java. Com ele
é possível criar apáginas HTM dinâmicas.
A biblioteca é baseada em HTML, e permite a injeção de dependências JAVAs nos
templates, facilitando a utilização com frameworks, como o popular Spring Boot.
Você pode ver na prática como utilizar nos arquivos .html na pasta templates.

Exemplo de como utilizar:

    <p> Bem vindo, <span th:text="${nomeDaVariavelNome}"></span></p>

