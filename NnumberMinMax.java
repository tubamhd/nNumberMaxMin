import java.util.Scanner;

public class NnumberMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, no, min = 0, max = 0;

        System.out.print("How many numbers will you enter:  ");
        n = input.nextInt();

        if (n >= 2){
            for (int i = 1; i <= n; i++){
                System.out.print(i + ". Number: ");
                no = input.nextInt();
                if ( i == 1){
                    max = no;
                    min = no;
                } else {
                    if (no >= max)
                        max = no;
                    if (no <= min)
                        min = no;
                }
            }
            System.out.println("Min Number: " + min);
            System.out.println("Max Number: " + max);
        } else {
            System.out.println("You have entered x number!");
        }
    }
}
