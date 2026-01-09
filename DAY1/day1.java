import java.util.Scanner;
class day1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a:");
        int first = scanner.nextInt();
        System.out.println("enter b:");
        int second = scanner.nextInt();
        
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
        
        scanner.close();
    }
}