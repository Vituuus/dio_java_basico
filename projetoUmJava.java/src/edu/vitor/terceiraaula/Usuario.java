package edu.vitor.terceiraaula;

public class Usuario {// Exemplo de criação de métodos.
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();

        System.out.println("Televisão ligada ? " +smartTv.ligada);
        System.out.println("Volume atual : "+smartTv.volume);
        System.out.println("Canal atual : "+smartTv.canal);

        smartTv.desligarTV();
        System.out.println("Televisão ligada ? " +smartTv.ligada);
        
        smartTv.novoCanal(50);
        System.out.println("Canal atual : "+smartTv.canal);
    }
    
}
   