# Crud_Blog_Whit_Login_Angular_SpringBoot_jwt
Tecnologias ultilizadas no projeto:
- [JDK 8: Necessário para executar o projeto Java](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- [Maven 3.6: Necessário para realizar o build do projeto Java](http://mirror.nbtelecom.com.br/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip)
- [Postgresql 12 ](http://www.enterprisedb.com/postgresql-tutorial-resources-training?cid=48)
- [ SpringBoot 2.3.2](https://spring.io/projects/spring-boot)
- [Angular 8](https://angular.io/)
- [Node 10](https://nodejs.org/en/)

## Desenvolvimento

Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub num diretório de sua preferência:

```shell
cd "diretorio de sua preferencia"
git clone https://github.com/socrammol/Crud_Blog_Whit_Login_Angular_SpringBoot_jwt
```
### Iniciando
Apos a instalação dos requesitos sera necessario a criação de um banco no chamado postgres
a senha padrao deixada no projeto e root, caso queira pode-se alterar o banco a senha e o usuario no application.properties
### Construção
#### Back
Para construir o projeto Back com o Maven, executar os comando abaixo:

```shell
mvn clean install
```

O comando irá baixar todas as dependências do projeto e criar um diretório *target* com os artefatos construídos, que incluem o arquivo jar do projeto. Além disso, serão executados os testes unitários, e se algum falhar, o Maven exibirá essa informação no console.
####Front
Para construir o projeto Front com o node/Angular, executar os comando abaixo:

```shell
npm install
npm start
```

Apos isso pode-se acessar o sistema pelo link [Sistema](http://localhost:4200/).

Lembrando que a porta do sistema de front e a 4200 e a do back e a 8086 e podem ser trocada,

apos abrir o sistema , tem a nessecidade de criar um usuario no Sign Up, apos isso pode-se acessar o sistema pelo  Login
e possivel incluir arquivos no sistema , mas devida ha algumas complicação tecnicas junto ao jwt nao esta sendo possivel acessa-las