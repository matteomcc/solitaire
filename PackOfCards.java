import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PackOfCards {
    
    private ArrayList<Cards> pack;
    // private Image cardBack;


    public PackOfCards(ArrayList<Cards> pack){
        this.pack = pack;
    }

    public PackOfCards(){
        List<String> suits = Cards.getValidSuits();
        List<String> ranks = Cards.getValidCardFace();
        pack = new ArrayList<Cards>();

        for(String suit :suits){
            for(String rank: ranks){
                pack.add(new Cards(suit, rank));
            }
        }
    }


    public ArrayList<Cards> getPack(){
        return pack;
    }

    public void setPack(ArrayList<Cards> pack){
        this.pack = pack;
    }


    public Cards drawTopCard(){
        if(pack.size() >0 ){   
            return pack.remove(0);
    }
    else{
        return null;
    }
    }


    public void shuffle(){
        Collections.shuffle(pack);
    }

    public String toString(){
        String output = "";
        for(Cards card : pack){
            output += card + "\n";
        }
        return output;
    }




        
}

