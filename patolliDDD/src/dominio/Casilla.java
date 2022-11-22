/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 * Representa la casilla del tablero
 *
 * @author Miguel
 */
public class Casilla {

    private String tipoCasilla;
    private int numCasilla;
    private Ficha ficha;
    private boolean estado;

    public Casilla(int numCasilla, String tipoCasilla) {
        this.numCasilla = numCasilla;
        this.tipoCasilla = tipoCasilla;
    }

    public String getTipoCasilla() {
        return tipoCasilla;
    }

    public void setTipoCasilla(String tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNumCasilla() {
        return numCasilla;
    }

    public void setNumCasilla(int numCasilla) {
        this.numCasilla = numCasilla;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.numCasilla;
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
        final Casilla other = (Casilla) obj;
        return this.numCasilla == other.numCasilla;
    }

    /**
     * Asigna a la casilla la ficha en caso de que este vacia
     *
     * @param ficha del jugador que ocupara la casilla
     * @return true si se pudo ocupar la casilla o false si la casilla esta
     * ocupada
     */
    public boolean ocuparCasilla(Ficha ficha) {
        if (isEstado()) {
            return false;
        } else {
            this.setFicha(ficha);
            this.setEstado(true);
            return true;
        }
    }

    /**
     * Desocupa la casilla removiendo la ficha de esta casilla
     */
    public void desocuparCasilla() {
        this.setFicha(null);
    }
}
