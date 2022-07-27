package bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfFirstNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the N Value");
        int n = in.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            integers.add(i);
        }
        Integer ans = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(ans);
    }
}