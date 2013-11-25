/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Jeroen
 */
public class Container {
    
    // EVT. PUBLIC FINAL? VRAGEN AAN JOS;
    
    private String aankomst_datum;
    private String aankomst_tijd;
    private String aankomst_vervoer;
    private String aankomst_bedrijf;
    
    private String vertrek_datum;
    private String vertrek_tijd;
    private String vertrek_vervoer;
    private String vertrek_bedrijf;
    
    private String eigenaar;
    private int container_nr;
    private int gewicht_leeg;
    private int gewicht_inhoud;
    private String inhoud;
    private  String soort;
    private String gevaar;
    private String ISO;
    
    private int x;
    private int y;
    private int z;
    
    public Container(String aankomst_datum, String aankomst_tijd, String aankomst_vervoer, String aankomst_bedrijf, String vertrek_datum, String vertrek_tijd, String vertrek_vervoer, String vertrek_bedrijf,
    String eigenaar, int container_nr, int gewicht_leeg, int gewicht_inhoud, String inhoud, String soort, String gevaar, String ISO, int x, int y, int z)
    {
        this.aankomst_datum = aankomst_datum;
        this.aankomst_tijd = aankomst_tijd;
        this.aankomst_vervoer = aankomst_vervoer;
        this.aankomst_bedrijf = aankomst_bedrijf;
        
        this.vertrek_datum = vertrek_datum;
        this.vertrek_tijd = vertrek_tijd;
        this.vertrek_vervoer = vertrek_vervoer;
        this.vertrek_bedrijf = vertrek_bedrijf;
        
        this.eigenaar = eigenaar;
        this.container_nr = container_nr;
        this.gewicht_leeg = gewicht_leeg;
        this.gewicht_inhoud = gewicht_inhoud;
        this.inhoud = inhoud;
        this.soort = soort;
        this.gevaar = gevaar;
        this.ISO = ISO;
        
        this.x = x;
        this.y = y;
        this.z = z;
                
    }

   
    
   
}
