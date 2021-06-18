/* 
Crie um programa em Java na qual:
- Solicite o nome do usuário e sua senha.
- Solicite para onde o usuário gostaria de viajar com as opções: inglaterra, floripa, Eua.
- Usuario define o preço que quiser para viagem e refeicao, a viagem não pode ser menos de 1000 reais.
- Solicite o preço da refeição diaria que o usuário gostaria de fazer na viagem.
Logo após exiba a frase “Olá ‘nome’, sua viagem vai custar um total de R$00,00”.
O valor da viagem é R$%.2f, tem um total de R$%.2f de desconto nos restaurantes da cidade
 */
package com.mycompany.talita.cabral.ac1;

import java.util.Scanner;

public class viagem {

    public static void mostrarOpcoes() {
        System.out.println("Digite o lugar que gostaria de viajar:\n"
                + "1 para inglaterra\n"
                + "2 para floripa\n"
                + "3 para eua\n"
                + "Digite: ");
    }

    public static Double calcularDesconto(Double refeicao) {
        return ((30 * refeicao) / 100);
    }

    public static void mostrarResultado(Double valorViagem, Double desconto) {
        System.out.println(String.format("O valor da viagem é R$%.2f, tem um total de R$%.2f de desconto nos restaurantes da cidade", valorViagem, desconto));
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer inglaterra = 0, floripa = 0, eua = 0, contagem = 0, numero;
        String usuario, senha;
        Double valorViagem, refeicao, desconto, totalViagem;
        Boolean loginCorreto;

        do {
            System.out.println("Digite o seu nome: ");
            usuario = leitor.next();

            System.out.println("Digite sua senha: ");
            senha = leitor.next();

            loginCorreto = "talita".equals(usuario) && "123".equals(senha);
            if (loginCorreto) {
                System.out.println("Agora você está pronto para escolher sua viagem!");
            } else {
                System.out.println("Login e/ou Senha invalidos\nTente novamente!");
            }

        } while (!loginCorreto);

        while (contagem < 1) {
            mostrarOpcoes();
            numero = leitor.nextInt();
            contagem++;

            if (numero == 1) {
                inglaterra++;
                System.out.printf("Uma otima escolha de viagem para %d inglaterra \n", inglaterra);
            } else if (numero == 2) {
                floripa++;
                System.out.printf("Uma otima escolha de viagem para %d floripa \n", floripa);
            } else if (numero == 3) {
                eua++;
                System.out.printf("Uma otima escolha de viagem para %d eua \n", eua);
            }

            //Exibindo o valor da viagem
            System.out.println("Digite o valor de sua viagem:");
            valorViagem = leitor.nextDouble();

            System.out.println("Digite o custo que será sua refeição por dia:");
            refeicao = leitor.nextDouble();

            totalViagem = valorViagem + refeicao;
            desconto = calcularDesconto(refeicao);

            mostrarResultado(valorViagem, desconto);

        }
    }
}
