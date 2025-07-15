# consultaLocal

Este projeto é uma aplicação Spring Boot que atua como uma API para consultar dados de outras fontes. Ele serve como uma interface para interagir com vários serviços externos, como consultas de manifestação, informações de agências e detalhes de serviços.

## Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3.1.0**
* **Apache Maven**
* **Lombok**
* **Spring WebFlux** (para serviços reativos)
* **Springdoc OpenAPI** (para documentação da API)
* **H2 Database** (em tempo de execução)

## Primeiros Passos

Para construir e executar a aplicação localmente, siga os passos abaixo:

1.  **Clone o repositório:**
    ```bash
    git clone <URL_DO_SEU_REPOSITORIO>
    cd ApiConsultaOracle
    ```

2.  **Construa o projeto usando Maven:**
    ```bash
    ./mvnw clean install
    ```
    (No Windows, use `mvnw.cmd clean install`)

3.  **Execute a aplicação:**
    ```bash
    ./mvnw spring-boot:run
    ```
    (No Windows, use `mvnw.cmd spring-boot:run`)

A aplicação será iniciada na porta padrão 8080 (ou conforme configurado no `application.properties`).

## Configuração

As configurações da aplicação são definidas em `src/main/resources/application.properties` e `target/classes/application.properties`.

**Exemplo de Configurações:**
```properties
springdoc.swagger-ui.path=/swagger/swagger-ui.html
springdoc.api-docs.path=/swagger/v3/api-docs

consulta-api.usuario=sergio.braun@apoioprodesp.sp.gov.br
consulta-api.senha=40Gbnopc@2GEP20211
