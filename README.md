# Sistema de Fifeiros do Cordeiro 

Projeto que tem como principio realizar registros de desempenho de partidas em relação ao fifa, intercalando número de partidas, derrotas e vitorias 
nos confrontos 

## Conhecimentos Adquiridos nesse projeto 

Integração de APIS - (Interface de Programação de Aplicação), onde foi feito uma arquitetura Monólito para receber na otimização da velocidade 
entre as requisições feitas pelo comando dos usuários. As APIS foram autenticadas através de Tokens que distribui por camadas de segurança 
a geração dos dados por rotas definidas em entidades. Essas informações são geradas pelo SGDB - Sistema de Gerenciamentos de banco de dados, vinda do 
pacote Controller que é responsavel por controlar o fluxo de cadastro, alteração, listagem e exclusão dos dados. Esse pacote vai esta atrelado as camadas
dos services que vai obter a finalidade de cadastrar, alterar, listar e excuir essas informações das tabelas e atributos vindas do banco e vai passar no 
pacote model que é responsavel por criar as entidades para constituir esses resultados de informações. 

Foi usado para o projeto o Dto que obtém a ideia de consistir basicamente, 
o agrupamento de conjunto de atributos em varias classes simples de forma a otimizar a comunicação.

## Tecnologia Utilizada para Back - End 

-[Java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR) 

-[JDBC](https://www.oracle.com/br/database/technologies/appdev/jdbc.html) 

-[Mysql](https://www.mysql.com/)

-[Jsp](https://www.ibm.com/docs/pt-br/rsas/7.5.0?topic=files-javaserver-pages-jsp-technology) 

-[Spring Boot](https://spring.io/projects/spring-boot) 

-[Insomnia](https://insomnia.rest/download) 

## Depedencias do Spring Boot 

-[Lombok](https://imasters.com.br/back-end/projeto-lombok-escrevendo-menos-codigo-em-java) 

-[Spring Dev Tools](https://www.javatpoint.com/spring-boot-devtools) 

-[Maven](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)

-[Versão 17](https://www.oracle.com/br/java/technologies/javase/jdk17-archive-downloads.html)

-[Spring Boot Start Web](https://www.javatpoint.com/spring-boot-starter-web)

## Tecnologia Utilizada para Front - End 

-[Vue Js](https://vuejs.org/) - versão 3 

## Pacotes para o Vue Js 

-[node](https://nodejs.org/en/download) 

-[npm](https://docs.npmjs.com/downloading-and-installing-node-js-and-npm)

-[vueCli 5.0](https://www.npmjs.com/package/@vue/cli/v/5.0.8)

## Depedências do Vue Js 

-[Axios](https://axios-http.com/ptbr/docs/intro) 

-[npm Bootstrap](https://www.npmjs.com/package/bootstrap) 

-[Materialize Css](https://materializecss.com/)

## Rotas do Spring Boot - Sistema de Fifeiros do Cordeiro 

Precisa adicionar essas rotas no Postman, Insomnia ou Navegadores para ver os dados do back - end, vindas pelo banco de dados.

Entidade Usuario - localhost:8080/usuario 

## Informações sobre a Api do Sistema de Fifeiros do Cordeiro

  ```bash 
  
  $ Vai mostrar as todas as informações da API do Sistema, pelo banco de dados no programa Insomnia
 
```

## Baixar e visualizar o Projeto 

  ```bash 
  
  $ fazer um git clone do projeto pelo terminal, através - https://github.com/ghdss26/Cdp.git
  
  $ Obter o Eclipse ou intellij instalado na sua maquina
  
  $ Ter Instalado e configurado o My Sql Workbench 
  
  $ Obter Java Jre e Jdk na versão 11.0 para ver o funcionamento do projeto e Testar ele
  
  $ Obter sua conexão ativa no Banco de dados como servidor local 
  
  $ Possuir um programa Postman ou Insmonia para copiar e colar as rotas das entidades e ver o crud completo
 
```
## Como executar o projeto no Spring Boot no terminal ou vscode

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/ghdss26/Fifeiros.git

# entrar na pasta do projeto fifeiros
cd fifeiros 
cd back-end 

# executar o projeto
./mvnw spring-boot:run
```
## Como executar o projeto no Vue no terminal ou vscode

```bash
# clonar repositório
git clone https://github.com/ghdss26/Fifeiros.git

# entrar na pasta do projeto fifeiros
cd fifeiros 
cd front-end 

# executar o projeto
npm start run 

digitar no navegador: http://localhost/8081 
```

