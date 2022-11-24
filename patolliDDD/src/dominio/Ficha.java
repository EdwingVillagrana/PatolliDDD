/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 * Esta entidad representa la ficha del jugador
 *
 * @author Miguel
 */
public class Ficha {

    private int idFicha;
    private int coordenadasX;
    private int coordenadasY;
    private String color;
    private int numCasilla;

    public Ficha(int idFicha, String color) {
        this.color = color;
        this.idFicha = idFicha;
    }

    public Ficha(int idFicha, int coordenadasX, int coordenadasY, String color) {
        this.idFicha = idFicha;
        this.coordenadasX = coordenadasX;
        this.coordenadasY = coordenadasY;
        this.color = color;
    }

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumCasilla() {
        return numCasilla;
    }

    public void setNumCasilla(int numCasilla) {
        this.numCasilla = numCasilla;
    }

    public int getCoordenadasX() {
        return coordenadasX;
    }

    public void setCoordenadasX(int coordenadasX) {
        this.coordenadasX = coordenadasX;
    }

    public int getCoordenadasY() {
        return coordenadasY;
    }

    public void setCoordenadasY(int coordenadasY) {
        this.coordenadasY = coordenadasY;
    }

    public boolean fichaSigueEnJuego() {
        // TODO: procedimiento del metodo
        return false;
    }

    public boolean fichaYaIngresoATablero() {
        // TODO: procedimiento del metodo
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.idFicha;
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
        final Ficha other = (Ficha) obj;
        return this.idFicha == other.idFicha;
    }

}
