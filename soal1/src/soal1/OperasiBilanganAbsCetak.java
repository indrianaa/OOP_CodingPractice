/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;


//final class
public final class OperasiBilanganAbsCetak
{
    //method final class
    private final void cetakSemua(OperasiBilanganAbs[] ob, double a, double b)
    {
        for (int i=0; i<ob.length; i++)
        {
            ob[i].set_A(a);
            ob[i].set_B(b);
            ob[i].set_C();
            ob[i].tampil();
            System.out.println("=============================");

        }
    }

    //main method
    public static void main (String[] args)
    {
        final double a = 10.5;
        final double b = 2.5;

        OperasiBilanganAbs[] ob =
                { new OperasiPenjumlahan(),
                        new OperasiPengurangan(),
                        new OperasiPerkalian(),
                        new OperasiPembagian(),
                };
        OperasiBilanganAbsCetak hitung = new OperasiBilanganAbsCetak();
        hitung.cetakSemua(ob,a,b);
    }

}
