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
public class PilaNum
{
    private int tope;
    private double[] p;
    
    public PilaNum(int t)
    {
        p= new double[t];
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
    
    public void push(double dato)
    {
        tope++;
        p[tope]=dato;
    }
    
    public double pop()
    {
        return p[tope--];
    }
    
    public double stacktop()
    {
        double dato = pop();
        push(dato);
        return dato;
    }
}
