import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the air temperature : ");
        temp = input.nextInt();

        if (temp<5) {
            System.out.println("You can go to the ski.");
        } else if (temp<25) {
            if(temp<=15){
                System.out.println("You can go to the cinema ");
            }if (temp>=10) {
                System.out.println("You can go to the picnic");
            }
        } else {
            System.out.println("You can go to the swimming.");
        }
    }
}
