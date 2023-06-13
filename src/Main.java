import java.util.ArrayList;

class Deck{
    public static void shuffle(){

    }
    public static void head(){

    }
    public static void pick(){

    }
    public static void hand(){

    }
}

class Card{
    String palo;
    String color;
    String valor;

    public Card(String pal, String col, String val){
        this.palo  = pal;
        this.color = col;
        this.valor = val;
    }
}

public class Main {
    public static void main(String[] args) {

        int numeroCartasTotal = 52;
        String[] color = { "rojo", "negro" };
        String[] palos = {"tréboles", "corazones", "picas", "diamantes"};
        ArrayList<Card> cards = new ArrayList<>();

        for (int i = 0; i < numeroCartasTotal/4; i++) {
            for (int j = 0; j < color.length; j++) {
                System.out.printf("Carta: " + color[i] + "de" + palos[i] );
            }
        }

        System.out.printf("Actividad3 CJ PABS");
    }
}