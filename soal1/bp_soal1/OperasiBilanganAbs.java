package bp_soal1;

//abstract class
public abstract class OperasiBilanganAbs {

    //atribut abstract class
    protected double a = 10.5;
    protected double b = 2.5;
    protected double c=  0;

    //method abstract class
    protected abstract void set_A (double a);
    protected abstract void set_B (double b);
    protected abstract void set_C();
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();
    protected abstract void tampil();
}
