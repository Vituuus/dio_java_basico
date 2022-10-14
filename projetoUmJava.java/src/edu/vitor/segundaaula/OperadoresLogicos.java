package edu.vitor.segundaaula;

public class OperadoresLogicos {
    public static void main(String[] args) {
       boolean a,b;
       
       a = true;
       b = true;

       if (a && b) // Para A e B necessáriamentes iguais o resultado é exibido (Tanto positivo quanto negativo)
            System.out.println("A e B são iguas");

       a = true;
       b = false;

       if (a || b)// Para um dos dois positivos o resultado é exibido
            System.out.println("Uma das variáveis é positiva");
    }
      
}
