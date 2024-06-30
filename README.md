# Controle de Conta Bancária

Este projeto foi desenvolvido como parte de um desafio, com o objetivo de criar uma aplicação para controlar uma conta bancária, permitindo realizar operações de depósito, saque, consulta de saldo e finalização da aplicação.

## Objetivos do Projeto

1. **Cabeçalho Inicial**
   - Criar um cabeçalho inicial com os dados do cliente:
     - Nome
     - Tipo da Conta
     - Saldo

2. **Menu de Operações**
   - Criar um menu que descreve as operações:
     - Entrada de valor (depósito)
     - Saída de valor (saque)
     - Consulta de saldo
     - Finalização da aplicação
   - Usei a classe Scanner para fazer a leitura da opção do usuário.
   - O menu aparece continuamente até que o usuário escolha a opção para sair.
   - Validei a saída de valores para garantir saldo suficiente.
   - Exibir mensagem de opção inválida para entradas incorretas.

## Tecnologias Utilizadas

- Java
- IDE: IntelliJ IDEA / Eclipse

## Estrutura do Projeto

1. **Classe Cliente**
   ```java
   public class Cliente {
       private String nome;
       private String tipoConta;
       private double saldo;

       public Cliente(String nome, String tipoConta, double saldo) {
           this.nome = nome;
           this.tipoConta = tipoConta;
           this.saldo = saldo;
       }

       // Getters e Setters
   }
