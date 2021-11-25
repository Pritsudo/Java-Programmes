import java.util.*;

public class EmailApp{

    public static void main(String[] args) {

        Email em=new Email("Prit", "Dalsaniya");
        // String department= em.choiceDepartment();
        em.showDetails();
    }

}

class Email{

    Scanner sc=new Scanner(System.in);

    public String firstName;
    public String lastName;
    public String password;
    public String department;
    public String email;
    public int mailboxCapacity=10;
    public String alternateEmail;


    Email(String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;

        this.department=choiceDepartment();
        this.password= randompassword(5);

        email=this.firstName.toLowerCase() +"." +this.lastName.toLowerCase()+"@"
                +"charusat.edu.in";
    }

    String choiceDepartment()
    {
        System.out.println("Enter Department Code:");
        System.out.println("1. Sales ");
        System.out.println("2. Devloping ");
        System.out.println("3. Accounting ");
        System.out.println("0. None ");

        int c=sc.nextInt();

        if(c==1){
            return "Sales";}

        else if(c==2){
            return "Devloping";}

        else if(c==3){
            return "Accounting";}
        else
        {  return "";}
    }

    String randompassword(int length)
    {
        int i;
        String Passcreate="ASDFGHJKLQWERTYUIOPZXCVBNM123456789*$#@";
        char[] password=new  char[length];
        for(i=0;i<length;i++)
        {
           int j= (int) (Math.random()*Passcreate.length());
            password[i]=Passcreate.charAt(j);
        }
        return new String (password);
    }


    void showDetails()
    {
        System.out.println("Here we go "+firstName+ " "+lastName +" Account is created");

        System.out.println("Department is :"+department);

        System.out.println("Genrated password is :"+ password);

        System.out.println("Email address is :"+email);

        System.out.println("MailBox Capacity :"+getMailboxCapacity()+"gb");
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }
}