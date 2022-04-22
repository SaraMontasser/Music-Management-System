package music_system;

import java.util.Scanner;

public class Admin extends User {
    public Admin(){
        super();

    }
    public void menu(){
        System.out.println(" -if you want to add item press 1 \n "
                + "- if you want to edit item press 2 \n "+ "- if you want to remove item press 3 \n "+
                "- if you want to logout press 4 \n "  );
        Scanner scan=new Scanner(System.in);
        int choice =scan.nextInt() ;
        switch(choice)
        {
            case 1:
            {
                add();
            }
            case 2:
            {
                edit();
            }
            case 3:
            {
                remove();
            }
            case 4:
            {
                logout();
            }
        }


    }
    public void add()
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter song Name");
        String name_new=scan.next();
        System.out.println("Please enter song Category");
        String cat_new=scan.next();
        System.out.println("Please enter song type");
        String typ_new=scan.next();
        System.out.println("Please enter song artist");
        String art_new=scan.next();
        System.out.println("Please enter song price");
        double p_new=scan.nextDouble();
        System.out.println("Please enter song Stock");
        int stock_new=scan.nextInt();

        Item.array[Item.lastindex+1]=new storeData(name_new,art_new,cat_new,typ_new,stock_new,p_new);
        Item.lastindex++;
        Item.display_in_stock();
        menu();
    }

    public void edit()
    {
        Item.display_in_stock();
        System.out.println("Enter song name");
        Scanner scan=new Scanner(System.in);
        String editedSong;
        editedSong= scan.next();
        for(int i =0 ; i<=Item.lastindex ;i++)
        {
            if((Item.array[i].songName).toLowerCase().equals(editedSong.toLowerCase()))
            {
                System.out.println("Please enter edited song Name");
                Item.array[i].songName=scan.next();


                System.out.println("Please enter edited  song Category");
                Item.array[i].category=scan.next();
                System.out.println("Please enter edited  song type");
                Item.array[i].type=scan.next();
                System.out.println("Please enter edited song artist");
                Item.array[i].artist=scan.next();
                System.out.println("Please enter edited song price");
                Item.array[i].price=scan.nextInt();

                System.out.println("Please enter edited song Stock");

                Item.array[i].numberOfItems=scan.nextInt();
                break;
            }
        }
        Item.display_in_stock();
        menu();
    }
    public void remove()
    {
        Item.display_in_stock();
        System.out.println("Enter song name");
        Scanner scan=new Scanner(System.in);

        String removedsong= scan.next();
        for(int i=0;i<=Item.lastindex;i++)
        {
            if((Item.array[i].songName).toLowerCase().equals((removedsong).toLowerCase()) )
            {

                for(int j=i;j<=Item.lastindex;j++)
                {
                    Item.array[j]=Item.array[j+1];
                }
                Item.lastindex--;

            }

        }
        Item.display_in_stock();
        menu();
    }
}
