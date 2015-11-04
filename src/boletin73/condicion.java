
package boletin73;

import javax.swing.JOptionPane;

/**
 *
 * @author julianlinux
 */
public class condicion {
    private int numero1;
    
    
    //Constructores
    public condicion(){
        
    }
    
    public condicion (int n1){
        this.numero1=n1;
        
    }
    
    //getters shetters
    
    public int getNumero(){
     String respuesta=JOptionPane.showInputDialog("Introduce el valor del primer numero : ");
     int valor=Integer.parseInt(respuesta);
     return valor;
    }
    
    public void comparar(int n1){
      
        if (n1>0){
            JOptionPane.showMessageDialog(null,"+");
             }
        else if (n1<0){
            JOptionPane.showMessageDialog(null,"-");
        }
        else 
            JOptionPane.showMessageDialog(null,"0");
        
    }
    
   
    
    
    
    
    
    
    
    
    
    
}
