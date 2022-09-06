package calculator;

public class Calculator {
    public  int sumInt(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public  int substractInt(int firstNumber, int secondNumber){
        return  firstNumber - secondNumber;

    }

    public  int divideInt(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;

    }
    public  int multiplyInt(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
    public  double modulo(double numar1, double numar2){
        return numar1 % numar2;
    }
    public  double sumDouble(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
    public  double substractDouble(double firstNumber, double secondNumber){
        return  firstNumber - secondNumber;

    }

    public  double divideDouble(double firstNumber, double secondNumber){
        return firstNumber / secondNumber;

    }
    public  double multiplyDouble(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }


    public  int trioInt(int nr1,int nr2,int nr3){
        return (nr1+nr2+nr3)/3;
    }
    public  double trioDouble(double nr1,double nr2,double nr3){
        return (nr1+nr2+nr3)/3;
    }
}
