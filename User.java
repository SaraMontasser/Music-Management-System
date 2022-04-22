package music_system;

import java.util.Scanner;

public abstract class  User {

    public void login(){
        System.out.println("Please sign in");
        Scanner scan=new Scanner(System.in);
        System.out.println("Username : ");
        String Username=scan.next();
        System.out.println("Password : ");
        String Password=scan.next();
        if(Username.equals("admin") && Password.equals("admin"))
        {
            Admin admin=new Admin();
            admin.menu();
        }
        else
        {
            Client client = new Client();
            client.menu();
        }
    }

    public void logout(){
        System.out.println("Successfully logged out, looking forward to seeing you at On the rock store");
        login();
    }

}
