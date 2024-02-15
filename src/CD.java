public class CD implements Product{
    int price;
    String title;
    String artist;

    public CD() {
    }
    public CD(int price , String title , String artist){
        this.price = price;
        this.title = title;
        this.artist = artist;
    }

    public int getitemprice() {
        return price;
    }
}
