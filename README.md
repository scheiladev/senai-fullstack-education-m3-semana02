# SENAI Fullstack [Education]

## Resolução dos exercícios da Semana 11 - Caixa de Sugestões Anônima

### M3S02 | Ex 1 - Setup

#### Descrição do Projeto

Este projeto servirá como uma aplicação web, onde os usuários podem enviar sugestões, feedbacks ou reclamações de forma anônima. O objetivo é criar um espaço seguro e acessível para que os usuários expressem suas opiniões, contribuindo para a melhoria de produtos, serviços ou ambientes.

Utilize no projeto, ao menos, as dependências:

- Spring Web;
- Spring Data JPA.

**!Atenção!**

- Desenvolver logs em todas as classes de controladores e serviço.

#### Entidades

Crie as entidades com as características abaixo:

- Sugestão:
    - id -> chave primária;
    - titulo -> título da sugestão;
    - descricao -> descrição completa da sugestão;
    - dataEnvio -> data e hora em que a sugestão foi enviada;
    - dataAtualizacao -> data e hora em que a sugestão sofreu alteração.
- Comentário/Resposta:
    - id -> chave primária;
    - sugestaoId -> chave estrangeira referente à sugestão;
    - texto -> texto do comentário ou resposta para a sugestão;
    - dataEnvio -> data e hora em que o comentário/resposta foi enviada.

**Obs.:** Nome de entidades e seus atributos **NÃO** precisam seguir as mesmas nomenclatura do exercício, mas é essencial que sejam desenvolvidas com as características especificadas.

### M3S02 | Ex 2 - Criar sugestões

Criar endpoint para cadastro de sugestões:

Endpoint: _**POST** /sugestoes._

Atenção para:

- Padrões REST;
- Convenções JAVA.

**Obs:** Endpoint **NÃO** precisa seguir a mesma nomenclatura do exercício, mas é essencial que seja desenvolvido com as características especificadas.

### M3S02 | Ex 3 - Consultar todas as sugestões

Criar endpoint para consultar TODAS as sugestões:

- Consultar **todas** as sugestões ordenando pelas atualizadas recentemente ("_dataAtualizacao DESC_");
- Adicionar filtro (não obrigatório) para pesquisar sugestões por título.

‌

Endpoint: _**GET** /sugestões:_

Atenção para:

- Padrões REST;
- Convenções JAVA.

**Obs:** Endpoint **NÃO** precisa seguir a mesma nomenclatura do exercício, mas é essencial que seja desenvolvido com as características especificadas.

### M3S02 | Ex 4 - Consultar sugestão por ID

Criar endpoint para consultar sugestões por ID:

- Consultar sugestão por ID;
- Ordenar **todos os comentários** pelo envio mais recente ("_dataEnvio DESC_").

‌

Endpoint: _**GET** /sugestoes/{id}:_

Atenção para:

- Padrões REST;
- Convenções JAVA.

**Obs:** Endpoint **NÃO** precisa seguir a mesma nomenclatura do exercício, mas é essencial que seja desenvolvido com as características especificadas.

### M3S02 | Ex 5 - Adicionar comentários

Criar endpoint para adicionar comentários em uma sugestões:

- Criar um comentário/resposta para uma sugestão;
- Atualizar o atributo da "_dataAtualizacao_" da sugestão para que a sugestão possa ser exibida no início das consultas.

Endpoint: _**POST** /sugestoes/{id}/comentarios_

Atenção para:

- Padrões REST;
- Convenções JAVA.

**Obs:** Endpoint **NÃO** precisa seguir a mesma nomenclatura do exercício, mas é essencial que seja desenvolvido com as características especificadas.

### M3S02 | Ex 6 - Documentar API

Utilizando Swagger, faça a documentação completa da API:

- Especifique os endpoints;
- Identifique os atributos incluindo exemplos e obrigatoriedades.