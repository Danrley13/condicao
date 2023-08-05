package br.senai.sp.sistem.sistem;

import java.util.Scanner;

public class Sistem {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.print("Qual é seu curso: ");
        String curso = teclado.nextLine();

        System.out.print("Qual é o professor que esta avaliando: ");
        String prof = teclado.next();

        System.out.print("Qual aluno esta sendo avaliado: ");
        String aluno = teclado.next();

        System.out.print("Qual a frequendia do Aluno(a) " + aluno + ":");
        int frequencia = teclado.nextInt();

        System.out.println("Qual a nota1?");
        int nota1 = teclado.nextInt();

        System.out.println("Qual a nota2?");
        int nota2 = teclado.nextInt();

        float media = (nota1 + nota2) / 2;


        if (media >= 7 && frequencia >= 75 || media >= 6 && frequencia >= 90) {
            System.out.println(" Voce esta aprovado ");



        } else {

            System.out.println("Voce esta reprovado!!!");
        }
    }
}






