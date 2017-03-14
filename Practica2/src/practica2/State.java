/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Amayrani
 */
public class State {
    public enum Position {DERECHA, IZQUIERDA}
    
    public Position Canibal1;
    public Position Canibal2;
    public Position Canibal3;
    public Position Misionero1;
    public Position Misionero2;
    public Position Misionero3;
    public Position Bote;
    
    
     public boolean isValid(){
        if ((Canibal1 == Position.DERECHA)&& 
                (Canibal2 == Position.DERECHA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.IZQUIERDA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Canibal1 == Position.DERECHA)&& 
                (Canibal2 == Position.DERECHA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.DERECHA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.DERECHA))
            return false;
        if ((Canibal1 == Position.DERECHA)&& 
                (Canibal2 == Position.IZQUIERDA)&&
                (Canibal3 == Position.IZQUIERDA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.DERECHA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Canibal1 == Position.DERECHA)&& 
                (Canibal2 == Position.IZQUIERDA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.IZQUIERDA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.IZQUIERDA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.DERECHA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.DERECHA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.IZQUIERDA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.IZQUIERDA)&&
                (Canibal3 == Position.IZQUIERDA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.DERECHA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.DERECHA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.IZQUIERDA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.DERECHA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.IZQUIERDA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.DERECHA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.DERECHA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.DERECHA)&&
                (Canibal3 == Position.IZQUIERDA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.DERECHA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.DERECHA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.DERECHA)&&
                (Misionero2 == Position.IZQUIERDA)&&
                (Misionero3 == Position.IZQUIERDA)&&
                (Bote == Position.DERECHA))
            return false;
       
            //terminar toda la lista de estados invalidos
        return true;
    
}
      public boolean isFinal(){
        if ((Canibal1 == Position.IZQUIERDA)&&
                (Canibal2 == Position.IZQUIERDA)&&
                (Canibal3 == Position.IZQUIERDA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.IZQUIERDA)&&
                (Misionero3 == Position.IZQUIERDA)&&
                (Bote == Position.IZQUIERDA))
            return true;
        return false;
}
}
