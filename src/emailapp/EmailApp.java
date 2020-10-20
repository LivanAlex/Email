package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("John", "Smith");
        email.changePassword("wdfqwe");
        email.setAlternateEmail("123@DFAKDJF.COM");
        email.setMailboxCapacity(200);
        System.out.println(email.showInfo());
    }
}
