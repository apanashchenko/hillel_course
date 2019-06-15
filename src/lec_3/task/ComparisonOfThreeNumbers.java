package lec_3.task;

public class ComparisonOfThreeNumbers {
    public static void main(String[] args) {
        int number1=0;
        int number2=2;
        int number3=1;

        if(number1>number2 && number1>number3){
            if(number2>number3)
                System.out.println("max=number1"+"  mid=number2"+"  min=number3");
            else
                System.out.println("max=number1" +"  mid=number3" +"  min=number2");
        }
        else if(number2>number1 && number2>number3){
            if(number1>number3)
                System.out.println("max=number2"+ "  mid=number1"+ "  min=number3");
            else
                System.out.println("max=number2"+ "  mid=number3"+ "  min=number1");
        } else {
            if(number1>number2)
                System.out.println("max=number3"+ "  mid=number1"+ "  min=number2");
            else
                System.out.println("max=number3"+ "  mid=number2"+ "  min=number1");

        }
    }
}
