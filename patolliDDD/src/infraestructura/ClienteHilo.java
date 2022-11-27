/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infraestructura;

import guis.FrmTablero;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class ClienteHilo implements Runnable {

    public static List<ClienteHilo> clientesHilos = new ArrayList<>();
    private Socket socket;
    private FrmTablero frmTablero = new FrmTablero();

    public ClienteHilo(Socket socket) {
        try {
            this.socket = socket;
            clientesHilos.add(this);
        }catch(Exception e){
            
        }
    }

    @Override
    public void run() {
        
        while (socket.isConnected()){
            frmTablero.setVisible(true);
        }
    }
    
    public void removerClienteHilo(){
        clientesHilos.remove(this);
        System.out.println("");
    }
    
    public void cerrarTodo(Socket socket){
        removerClienteHilo();
        try {
            if (socket != null){
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
