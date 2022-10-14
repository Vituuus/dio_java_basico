package edu.vitor.terceiraaula;

public class SmartTV {
    boolean ligada = true;
    int volume = 25;
    int canal = 1;

    public void ligarTV() {
        ligada = true;
    }
    public void desligarTV() {
        ligada = false;
        
    }
    public void aumentarVolume() {
        volume++;
    }
    public void abaixarVolume() {
        volume--;
    }
    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }
    public int novoCanal(int numeroCanal){
        return canal = numeroCanal;
    }
}
