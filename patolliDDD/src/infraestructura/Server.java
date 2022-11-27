/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infraestructura;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class Server {
    
    private ServerSocket serverSocket;

    public Server() {
        try {
            this.serverSocket = new ServerSocket(6000);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            cerrarServerSocket();
        }
    }
    
    public void iniciarServidor(){
        try{
            
            while (!serverSocket.isClosed()){
                Socket socket = serverSocket.accept();
                System.out.println("Un nuevo jugador se ha conectado");
                ClienteHilo clienteHilo = new ClienteHilo(socket);
                Thread thread = new Thread(clienteHilo);
                thread.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            cerrarServerSocket();
        }
    }
    
    public void cerrarServerSocket(){
        try {
            if (serverSocket != null){
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.iniciarServidor();
    }
}
