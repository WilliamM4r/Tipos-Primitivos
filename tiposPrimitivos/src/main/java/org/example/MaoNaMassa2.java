package org.example;

public class MaoNaMassa2 {

    static void main(String[] args) {
        arrayDeNomes();
    }

    public static void arrayDeNomes () {
        String[] alunos = {"Alice", "Paulo", "Joao", "Ricardo", "Maria", "Fernando", "Vanessa", "Diogo", "Eliane", "Roberta"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(i + " " + alunos[i]);
        }
    }
}
