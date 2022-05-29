import java.util.Scanner;

public class Main {

    static int numberReduce (int number) {
        if(number<=0){
            return number;
        }else{
            System.out.print(number+" ");
            return numberReduce(number-5);
        }

    }

    static int numberIncrease(int number,int controlNumber) {
        if(number==controlNumber){
            return number;
        }else{
            System.out.print(number+" ");
            return numberIncrease(number+5,controlNumber);
        }

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        System.out.println(numberIncrease(numberReduce(number),number));
    }
}