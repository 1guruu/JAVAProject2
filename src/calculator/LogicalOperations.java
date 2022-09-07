package calculator;

public class LogicalOperations {

    public boolean eligibleToVote(int yourAge){
        if (yourAge>=18){
            return true;
        }else{
            return false;
        }
    }

    public boolean evenNumber(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }


    public int biggerTwoNumber(int firstNumber, int secondNumber){
        if (firstNumber>secondNumber){
            return firstNumber;
        }else{
            return secondNumber;
        }
    }

    public void biggerThreeNUmber(int firstNumber,int secondNumber,int thirdNumber){
        if (firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println(firstNumber);
        }else if(secondNumber>firstNumber && secondNumber>thirdNumber){
            System.out.println(secondNumber);
        }else if (thirdNumber>firstNumber && thirdNumber>secondNumber){
            System.out.println(thirdNumber);
        }else {
            roboSmile();
        }
    }

    public void ascendingOrderTwoNumbers(int firstNumber,int secondNumber){
        if (firstNumber>secondNumber){
            System.out.println(firstNumber+secondNumber);
        }else {
            System.out.println(secondNumber+firstNumber);
        }
    }

    public double squareNumber(double number){
        return number*number;
    }

    public int returnBiggestNumber (int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }


    public void  winter(int snowInCm){
        if (snowInCm>8 || snowInCm==6){
            System.out.println("The amount of snow this winter was(cm): "+snowInCm);
        }else{
            System.out.println("The forecast snow is(cm): "+snowInCm);
        }
    }

    public void numberFromKeyboard(int number){
        switch (number) {
            case 0 -> System.out.println("0");
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            case 5 -> System.out.println("5");
            case 6 -> System.out.println("6");
            case 7 -> System.out.println("7");
            case 8 -> System.out.println("8");
            case 9 -> System.out.println("9");
            default -> System.out.println("Not allowed");
        }
    }

    public  void javaText(){
        System.out.println("""
                   J    a   V     V  a  \s
                   J   a a   V   V  a a \s
                J  J  aaaaa   V V  aaaaa
                 JJ  a     a   V  a     a""");
    }

    public  void roboSmile(){
        System.out.println("""
                 +”””””+\s
                [| o o |]
                 |  ^  |\s
                 | '_' |\s
                 +_____+""");
    }

    public  double temp(long f){
        long temperature=5/(9* (f-32));
        return temperature;
    }

    public  double metric(double inch){
        return inch *0.0254;
    }

    public  void speed(double distance,double hour,double minutes,double seconds){
        double km=distance*1000;
        double miles=distance*1609;
        double result1=distance/seconds;
        double result2=km/hour;
        double result3=miles/hour;
        System.out.println("Viteza in metrii/secunda: "+result1+"\n"+
                "Viteza in kilometrii/ora: "+result2 +"\n"+
                "Viteza in mile pe ora: "+result3);

    }

    public String number34(int number){
        if (number>3 && number!=4){
            System.out.println("The number is greater than 3 and not equal to 4");
        }else if (number==4){
            System.out.println("The number is equal to 4");
        }else if (number<3){
            System.out.println("The number is lower than 3");
        }
        return "Something is wrong :) ";
    }
}
