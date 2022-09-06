import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        printMyName();

    }

    public static void printMyName(){

        System.out.println("Hello \n Robert");

        int n=17 ;
        double m=5;
        System.out.println(m+n+" este suma celor doua numere\n" +
                n/m+" este rezultatul impartirii celor doua numere");
        double a=5;
        int b=8;
        double c=55;
        double d=9;
        int e=20;
        double z=15;
        int f=2;
        int y=6;
        double x=3;
        System.out.println("a "+(-a+b*y)+" este rezultatul\n" +
                "b "+((c+d)%d)+" este rezultatul\n" +
                "c "+(e+(-x)*a/b)+" este rezultatul\n" +
                "d "+(a+z/x*f-b%x)+" este rezultatul\n");



    }
}