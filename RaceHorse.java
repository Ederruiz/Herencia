
package herencia;

import java.util.Scanner;

/**
 *
 * @author Eder
 */
public class RaceHorse extends Horse{
    private Integer carreras;
    
    public RaceHorse(String a,String b,Integer c,Integer n){
        super(a,b,c);
        carreras=n;
    }
    
    public void setcarreras(Integer a){
        carreras=a;
    }
    public Integer getcarreras(){
        return carreras;
    }
    
    @Override
    public String toString(){
        String texto="El nombre del caballo es: "+super.getname()+" \nSu color es: "+super.getcolor()+"\nEl año de nacimiento"
                + "es:"+super.getnacimiento()+"\nSus carreras han sido:"+carreras;
        return texto;
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresa el nombre del caballo");
        String name=teclado.next();
        System.out.println("Ingresa el color del caballo");
        String color=teclado.next();
        System.out.println("Ingresa su año de nacimiento");
        int nacimiento=teclado.nextInt();
        System.out.println("Ingresa el numero de carreras");
        int numero=teclado.nextInt();
        RaceHorse a=new RaceHorse(name,color,nacimiento,numero);
        System.out.println(a.toString());
        
    }    
}
