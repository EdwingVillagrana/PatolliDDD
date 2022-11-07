/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablero;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author edw_v
 */
public class Tablero implements Graphic {

    private int numCasillas;
    //El tablero contiene una lista<Graphic> que son las aspas y el centro.
    private List<Graphic> listaGraficos;
    int contadorSuperior;
    int contadorInferior;
    int contadorIzquierdo;
    int contadorDerecho;

    /**
     * Constructor que inicializa los atributos de la clase al valor de los
     * parámetros recibidos. Llena la lista de gráficos con los gráficos
     * necesarios para dibujar el tablero.
     *
     * @param numCasillas
     */
    public Tablero(int numCasillas) {
        this.numCasillas = numCasillas;
        
        if(numCasillas == 5){
            this.contadorSuperior = 2;
            this.contadorIzquierdo = 13;
            this.contadorInferior = 24;
            this.contadorDerecho = 35;
        }
        
        if(numCasillas == 6){
            this.contadorSuperior = 2;
            this.contadorIzquierdo = 15;
            this.contadorInferior = 28;
            this.contadorDerecho = 41;
        }
        
        if(numCasillas == 7){
            this.contadorSuperior = 2;
            this.contadorIzquierdo = 17;
            this.contadorInferior = 32;
            this.contadorDerecho = 47;
        }
        
        listaGraficos = new ArrayList<>();
        listaGraficos.add(new Centro(numCasillas));
        listaGraficos.add(new Aspa(contadorSuperior, 480, 360, numCasillas, "superior"));
        listaGraficos.add(new Aspa(contadorIzquierdo, 380, 410, numCasillas, "izquierda"));
        listaGraficos.add(new Aspa(contadorInferior, 430, 510, numCasillas, "inferior"));
        listaGraficos.add(new Aspa(contadorDerecho, 530, 460, numCasillas, "derecha"));
    }

    /**
     * Método obligatorio que utiliza el panel para dibujar un componente.
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    public void paint(Graphics g) {
        dibujar(g);
    }

    /**
     * Método que recorre y dibuja todos los elementos de la lista de gráficos
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    @Override
    public void dibujar(Graphics g) {
        for (Graphic grafico : listaGraficos) {
            grafico.dibujar(g);
        }
    }
}
