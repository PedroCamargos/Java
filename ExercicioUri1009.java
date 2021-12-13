package br.com.abr.introducao.ExerciciosUri;

//        Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total
//        de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor
//        ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber
//        no final do mês, com duas casas decimais.
//
//        Entrada
//        O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de
//        dupla precisão (double) com duas casas decimais, representando o salário fixo do
//        vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.
//
//        Saída
//        Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.

import java.util.Scanner;

public class ExercicioUri1009 {
    public static void main (String [] args) {

        Scanner leitor = new Scanner(System.in);

        String nomeVendedor = leitor.nextLine();
        double salarioFixo = leitor.nextDouble();
        double vendasMes = leitor.nextDouble();

        double totalReceber = (vendasMes * 0.15 ) + salarioFixo;

        System.out.println("TOTAL = R$ "+String.format("%.2f", totalReceber));

    }
}
