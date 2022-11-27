/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios_de_dominio;

import dominio.AggregatePartida;
import interfaces_dominio.IAggregateRoot;
import java.util.Random;

/**
 *
 * @author Miguel
 */
public class Juego {
    
    private IAggregateRoot partida;
    private boolean cañas[] = new boolean[5];
    private double fondoApuestas;
    
    public Juego(IAggregateRoot partida){
        this.partida = partida;
    }
    
    /**
     * Crea el tablero de la partida
     * @param numeroDeCasillas
     */
    public void crearTablero(int numeroDeCasillas){
        partida.crearTablero(numeroDeCasillas);
    }
    
    /**
     * Realiza la simulacion de lanzar cañas y regresa el numero de ficha con punto
     * @return el numero de fichas con punto
     */
    public int lanzarCanias(){
        int cont = 0;
        Random random = new Random();
        for (int i = 0; i < cañas.length; i++) {
            cañas[i] = random.nextBoolean();
            if (cañas[i]){
                cont++;
            } 
        }
        return cont;
    }
    
    public void ejercerTurno(){
        // TODO: procedimiento de ejercer el turno de moverFicha o pagar apuesta con sus respectivas condiciones
    }
    
    
}
