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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Server {
    
    List<HashMap<String, String>> containerList = new ArrayList<HashMap<String, String>>();
    
    ServerSocket serverSocket;
    Socket socket = null;
    ObjectOutputStream out;
    ObjectInputStream in;
    String message;

    Server(List<HashMap<String, String>> containerList) 
    { 
        this.containerList = containerList;
    }
    
//   public void run() {
//        try {
//            //creating a server socket
//            providerSocket = new ServerSocket(2004, 10);
//            
//            // Wait for socket
//            System.out.println("Waiting for socket");
//            socket = providerSocket.accept();
//            System.out.println("Connection received from " + socket.getInetAddress().getHostName());
//            
//            //get Input and Output streams
//            out = new ObjectOutputStream(socket.getOutputStream());
//            out.flush();
//            in = new ObjectInputStream(socket.getInputStream());
//            
//            
//            sendMessage(containerList.get(0).toString());
//            
//
//            //The two parts communicate via the input and output streams
//            try 
//            {
//                message = (String) in.readObject();
//                System.out.println("ONTVANGEN>" + message);
//
//            } catch (ClassNotFoundException classnot) 
//            {
//                System.err.println("Data received in unknown format");
//            }
//
//
//        } 
//        catch (IOException ioException) 
//        {
//            ioException.printStackTrace();
//        } 
//        finally 
//        {
//            //4: Closing socket
//            try 
//            {
//                in.close();
//                out.close();
//                providerSocket.close();
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//            }
//        }
//    }		
    
    public void run()
    {
        try {
            //create a server socket
            serverSocket = new ServerSocket(2004, 10);
            
            System.out.println("Waiting for socket");
            socket = serverSocket.accept();
            System.out.println("Connection received from " + socket.getInetAddress().getHostName());
            
            //get Input and Output streams.
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            
        }
        catch (IOException ioException) 
        {
            ioException.printStackTrace();
        }
//         finally 
//        {
//            //4: Closing socket
//            try 
//            {
//                in.close();
//                out.close();
//                serverSocket.close();
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//            }
//        }
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


        

