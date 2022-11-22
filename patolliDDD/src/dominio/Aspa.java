/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import Enumeradores.TipoAspa;
import java.util.List;

/**
 * Esta clase representa el aspa del tablero
 * @author Miguel
 */
public class Aspa {
    
    private String tipoAspa;
    private List<Casilla> casillas;
    
    public Aspa(String tipoAspa, List<Casilla> casillas){
        this.tipoAspa = tipoAspa;
        this.casillas = casillas;
    }

    public String getTipoAspa() {
        return tipoAspa;
    }

    public void setTipoAspa(String tipoAspa) {
        this.tipoAspa = tipoAspa;
    }

    public List<Casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(List<Casilla> casillas) {
        this.casillas = casillas;
    }
    
    
}
