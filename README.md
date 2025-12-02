<<<<<<< HEAD
Projeto Spring Boot gerado automaticamente que serve o site original e adiciona:
- Thymeleaf (página dinâmica)
- Endpoint POST para formulário de contato (salva em banco MySQL)
- JPA/Hibernate com MySQL

Como configurar e executar:
1. Tenha Java 17+ e Maven instalados.
2. Crie um banco MySQL chamado `inclusao`:
   CREATE DATABASE inclusao CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
3. Edite `src/main/resources/application.properties` para ajustar `spring.datasource.username` e `spring.datasource.password`.
4. No diretório do projeto, rode:
   mvn spring-boot:run
5. Acesse: http://localhost:8080/
6. Os contatos submetidos serão salvos na tabela `contatos` (gerada automaticamente).

Observações:
- Para desenvolvimento rápido você também pode usar H2; se quiser, eu posso adicionar perfil `application-dev.properties` com H2.


Credenciais do painel admin (após rodar a aplicação):

- Usuário: `admin`
- Senha: `1234`

Acesse `http://localhost:8080/contatos` para ver o painel (login requerido).
=======
# ProjetoJavaInclusaoDigital
Plataforma web de cursos gratuitos em tecnologia, desenvolvida com Java Spring Boot e integrada ao banco MySQL. O front-end usa HTML5, CSS3 e JavaScript em tema dark responsivo. O projeto organiza conteúdos de programação, desenvolvimento web e banco de dados, permitindo futuras expansões.
>>>>>>> 71ef8cbad1cb509947dbf94295c063d8965735cc
