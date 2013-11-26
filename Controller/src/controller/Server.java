/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Jeroen
 */

import java.io.*;
import java.net.*;

public class Server {
    
    ServerSocket providerSocket;
    Socket connection = null;
    ObjectOutputStream out;
    ObjectInputStream in;
    String message;

    Server() 
    {        
    }
    
   public void run() {
        try {
            //creating a server socket
            providerSocket = new ServerSocket(2004, 10);
            
            // Wait for connection
            System.out.println("Waiting for connection");
            connection = providerSocket.accept();
            System.out.println("Connection received from " + connection.getInetAddress().getHostName());
            
            //get Input and Output streams
            out = new ObjectOutputStream(connection.getOutputStream());
            out.flush();
            in = new ObjectInputStream(connection.getInputStream());
            sendMessage("Connectie is gelukt");

            //The two parts communicate via the input and output streams
            try 
            {
                message = (String) in.readObject();
                System.out.println("ONTVANGEN>" + message);

            } catch (ClassNotFoundException classnot) 
            {
                System.err.println("Data received in unknown format");
            }


        } 
        catch (IOException ioException) 
        {
            ioException.printStackTrace();
        } 
        finally 
        {
            //4: Closing connection
            try 
            {
                in.close();
                out.close();
                providerSocket.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }		
   
    void sendMessage(String msg) 
    {
        try {
            out.writeObject(msg);
            out.flush();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }  
}


        

