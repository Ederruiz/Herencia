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
public class ScentedCandle extends Candle{
    public ScentedCandle(String a,Double b,Double c){
        super(a,b,c);
    }
    public Double preciototal(){
        return this.getaltura()*2;
    }
    
}

