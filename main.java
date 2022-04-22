package music_system;

import java.util.Scanner;

public class main {

    public static void main(String[] args){

            Item.song_Item();
            System.out.println("Welcome to 'On the Rock' store");
            System.out.println("------------------------------------------------");
            Client user=new Client();
            user.login();

        }
    }

