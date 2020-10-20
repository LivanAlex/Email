package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength;
    private String alternateEmail;
    private String companySuffix = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("EMAIL CREATED: " + firstName + " " + lastName);
        this.department = setDepartment();
        //System.out.println("Department: " + department);
        this.defaultPasswordLength = 8;
        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: " + password);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        //System.out.println("Your email is: " + email);
    }

    private String setDepartment() {
        System.out.print("Enter the department for new worker: " + firstName+ " " + lastName + "\n" +
                "1 for Sales\n" +
                "2 fot Development\n" +
                "3 for Accounting\n" +
                "0 for none\n");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        switch (depChoice) {
            case 1:
                return "sales";
            case 2:
                return "dev";
            case 3:
                return "acct";
            case 0:
                return "";
        }
        return "";
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIGKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
                "COMPANY EMAIL: " + email + "\n" +
                "MAILBOX CAPASITY: " + mailboxCapacity + "mb";
    }
}
