package music_system;
import java.util.Scanner;
public class Client extends User{
    cart cart = new cart();
    public Client() {
        super();
    }



    public void  menu(){


        System.out.println(" - if you want to display songs instock press 1 \n "+"- if you want to display out of stock songs press 2 \n "+"- if you want to add an item to cart press 3 \n "
                +"- if you want to remove items from the cart press 4 \n "+"- if you want to search for an item press 5 \n " + "- if you want to view cart press 6 \n " +
                "- if you want to logout press 7 \n ");
        System.out.println("-----------------------------------------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Songs instock: ");
                Item.display_in_stock();
                menu();
                break;
            case 2:
                System.out.println("Out of stock songs: ");
                Item.display_sold();
                break;
            case 3:
                Item.display_in_stock();
                System.out.print("Enter song number: ");
                int snum = scan.nextInt();
                if(snum<=Item.lastindex)
                addTo(snum);
                else {
                    System.out.println("Sorry, this song number does not exist");
                    System.out.println("------------------------------------------------------");
                    menu();
                }
                break;
            case 4:
                cart.removeFromCart();
                System.out.println("----------------------------------------------------------");
                menu();
                break;
            case 5:
                search();
                break;
            case 6:
                viewCart();
                break;

            case 7:
                logout();
                break;
        }


    }


    public void addTo(int x){

        cart.addToCart(Item.getArray(x));
        menu();


    }


    public void viewCart() {
        cart.displayCart();

        System.out.println("if you want to return to menu press 1");
        System.out.println("---------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if (choice == 1){
            menu();

        }

    }

    public void search(){

        System.out.println(" - if you want to search for a song by artist press 1 \n " + "- if you want to search for a song by type and artist press 2 \n " +
                "- if you want to search for a song by category, artist and type press 3 \n ");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch(choice) {

            case 1:
                Item.display_in_stock();

                System.out.println("Enter artist name: ");
                String artist_name = scan.next();
                if(Item.find(artist_name))
                    choice();
                else System.out.println("Song is not found");

                break;
            case 2:

                System.out.println("Enter artist name: ");
                artist_name = scan.next();
                System.out.println("Enter type of song: ");
                String song_type = scan.next();
                if(Item.find(artist_name,song_type))
                    choice();
                else System.out.println("Song is not found");
                break;
            case 3:

                System.out.println("Enter artist name: ");
                artist_name = scan.next();
                System.out.println("Enter type of song: ");
                song_type = scan.next();
                System.out.println("Enter category of song: ");
                String song_cat = scan.next();
                if(Item.find(artist_name,song_type,song_cat))
                    choice();
                else System.out.println("Song is not found");
                break;

        }
        System.out.println("---------------------------------------------------");
        menu();

    }

    public void choice(){
        System.out.println(" - if you want to add a song to cart press 1 \n " +
                "- if you want to return to menu press 2");
        System.out.println("-----------------------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch(choice) {

            case 1:
                System.out.print("Enter song number: ");
                int snum = scan.nextInt();
                if(snum<=Item.lastindex)
                    addTo(snum);
                else {
                    System.out.println("Sorry, this song number does not exist");
                    System.out.println("------------------------------------------------------");
                    menu();
                }
                break;

            case 2:

                menu();

                break;

        }


    }

}
