/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablero;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;

/**
 *
 * @author edw_v
 */
public class Casilla implements Graphic {

    private int numeroCasilla;
    //Coordenadas de los ejes en donde se va a dibujar la casilla.
    private int x;
    private int y;
    //Atributos utilizados para casillas triangulares solamente.
    private int[] xT;
    private int[] yT;
    //Atributos utilizados para casillas circulares solamente.
    private double anguloInicial;
    private double anguloFinal;
    private final int tipoCasilla;

    /**
     * Constructor que inicializa los atributos de la clase al valor de sus
     * parámetros.
     *
     * @param x coordenada en el eje de las X en donde se va a iniciar el dibujo
     * de la casilla.
     * @param y coordenada en el eje de las Y en donde se va a iniciar el dibujo
     * de la casilla.
     * @param tipoCasilla identificador del tipo de casilla que se va a crear. 
     * 1 = casilla central. 2 = casilla cuadrada. 3 = casilla cuadrada con castigo. 4 = casilla redonda. 5 = casilla triangular.
     */
    public Casilla(int numeroCasilla, int x, int y, int tipoCasilla) {
        this.numeroCasilla = numeroCasilla;
        this.x = x;
        this.y = y;
        this.xT = null;
        this.yT = null;
        this.tipoCasilla = tipoCasilla;
    }

    /**
     * Constructor que inicializa los atributos de la clase al valor de sus
     * parámetros.
     *
     * @param xT arreglo con las coordenadas en x para dibujar el triángulo.
     * @param yT arreglo con las coordenadas en y para dibujar el triángulo
     * @param tipoCasilla identificador del tipo de casilla que se va a crear. 
     * 1 = casilla central. 2 = casilla cuadrada. 3 = casilla cuadrada con castigo. 4 = casilla redonda. 5 = casilla triangular.
     */
    public Casilla(int[] xT, int[] yT, int tipoCasilla) {
        this.xT = xT;
        this.yT = yT;
        this.tipoCasilla = tipoCasilla;
    }

    /**
     *
     * @param x coordenada en el eje de las X en donde se va a iniciar el dibujo
     * de la casilla.
     * @param y coordenada en el eje de las Y en donde se va a iniciar el dibujo
     * de la casilla.
     * @param anguloInicial valor en donde se va a iniciar a dibujar el ángulo.
     * @param anguloFinal valor del ángulo.
     * @param tipoCasilla identificador del tipo de casilla que se va a crear. 
     * 1 = casilla central. 2 = casilla cuadrada. 3 = casilla cuadrada con castigo. 4 = casilla redonda. 5 = casilla triangular.
     */
    public Casilla(int numeroCasilla, int x, int y, double anguloInicial, double anguloFinal, int tipoCasilla) {
        this.numeroCasilla = numeroCasilla;
        this.x = x;
        this.y = y;
        this.anguloInicial = anguloInicial;
        this.anguloFinal = anguloFinal;
        this.tipoCasilla = tipoCasilla;
    }

    /**
     * Método que dibuja una casilla en el JPanel. Utiliza Graphics2D para
     * aumentar el grosor y el color de las líneas.
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    @Override
    public void dibujar(Graphics g) {
        if (tipoCasilla == 1 || tipoCasilla == 2 || tipoCasilla == 3) {
            casillaCuadrada(g);
        }
        if (tipoCasilla == 4) {
            casillaCircular(g);
        }
        if (tipoCasilla == 5) {
            casillaTriangular(g);
        }
    }

    /**
     * Método para dibujar una casilla cuadrada
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    public void casillaCuadrada(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.white);
        g2.fillRect(x, y, 50, 50);
        g2.setStroke(new BasicStroke(2.0f));
        g2.setColor(Color.black);
        g2.drawRect(x, y, 50, 50);
    }

    /**
     * Método para dibujar una casilla triangular
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    public void casillaTriangular(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.fillPolygon(xT, yT, 3);

    }

    /**
     * Método para dibujar una casilla circular
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    public void casillaCircular(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2.0f));
        g2.setColor(new Color(188, 156, 37));
        g2.fill(new Arc2D.Double(x, y, 100, 100, anguloInicial, anguloFinal, Arc2D.PIE));
        g2.setColor(Color.black);
        g2.draw(new Arc2D.Double(x, y, 100, 100, anguloInicial, anguloFinal, Arc2D.PIE));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
