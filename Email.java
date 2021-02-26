import java.util.Scanner;
import java.util.Random;
import java.nio.charset.Charset;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String companyName;
    private String password;

    Email(){
        this.firstName="";
        this.lastName="";
        this.department="";
        this.companyName="";
        this.password="";
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

    void GeneratePassword(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for(int i = 0; i < targetStringLength; i++){
            int randomLimitedInt = leftLimit + (int)
                (random.nextFloat()*(rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        password = buffer.toString();
    }
    
    void PrintEmail(){
        System.out.println(firstName + (lastName.isEmpty()? "": ".") + lastName + "@" + department 
        + (department.isEmpty()? "": ".") + companyName + ".com");
    }
    void PrintPassword(){
        System.out.println(password);
    }

}
