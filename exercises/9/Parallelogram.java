import java.util.Scanner;

public class Parallelogram {

    static int breadth;
    static int height;
    static boolean flag;
    static Scanner scanner;
    static {
        scanner = new Scanner(System.in);
        breadth = scanner.nextInt();
        height = scanner.nextInt();
        if(breadth<1 || height<1)
        {
            flag = false;
            System.out.println("invalid");
        }
        else
        {
            flag = true;
            System.out.println("valid");
        }
    }

    public static void main(String[] args) { //don't change main body
        if (flag) {
            int area = breadth * height;
            System.out.print(area);
        }
    }
}
