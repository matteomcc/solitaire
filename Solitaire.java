

public class Solitaire{




    public static void main(String[] args){
        //new GUI();

        Cards card1 = new Cards("Hearts", "2");
        System.out.println(card1);

        PackOfCards pack = new PackOfCards();
        pack.shuffle();
        System.out.println(pack);
        
    }
}