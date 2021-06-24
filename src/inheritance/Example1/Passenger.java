package inheritance.Example1;

//no one can inherit when declared final
public final class Passenger {
    int passengers;
    int seats = 150;
    private int checkedBags;
    private int freeBags;
    int totalCheckedBags;
    private double perBagFee;

    public Passenger(){

    }
    public Passenger(int freeBags){
        this(freeBags>1?25.0d:50.0d);
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags,int checkedBags){
        this.freeBags = freeBags;
        this.checkedBags = checkedBags;
    }
    public int getCheckedBags() {
        return checkedBags;
    }

    private Passenger(double perBagFee){
        this.perBagFee = perBagFee;
    }
    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }

    public int getFreeBags() {
        return freeBags;
    }

    public void setFreeBags(int freeBags) {
        this.freeBags = freeBags;
    }

}
