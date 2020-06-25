/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp_soal1;


//final class
public final class OperasiBilanganAbsCetak
{
    //method final class
    private final void cetakSemua(OperasiBilanganAbs ob, double a, double b)
    {
            ob.set_A(a);
            ob.set_B(b);
            ob.set_C();
            ob.tampil();
    }
    
    //main method
    public static void main (String[] args)
        
    {
        final double a = 10.5;
        final double b = 2.5;
    
        try
        {
            System.out.println("Penjumlahan" +a+ "+" +b+ "=" +c);
        }
        catch(ArithmeticException ob)
        {
            System.out.println("Erorr" +ob);
        }
        
        finally
        {
            System.out.println("ERROR");
        }
    }
