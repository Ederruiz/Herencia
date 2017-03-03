/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Eder
 */
public class Candle {
    private String color;
    private Double altura;
    private Double precio;
    
    public Candle(String col,Double alt,Double pre){
        color=col;
        altura=alt;
        precio=pre;
    }  
    public Double getaltura(){
        return altura;
    }
    //ste get
    public Double preciototal(){
        return altura*2;
    }
}
