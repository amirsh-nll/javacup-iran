import java.util.Scanner;

public class Chess {

    public static String vertical(int n){

        String result="";

        if(n<1)
            return result;

        for (int i = 0; i < n; i++) {
            result += " _____";
        }

        result += " " + "\n";
        return result;

    }

    public static String horizontal(int n, boolean color)
    {
        String result="";

        if(n<1)
            return result;

        for (int j = 0; j <= n; j++) {
            if(j!=n)
                result += "|     ";
            else
                result += "|";
        }
        result += "\n";

        for (int k = 0; k <= n; k++) {
            if(color && k!=n) {
                color = false;
                result += "|xxxxx";
            }
            else {
                color = true;
                if(k!=n)
                    result += "|     ";
                else
                    result += "|";
            }
        }
        result += "\n";

        for (int m = 0; m <= n; m++) {
            if(m!=n)
                result += "|_____";
            else
                result += "|";
        }
        result += "\n";

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n<1)
            return;

        int counter = 1;
        boolean color = false;
        String result="";

        result += vertical(n);
        for (int i=0; i<n; i++)
        {
            result += horizontal(n, color);
            color = !color;
        }

        System.out.print(result);

    }

}
