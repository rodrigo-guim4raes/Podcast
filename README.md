# 🎙️ Sistema de Gerenciamento de Podcasts – CENAFLIX

## 1. Introdução
Este projeto consiste no desenvolvimento de um sistema para gerenciamento de podcasts, implementado em Java, com interface gráfica baseada em Swing e persistência de dados utilizando JPA (Hibernate) e MySQL.

O sistema foi desenvolvido como atividade prática do Curso Técnico em Análise e Desenvolvimento de Sistemas, com o objetivo de aplicar os conhecimentos adquiridos em sala de aula, incluindo programação orientada a objetos, padrão DAO, persistência de dados, controle de usuários e desenvolvimento de interface gráfica.

## 2. Objetivos

### 2.1 Objetivo Geral
Desenvolver um sistema desktop capaz de realizar o cadastro, listagem e exclusão de podcasts, com controle de acesso baseado no perfil do usuário.

### 2.2 Objetivos Específicos
- Implementar autenticação de usuários
- Diferenciar permissões entre usuário comum e administrador
- Aplicar o padrão DAO para acesso ao banco de dados
- Utilizar JPA para mapeamento objeto-relacional
- Integrar o sistema a um banco de dados MySQL
- Desenvolver interface gráfica com Java Swing

## 3. Tecnologias Utilizadas
- Java SE
- Swing
- JPA (Jakarta Persistence)
- Hibernate
- MySQL
- NetBeans IDE

## 4. Estrutura do Projeto

```text
src/
├── model
│   ├── Podcast.java
│   └── Usuario.java
├── dao
│   ├── PodcastDAO.java
│   └── UsuarioDAO.java
├── view
│   ├── TelaLogin.java
│   ├── TelaPrincipal.java
│   └── Listagem.java
└── META-INF
    └── persistence.xml
```

## 5. Controle de Acesso
O sistema diferencia usuários comuns e administradores, permitindo que apenas administradores realizem exclusões de registros.

## 6. Conclusão
O projeto permitiu consolidar conhecimentos de Java, persistência de dados e desenvolvimento de aplicações desktop, atingindo os objetivos propostos.
