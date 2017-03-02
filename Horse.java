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
public class Horse {
    private String name;
    private String color;
    private Integer nacimiento;
    
    public Horse(String a,String b,Integer c){
        name=a;
        color=b;
        nacimiento=c;
    }
    
    public void setname(String a){
        name=a;  
    }
    public String getname(){
        return name;
    }
    public void setcolor(String b){
        color=b;
    }
    public String getcolor(){
        return color;
    }
    public void setnacimiento(Integer j){
        nacimiento=j;
    }
    public Integer getnacimiento(){
        return nacimiento;
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
