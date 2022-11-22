/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import interfaces_dominio.IJugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class AggregatePartida {
    
    private int idPartida;
    private Tablero tablero;
    private List<IJugador> jugadores;
    
    public AggregatePartida(){
        this.jugadores = new ArrayList<>();
        this.idPartida = 1;
    }
    
    public void crearTablero(int numCasillas){
        tablero = new Tablero(numCasillas);
    }
    
    public boolean verficarNumJugadores(){
        return jugadores.size() == 4;
    }
    
    public void agregarJugador(IJugador jugador){
        jugadores.add(jugador);
    }
    
    public void moverFichaDeJugador(Jugador jugador, int numeroCasillasPorAvanzar){
        tablero.moverFichaJugador(jugador, numeroCasillasPorAvanzar);
    }
}
