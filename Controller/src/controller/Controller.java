/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;

/**
 *
 * @author Jeroen
 */
public class Controller {

    /**
     * @param args the command line arguments
     */
    
    public List<Container> containerList;
    public static void main(String[] args) {
        // TODO code application logic here
        
        XML_parser xml = new XML_parser("hoi");
        xml.xml_values("hoi");      
    }
}
