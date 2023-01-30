import java.util.Scanner;

public class SumOfSeries {
//this code contains the sum of series
//1 + 1/2 + 1/3 + 1/4 + 1/5....1/n
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the value of n: ");
    
    int n = sc.nextInt();
    
    double sum = 0;
    
    for (int i = 2; i <= n; i++) {
    
    sum += 1.0/i;
    
    }
    
    System.out.println("The sum of the series is: " + sum);
    
    }
    
    }