import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Main2 {

    static Random random= new Random();
    public static void main(String[] args) {

//        speed(15,10,54,43);

        int x=random.nextInt(6)+1;
        System.out.println("Random number is: "+x);
        System.out.println("Random sum rezult is: "+sumInt(x,3));


    }
    public static int sumInt(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public static int substractInt(int firstNumber, int secondNumber){
        return  firstNumber - secondNumber;

    }

    public static int divideInt(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;

    }
    public static int multiplyInt(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
    public static double modulo(double numar1, double numar2){
        return numar1 % numar2;
    }
    public static double sumDouble(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
    public static double substractDouble(double firstNumber, double secondNumber){
        return  firstNumber - secondNumber;

    }

    public static double divideDouble(double firstNumber, double secondNumber){
        return firstNumber / secondNumber;

    }
    public static double multiplyDouble(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }

    public static void java(){
        System.out.println("""
                   J    a   V     V  a  \s
                   J   a a   V   V  a a \s
                J  J  aaaaa   V V  aaaaa
                 JJ  a     a   V  a     a""");
    }
    public static int trioInt(int nr1,int nr2,int nr3){
        return (nr1+nr2+nr3)/3;
    }
    public static double trioDouble(double nr1,double nr2,double nr3){
        return (nr1+nr2+nr3)/3;
    }


}
