package edu.vitor.primeirasemana;
public class MinhaClasse {

    public static void main(String [] args){

      
        String primeiroNome;//Declaração da variável do tipo String que armazena o primeiro nome do usuário
        String segundoNome;//Declaração da variável do tipo String que armazena o segundo nome do usuário
        
        primeiroNome = ("Vitor");//Atribuição de um valor para a variável primeiroNome
        segundoNome = ("Moura");//Atribuição de um valor para a variável segundoNome

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);//Criação de uma variável do tipo String que armazena um método de mesmo nome (nomeCompleto) que aceita duas variáveis do tipo String já declaradas anteriormente

        System.out.println(nomeCompleto);//Impressção da variável nomeCompleto
    }
    public static String nomeCompleto(String nomeUm, String nomeDois){//Criação de um método  que cria um texto e concatena duas Strings em uma só.

        return "Seu nome completo é".concat(" : ").concat(nomeUm).concat(" ").concat(nomeDois);
    }
}
