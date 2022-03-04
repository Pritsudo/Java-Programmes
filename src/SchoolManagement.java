import java.util.*;

public class SchoolManagement{




    public static void main(String[] args) {
      studentdata sd=new studentdata();
    }


   /* void addUser()
    {
        System.out.println("Enter Your Name:");
        name=sc.nextLine();
        System.out.println("Enter Year:");
        year=sc.nextInt();


    }
*/

}

class studentdata {

    String firstname, lastname;
    String courses, studentid;
    int tuitionBalance, gradeYear;
    int studentId;
    int costOfCourse = 600;
    static int id = 1;

    Scanner sc = new Scanner(System.in);

    studentdata() {
        System.out.println("Enter Your FirstName:");
        firstname = sc.nextLine();
        System.out.println("Enter Your LastName:");
        lastname = sc.nextLine();
        System.out.println("1. Fresher  /n2. Junior  /n3. Senior    Enter Your Class Level :");
        gradeYear = sc.nextInt();


        studentid = setid();
        System.out.println(studentid);
    }

    //20DIT008
    String setid() {
        id++;
        if (id < 10) {
            return "20DIT00" + id;
        } else if (id < 100) {
            return "20DIT0" + id;
        }
        return "";
    }

}
