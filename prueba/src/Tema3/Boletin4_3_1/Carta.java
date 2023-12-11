package Tema3.Boletin4_3_1;

public class Carta {
    private String palo;
    private String num;

    public Carta(String palo, String num) {
        this.palo = palo;
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public String getNum() {
        return num;
    }
    public  String toString(){
        return num + " da " + palo;
    }
}

