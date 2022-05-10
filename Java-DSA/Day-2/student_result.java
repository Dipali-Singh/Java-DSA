import java.util.*;

public class student_result {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the student name: ");
        String name= sc.nextLine();
        System.out.println("Enter the student class: ");
        int year= sc.nextInt();
        System.out.println("Enter the subject marks: ");
        System.out.println("english: ");
        int english= sc.nextInt();
        System.out.println("math: ");
        int math= sc.nextInt();
        System.out.println("science: ");
        int science= sc.nextInt(); 
        String Grade="";
        int avg= (english+math+science)/3;
        if(avg>=90)
        {
            Grade="A";
        }
        else if(avg>80 && avg<90)
        {
             Grade="B";
        }
        else if(avg<80 && avg>70)
        {
            Grade="c";
        }
        else if(avg<70 && avg>60)
        {
             Grade="D";
        }
        else
        {
            Grade="fail";
        }
        {
            System.out.println("student name: "+ name + "\n" + "student year: " + year + "\n" +  "student result: "+ Grade );
        }
            
        }      
}


