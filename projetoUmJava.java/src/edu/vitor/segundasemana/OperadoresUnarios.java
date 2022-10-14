package edu.vitor.segundasemana;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 0;//Declarando a variável e atribuindo um valor]
        boolean b = true;//Criação de variável do tipo bool e declarando ela como true
        //Sulfixos
        a++;//Acrescentando um na variável a
            System.out.println(a);//Nesta impressão a = 1
        a= 2;// Dando para a o valor de 2
            System.out.println(a);//Verificando o novo valor atribuido para a
        a--;//Subtraindo 1 do novo valor de a (2)
            System.out.println(a);//Nesta impressão a = 1
        a =  ~a; //O operador ~ modifica o valor de a, antes positivo ele se torna negativo
            System.out.println(a);// Valor de a = - 2
        b = !b;//O sinal ! nega o valor de b (Booleano Apenas) antes True, agora False
            System.out.println(b);// Valor de b = False
    }
}
