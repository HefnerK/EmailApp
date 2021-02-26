import java.util.Scanner;
import java.util.Random;


public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String companyName;
    private String password;
    private int mailBoxCapacity;
    private String alternateEmail;

    Email(){
        this.firstName="";
        this.lastName="";
        this.department="";
        this.companyName="";
        this.password="";
        this.mailBoxCapacity=0;
        this.alternateEmail="";
    }

    void generateEmail(){
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

    void generatePassword(){
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
    
    public void printEmail(){
        System.out.println(firstName + (lastName.isEmpty()? "": ".") + lastName + "@" + department 
        + (department.isEmpty()? "": ".") + companyName + ".com");
    }
    public void printPassword(){
        System.out.println(password);
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String pswd){
        password = pswd;
    }

    public void setAlternateEmail(String e){
        alternateEmail = e;
    }

    public void setMailBoxCapacity(int cap){
        mailBoxCapacity=cap;
    }

    public String toString(){
        return
        "firstName: " + firstName + '\n' +
        "lastName: "  + lastName  + '\n' +
        "department: "+ department + '\n' +
        "company: "   + companyName + '\n' +
        "password: "  + password    + '\n' +
        "mailBoxCapacity: " + Integer.toString(mailBoxCapacity) + '\n' +
        "alternateEmail: " + alternateEmail;

    }

}
