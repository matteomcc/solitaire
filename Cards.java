import java.util.Arrays;
import java.util.List;

public class Cards {


    private String suit, faceName;
    //private Image image;
    //private int value;


    public Cards(String suit, String faceName) {
        setSuit(suit);
        //setValue(value);
        setFaceName(faceName);
        
    
    }

    public void setSuit(String suit) {
        List<String> values = getValidSuits();
        suit = suit.toLowerCase();
        if(values.contains(suit)) {
            this.suit = suit;
        }
        else{
            throw new IllegalArgumentException("Valid suits are: " + values);
        }
        this.suit = suit;
    }
    public String getSuit() {
        return suit;
    }

    /*public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    */

    public void setFaceName(String faceName) {
        List<String> values = getValidCardFace();
        faceName = faceName.toLowerCase();
        if(values.contains(faceName)){
            this.faceName = faceName;
        }
        else{
            throw new IllegalArgumentException("Valid face names are: " + values);
        }
        this.faceName = faceName;
    }

    public String getFaceName() {
        return faceName;
    }
    

    public static List<String> getValidCardFace() {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
        
    }

    public static List<String> getValidSuits() {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }
    
    public String toString(){
        return faceName + " of " + suit;
    }

    
    
}
