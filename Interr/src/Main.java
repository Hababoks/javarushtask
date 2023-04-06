import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        while (true)
        {
            String str = con.nextLine();
            if(str.equals("enough"))
                break;
            else
                System.out.println(str);
        }
        }
    }