/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios_de_dominio;

import dominio.AggregatePartida;
import java.util.Random;

/**
 *
 * @author Miguel
 */
public class Juego {
    
    private int idPartida;
    private boolean cañas[];
    private double fondoApuestas;
    
    public Juego(AggregatePartida partida){
        this.idPartida = partida.getIdPartida();
    }
    
    /**
     * Crea el tablero de la partida
     */
    public void crearTablero(){
        //TODO: usar el idPartida para crear el tablero
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
