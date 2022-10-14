package edu.vitor.segundaaula;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int a = 5; // Declaração e atribuição de um valor para a
        int b = 10;// Declaração e atribuição de um valor para b

        boolean simNao = (a > b);// > é utilizado para verificar se A é Maior que B
            System.out.println("A é 'MAIOR' que B : "+ simNao);
        simNao = (a < b);// < é utilizado para verificar se A é Menor que B
            System.out.println("A é 'MENOR' que B : " + simNao);
        simNao = (a == b);// == é utilizado para verificar se A é Igual que B (Note que == é diferente de =, = é utilizado para atribuir um valor ex: a = 10, neste caso a variável a vale 10, já o == serve para comparar valores, ex: a==b, neste caso o que está acontecendo é uma comparação de a e b)  
            System.out.println("A é 'IGUAL' a B : " + simNao);
        simNao = (a != b);// != é utilizado para verificar se A é Diferente que B       
            System.out.println("A é 'DIFERENTE' de B : " + simNao);
    }
}
