import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String companyName;

    Email(){
        this.firstName="";
        this.lastName="";
        this.department="";
        this.companyName="";
    }

    void GenerateEmail(){
        Scanner scan = new Scanner(System.in);
        System.out.println("first name: ");
        firstName = scan.nextLine();

        System.out.println("last name: ");
        lastName = scan.nextLine();

        System.out.println("company name: ");
        companyName = scan.nextLine();

        System.out.println("department: ");
        department= scan.nextLine();
        
    }
    void printEmail(){
        System.out.println(firstName + (lastName.isEmpty()? "": ".") + lastName + "@" + department 
        + (department.isEmpty()? "": ".") + companyName + ".com");
    }


}
