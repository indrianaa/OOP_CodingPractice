/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp_soal1;
public class OperasiPembagian extends OperasiBilanganAbs
{

    //constructor OperasiPembagian
    public OperasiPembagian()
    {

    }

    //Polimorfisme override dari method abstract class OperasiBilanganAbs
    @Override
    protected void set_A(double A) {
        this.a = A;
    }

    //Polimorfisme override dari method abstract class OperasiBilanganAbs
    @Override
    public void set_B(double B) {
        this.b = B;
    }

    //Polimorfisme override dari method abstract class OperasiBilanganAbs
    @Override
    protected void set_C() {
        this.c = a / b;
    }

    //Polimorfisme override dari method abstract class OperasiBilanganAbs
    @Override
    protected double get_A() {
        return a;
    }

    //Polimorfisme override dari method abstract class OperasiBilanganAbs
    @Override
    protected double get_B() {
        return b;
    }

    //Polimorfisme override dari method abstract class OperasiBilanganAbs
    @Override
    protected double get_C() {
        return c;
    }

    //Polimorfisme override dari method abstract class OperasiBilanganAbs
    @Override
    protected void tampil()
    {
        System.out.println("Operasi Bilangan Pembagian");
        System.out.println("Penjumlahan" +a+ "/" +b+ "=" +c);
    }
}

