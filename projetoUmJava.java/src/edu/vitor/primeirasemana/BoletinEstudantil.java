package edu.vitor.primeirasemana;
public class BoletinEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6; //Declara a variavél que recebe a nota do aluno
        if(mediaFinal<6)//Verifica se a nota do aluno é menor que 6
            System.out.print("REPROVADO!");//Neste caso a mensagem "REPROVADO" será exibida
        else if(mediaFinal==6)//Caso a verificação anterior falhe é feita uma outra, verificando se a nota é idêntica a 6
            System.out.print("PROVA MINERVA!");//Neste caso a mensagem "PROVA MINERVA" é exibida    
        else//Por fim se nenhuma das duas opções forem atendidas o código cai nessa última opção
            System.out.print("APROVADO!");//A mensagem "APROVADO" é exibida.
        
        
    }
    
}