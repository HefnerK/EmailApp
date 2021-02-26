import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

public class EmailApp{

    public static void main(String[] args){
        Email email = new Email();
        
        email.generateEmail();
        email.generatePassword();
        email.setAlternateEmail("blah@blah.com");
        email.setMailBoxCapacity(10);
        System.out.println(email.toString());
    }
}