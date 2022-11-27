/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces_dominio;

import dominio.Jugador;

/**
 *
 * @author Miguel
 */
public interface IAggregateRoot {
    
    public void crearTablero(int numCasillas);
    
    public boolean verficarNumJugadores();
    
    public void agregarJugador(Jugador jugador);
    
    public void moverFichaDeJugador(int idJugador, int numeroCasillasPorAvanzar);
}
