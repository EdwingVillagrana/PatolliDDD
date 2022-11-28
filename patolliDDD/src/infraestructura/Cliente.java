/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infraestructura;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Miguel
 */
public class Cliente {
    
    private Socket socket;
    private String nombreDeUsuario;
    
    public Cliente(String nombreDeUsuario){
        try {
            this.socket = new Socket("localhost", 6000);
            this.nombreDeUsuario = nombreDeUsuario;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void salirDePartida(Socket socket){
        try {
            if (socket != null){
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Miguel");
        
    }
}
