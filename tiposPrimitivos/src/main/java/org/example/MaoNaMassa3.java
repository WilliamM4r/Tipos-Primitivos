package org.example;

import java.util.Scanner;

public class MaoNaMassa3 {

    public static void main(String[] args) {
        arrayDeNomes();
    }

    public static void arrayDeNomes () {

        String alunov;

        Scanner verificar = new Scanner(System.in);

        String[] alunos = {"Alice", "Paulo", "Joao", "Ricardo", "Maria", "Fernando", "Vanessa", "Diogo", "Eliane", "Roberta"};

        System.out.println("Aluno à ser verificado");
        alunov = verificar.nextLine();

        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i].equals(alunov)) {
                System.out.println("Aluno " + alunov + " verificado na posição " + i);
                break;
            }
        }
    }
}
