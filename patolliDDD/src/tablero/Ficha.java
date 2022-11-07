/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tablero;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author edw_v
 */
public class Ficha implements Graphic{

    private int numeroFicha;
    private Color color;
    private int x;
    private int y;
    private int numeroJugador;
    private boolean fichaEnJuego;
    private final int INGRESAR = 0;
    private final int MOVER = 1;

    public Ficha(int numeroFicha, Color color, int x, int y, int numeroJugador) {
        this.numeroFicha = numeroFicha;
        this.color = color;
        this.x = x;
        this.y = y;
        this.numeroJugador = numeroJugador;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isFichaEnJuego() {
        return fichaEnJuego;
    }

    public void setFichaEnJuego(boolean fichaEnJuego) {
        this.fichaEnJuego = fichaEnJuego;
    }
    
    @Override
    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(color);
        g2.fillOval(x, y, 30, 30);
    }
    
    public void paint(Graphics g){
        dibujar(g);
    }
}
