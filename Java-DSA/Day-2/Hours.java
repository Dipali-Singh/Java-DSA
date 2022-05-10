import java.util.*;

public class Hours {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Hours");
        int hour=sc.nextInt();
        if(hour<12)
        {
            System.out.println("Good morning");
        }
        else if(hour<=16)
        {
            System.out.println("Good Afternoon");
        }
        else if(hour<=20)
        {
            System.out.println("Good Evening");
        }
        else
        {
            System.out.println("Good Night");
        }
    }
}