/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

//import interfaces_dominio.IJugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class AggregatePartida {
    
    private int idPartida;
    private Tablero tablero;
    private List<Jugador> jugadores;
    
    public AggregatePartida(){
        this.jugadores = new ArrayList<>();
        this.idPartida = 1;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public void crearTablero(int numCasillas){
        tablero = new Tablero(numCasillas);
    }
    
    public boolean verficarNumJugadores(){
        return jugadores.size() == 4;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.idPartida;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AggregatePartida other = (AggregatePartida) obj;
        return this.idPartida == other.idPartida;
    }
    
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    
    public void moverFichaDeJugador(int idJugador, int numeroCasillasPorAvanzar){
        Jugador aux = null;
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getId() == idJugador){
                aux = jugadores.get(i);
            }
        }
        if (aux != null){
            tablero.moverFichaJugador(aux, numeroCasillasPorAvanzar);
        }
    }
}
