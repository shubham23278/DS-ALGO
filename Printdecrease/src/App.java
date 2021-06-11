import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdecrease(n);
    }
    public static void printdecrease(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printdecrease(n - 1);
    }
}
