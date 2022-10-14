package edu.vitor.segundaaula;

public class OperadoresTernarios {
    public static void main(String[] args) {
        int a = 8;/* Atribuição de valores a variáveis*/
        int b = 6;
        int c = 5;
        int d = 7;
        /* Realizando operação de verificação utilizando laço IF
        String mediaFinal = "";
        if ((a+b+c+d)/4 > 6)
            mediaFinal = "Aprovado";
        else
            mediaFinal = "Reprovado";*/

        String mediaFinal = (a+b+c+d)/4 > 6 ? "Aprovado" : "Reprovado"; // Mesma operação do IF anterior utilizando Operador Ternário

        System.out.println(mediaFinal);
    }
}
