package edu.vitor.segundaaula;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        int a = 2;//Criação e atribuição de valor para a variaável a 
        int b = 3;//Criação e atribuição de valor para a variaável b

        int soma = a + b;// Soma de A e B
        int multiplicacao = a * b;// Multiplicação de A e B
        int subtracao = a - b;// Subtração de A e B
        float divisao =(float) a / b;// Divisão de A e B, note que diferentemente das demais operações a variável divisão é um float, pois seu resultado terá casas decimais, porém não é possivel fazer a divisão de dois numeros inteiros(Resultado = 0.0), para que não seja necessária a modificação dos valor já estipulados (A e B = int) para A e B eu utilizo o "Cast" que define apenas naquele momento que A e B são floats e não ints, deste modo o resultado não é 0.0  
        int modulo = a % b;//A operação módulo tem como objetivo mostrar o resto da divisão de A por B

        System.out.println(soma);
        System.out.println(multiplicacao);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(modulo);

    }
}
