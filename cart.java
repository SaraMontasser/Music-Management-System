package music_system;

import java.util.Scanner;

public class cart {
    int maxInCart=25;
    storeData inCart[]=new storeData[maxInCart];
    static int countInCart=0;
    boolean found=false;
    public void addToCart (storeData song)
    {
        if(song.numberOfItems>0)
        {
            song.numberOfItems--;
            inCart[countInCart]=song;
            countInCart++;
            System.out.println("Done");
        }
        else
        {
            System.out.println("Sorry, CANNOT ADD ITEM TO CART : "+song.songName +" is out of stock");
        }
        System.out.println("------------------------------------------------------------");
    }

    private void totalPrice()
    {
        double total=0;

        for(int i=0;i<countInCart;i++)
        {
            total += inCart[i].price;
        }
        System.out.println("Total Price : " + total);
    }
    public void displayCart()
    {
        found=false;
        System.out.println("Cart : ");
        for(int i=0;i<countInCart;i++)
        {
            if(inCart[i].price<=0) continue;

                System.out.println("Item name : " +inCart[i].songName + "   Item price : " +inCart[i].price );
                found=true;


        }
        if(found)
            totalPrice();
        else System.out.println("Cart is empty");
    }

    public void removeFromCart() {
        String itemName;
        Scanner scan = new Scanner(System.in);
        displayCart();
        boolean flag2=false;
        if (found) {
            System.out.println("Please Enter name of the song you wish to remove from cart : ");
            itemName = scan.next();
            for (int i = 0; i < countInCart; i++) {
                if (inCart[i].songName.toLowerCase().equals(itemName.toLowerCase())) {
                    flag2=true;
                    inCart[i].numberOfItems++;
                    for (int j = 0; j < countInCart; j++) {
                        inCart[i + j] = inCart[i + j + 1];
                    }
                    countInCart--;
                    System.out.println("Done");
                }
            }
            if(!flag2){
                System.out.println("Sorry, This song is not found in the cart");
            }
            displayCart();
        }
        else {
            System.out.println("You can not remove songs from an empty cart");
        }
    }


}
