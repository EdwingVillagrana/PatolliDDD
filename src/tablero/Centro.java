/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablero;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class Centro implements Graphic {

    private List<Graphic> casillasCentrales;
    private int casillaSuperiorDerecha;
    private int casillaSuperiorIzquierda;
    private int casillaInferiorIzquierda;
    private int casillaInferiorDerecha;

    public Centro(int numCasillas) {
        if (numCasillas == 5) {
            this.casillaSuperiorDerecha = 1;
            this.casillaSuperiorIzquierda = 12;
            this.casillaInferiorIzquierda = 23;
            this.casillaInferiorDerecha = 34;
        }

        if (numCasillas == 6) {
            this.casillaSuperiorDerecha = 1;
            this.casillaSuperiorIzquierda = 14;
            this.casillaInferiorIzquierda = 27;
            this.casillaInferiorDerecha = 40;
        }

        if (numCasillas == 7) {
            this.casillaSuperiorDerecha = 1;
            this.casillaSuperiorIzquierda = 16;
            this.casillaInferiorIzquierda = 31;
            this.casillaInferiorDerecha = 46;
        }
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
     * Método que inicializa la lista a un arraylist y lo llena con las casillas
     * centrales, las cuales siempre tendrán las mismas coordenadas
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    @Override
    public void dibujar(Graphics g) {
        casillasCentrales = new ArrayList<Graphic>();
        casillasCentrales.add(new Casilla(casillaSuperiorDerecha, 480, 410, 1));
        casillasCentrales.add(new Casilla(casillaSuperiorIzquierda, 430, 410, 1));
        casillasCentrales.add(new Casilla(casillaInferiorIzquierda, 430, 460, 1));
        casillasCentrales.add(new Casilla(casillaInferiorDerecha, 480, 460, 1));

        for (Graphic casilla : casillasCentrales) {
            casilla.dibujar(g);
        }
    }

}
