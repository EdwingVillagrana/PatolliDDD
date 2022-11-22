/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import Enumeradores.TipoAspa;
import Enumeradores.TipoCasilla;
import interfaces_dominio.IJugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class Tablero {
    
    private int idTablero;
    private Aspa aspas[];
    private int numeroCasilla = 0;
    
    public Tablero(int numCasillas){
        aspas = new Aspa[4];
        aspas[0].setTipoAspa(TipoAspa.SUPERIOR.name());
        aspas[1].setTipoAspa(TipoAspa.IZQUIERDA.name());
        aspas[2].setTipoAspa(TipoAspa.INFERIOR.name());
        aspas[3].setTipoAspa(TipoAspa.DERECHA.name());
        
        llenarAspa(numCasillas, 0);
        llenarAspa(numCasillas, 1);
        llenarAspa(numCasillas, 2);
        llenarAspa(numCasillas, 3);
    }

    public int getIdTablero() {
        return idTablero;
    }

    public void setIdTablero(int idTablero) {
        this.idTablero = idTablero;
    }

    public Aspa[] getAspas() {
        return aspas;
    }

    public void setAspas(Aspa[] aspas) {
        this.aspas = aspas;
    }

    public int getNumeroCasilla() {
        return numeroCasilla;
    }
    
    /**
     * Regresa un numero diferente para cada casilla
     * @return numero de casilla
     */
    private int asignarNumeroCasilla(){
        int numCasilla = this.numeroCasilla;
        this.numeroCasilla++;
        return numCasilla;
    }
    
    /**
     * Llena las aspas con casillas que depende del numero de casillas que reciba
     * @param numCasillas el numero de casillas para todas las aspas pero se divide entre 4 para cada aspa
     * @param numAspa el numero de aspa que se le llenaran de casillas
     */
    private void llenarAspa(int numCasillas, int numAspa){
        List<Casilla> listaCasillas = new ArrayList<>();
        int casillas = numCasillas / 4;
        listaCasillas.add(new Casilla(asignarNumeroCasilla(), TipoCasilla.CENTRAL.name()));
        for (int i = 0; i < casillas; i++) {
            if (i < casillas - 6){
                listaCasillas.add(new Casilla(asignarNumeroCasilla(), TipoCasilla.CUADRADA.name()));
            } else if (i < casillas - 2){
                listaCasillas.add(new Casilla(asignarNumeroCasilla(), TipoCasilla.CUADRADA_CON_CASTIGO.name()));
            } else if (i >= casillas - 2){
                listaCasillas.add(new Casilla(asignarNumeroCasilla(), TipoCasilla.REDONDA.name()));
            }
        }
        aspas[numAspa].setCasillas(listaCasillas);
    }
    
    public void moverFichaJugador(Jugador jugador, int numCasillasPorAvanzar){
        
    }
    
    /**
     * Verifica si la casilla del parametro esta ocupada
     * @param numCasilla casilla que se busca verificar
     * @return true or false depende del estado de la casilla
     */
    public boolean verificarCasilla(int numCasilla){
        for (int i = 0; i < 4; i++) {
            if (aspas[i].getCasillas().get(i).getNumCasilla() == numCasilla){
                return aspas[i].getCasillas().get(i).isEstado();
            }
        }
        return false;
    }
}
