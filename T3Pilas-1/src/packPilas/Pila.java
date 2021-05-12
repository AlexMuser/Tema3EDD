/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packPilas;

/**
 *
 * @author Muse1
 */
public class Pila
{
    private int tope;
    private char[] p;
    
    public Pila(int t)
    {
        p= new char[t];
        tope=-1;
    }
    
    public boolean empty()
    {
        if (tope==-1)
            return true;
        return false;
    }
    
    public boolean full()
    {
        if (tope==p.length-1)
            return true;
        return false;
    }
    
    public void push(char dato)
    {
        tope++;
        p[tope]=dato;
    }
    
    public char pop()
    {
        return p[tope--];
    }
    
    public char stacktop()
    {
        char dato = pop();
        push(dato);
        return dato;
    }
}
