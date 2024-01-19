import java.util.Scanner;

class StudentGradeCalc
{
    StudentGradeCalc() {
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("FILL IN THE DETAILS GIVEN BELOW");
        System.out.println("");

        System.out.println("Enter your First name: ");
        String name= sc.nextLine();
        System.out.println("Enter your Last name: ");
        String lname= sc.nextLine();
        System.out.println("Enter your Class");
        int cl= sc.nextInt();
        System.out.println("Enter your Roll number");
        int roll= sc.nextInt();
        System.out.println();

        System.out.println("Enter your marks (total 100marks per subject)");
        System.out.print("Enter English marks: ");
        int e= sc.nextInt();
        System.out.print("Enter Mathematics marks: ");
        int m= sc.nextInt();
        System.out.print("Enter Science marks: ");
        int s= sc.nextInt();           
        System.out.print("Enter Hindi marks: ");
        int h= sc.nextInt();  
        System.out.print("Enter Marathi marks: ");
        int m2= sc.nextInt();
        System.out.print("Enter Social Science marks: ");
        int ss= sc.nextInt(); 
        System.out.print("Enter Computer marks: ");
        int c= sc.nextInt();  

        int total=700;
        int sum= e+m+s+h+m2+ss+c;
        double obt= ((double)sum / total) * 100;
        int passMarks= 355;
        String ans= " ";

        if (sum < passMarks)
        {
            ans= "UNSUCCESSFUL";
        }
        else if (sum<=total && sum>=600)
        {
            ans= "A+";
        }
        else if (sum<=599 && sum>=550)
        {
            ans= "A";
        }
        else if (sum<=549 && sum>=450)
        {
            ans= "B";
        }
        else if (sum<=449 && sum>passMarks)
        {
            ans= "C";
        }
        else
        {

        }

        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("                                    XYZ INTERNATIONAL SCHOOL                                  ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("NAME:  " + name +" "+ lname);
        System.out.println("CLASS.:  " + cl);
        System.out.println("ROLL NO:  " + roll);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("English:            " + e);
        System.out.println("Mathematics:        " + m);
        System.out.println("Science:            " + s);
        System.out.println("Hindi:              " + h);
        System.out.println("Marathi:            " + m2);
        System.out.println("Social Science:     " + ss);
        System.out.println("Computer:           " + c);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.printf("You've scored %.2f%%\n", obt);
        System.out.println("Grade: " + ans);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }
}