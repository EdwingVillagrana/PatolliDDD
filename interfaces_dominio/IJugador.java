/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces_dominio;

/**
 * Esta interfaz le da al jugador los metodos que son las acciones dentro
 * del tablero de juego
 * @author Miguel
 */
public interface IJugador {
    
    public boolean moverFicha();
    
    public double pagarApuesta(double paga);
}
