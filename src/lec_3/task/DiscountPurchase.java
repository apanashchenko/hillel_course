package lec_3.task;

public class DiscountPurchase {
    public static void main(String[] args) {
        int sumOfPurchase=1200;
        if(sumOfPurchase>1000){
            int finalSumOfPurchase = sumOfPurchase*85/100;
            System.out.println("Final purchase price with discount "+finalSumOfPurchase);
        }
        else
            System.out.println("Discount is NOT available");
    }
}
