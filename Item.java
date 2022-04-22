package music_system;


public class Item {
    public static storeData array[] = new storeData[20];
    public  static int lastindex=4; //in class admin

    public static void song_Item() {

        array[0]=new storeData("beautiful","OneDirection","English_music","pop",4,10.0);
        array[1]=new storeData("ansak","halem","Egyptian_music","folk",3,5.0);
        array[2]=new storeData("hello","Adele","English_music","classic",1,20.0);
        array[3]=new storeData("senorita","Camila","English_music","pop",2,15.5);
        array[4]=new storeData("far","OneDirection","English_music","classic",4,24.5);

    }

    public static storeData getArray(int x) {
        return array[x];
    } //in class cart

    public static void display_in_stock(){

        for(int i=0 ;i<=lastindex;i++){
            if(array[i].numberOfItems>0)
            {
                System.out.println(i+"- "+
                        "Artist: "+ array[i].artist +" , "+
                        "Song Name: "+  array[i].songName +" , "+
                        "Category: "+  array[i].category +" , "+
                        "Type: "+  array[i].type +" , "+
                        "Number of items: "+  array[i].numberOfItems +" , "+
                        "Price for each: "+ array[i].price);
            }


        }
        System.out.println("------------------------------------------------------");

    }

    public static boolean find(String artist){
        String artist_name=artist.toLowerCase();
        for(int i=0 ;i<=lastindex;i++){
            if(array[i].artist.toLowerCase().equals(artist_name)){
                System.out.println(i+"- "+"Artist :" +' '+ array[i].artist +
                        "\nSong Name :"+' '+  array[i].songName +
                        "\nCategory :" +' '+  array[i].category +
                        "\nType :" +' '+  array[i].type +
                        "\nNumber of items :" +' '+  array[i].numberOfItems +
                        "\nPrice :" +' '+  array[i].price);
                return true;  // hns2lo tane 3wzha t add llcart wala
            }

        }
        return false;
    }

    public static boolean find(String artist ,String type){
        String artist_name=artist.toLowerCase();
        String song_type=type.toLowerCase();
        for(int i=0 ;i<=lastindex;i++){
            if( array[i].type.toLowerCase().equals(song_type) &&array[i].artist.toLowerCase().equals(artist_name)){
                System.out.println(i+"- "+"Artist :" +' '+ array[i].artist +
                        "\nSong Name :"+' '+  array[i].songName +
                        "\nCategory :" +' '+  array[i].category +
                        "\nType :" +' '+  array[i].type +
                        "\nNumber of items :" +' '+  array[i].numberOfItems +
                        "\nPrice :" +' '+  array[i].price);
                return true;
            }

        }
        return false;
    }

    public static boolean find(String artist ,String type , String category){
        String cat=category.toLowerCase();
        String artist_name=artist.toLowerCase();
        String song_type=type.toLowerCase();
        for(int i=0 ;i<=lastindex;i++){
            if( array[i].category.toLowerCase().equals(cat)&&array[i].type.toLowerCase().equals(song_type) &&array[i].artist.toLowerCase().equals(artist_name)){
                System.out.println(i+"- "+"Artist :" +' '+ array[i].artist +
                        "\nSong Name :"+' '+  array[i].songName +
                        "\nCategory :" +' '+  array[i].category +
                        "\nType :" +' '+  array[i].type +
                        "\nNumber of items :" +' '+  array[i].numberOfItems +
                        "\nPrice :" +' '+  array[i].price);
                return true;
            }

        }
        return false;
    }

    public static void display_sold(){
        boolean flag=false;
        for(int i=0 ;i<=lastindex;i++){
            if(array[i].numberOfItems>0) continue;

                System.out.println("Artist: "+ array[i].artist +" , " +
                        "Song Name: "+  array[i].songName +" , "+
                        "Category: "+  array[i].category +" , "+
                        "Type: "+  array[i].type +" , "+
                        "Price for each: "+ array[i].price);
                flag=true;
        }
            if(!flag) System.out.println("There is no songs out of stock");
            System.out.println("--------------------------------------------------");
            Client client = new Client();
            client.menu();
    }
}
