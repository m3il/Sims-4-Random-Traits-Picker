import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;

public class Sim4RandTraits {
    public static void main(String[] args) {
        ArrayList<String> traits = new ArrayList<>();
        //#region
        traits.add("Active");
        traits.add("Cheerful");
        traits.add("Creative");
        traits.add("Genius");
        traits.add("Gloomy");
        traits.add("Goofball");
        traits.add("Hot-Headed");
        traits.add("Romantic");
        traits.add("Self-Assured");
        traits.add("Art Lover");
        traits.add("Bookworm");
        traits.add("Foodie");
        traits.add("Geek");
        traits.add("Music Lover");
        traits.add("Perfectionist");
        traits.add("Ambitious");
        traits.add("Childish");
        traits.add("Clumsy");
        traits.add("Erratic");
        traits.add("Glutton");
        traits.add("Kleptomaniac");
        traits.add("Lazy");
        traits.add("Loves Outdoors");
        traits.add("Materialiastic");
        traits.add("Neat");
        traits.add("Slob");
        traits.add("Snob");
        traits.add("Vegetarian");
        traits.add("Bro");
        traits.add("Evil");
        traits.add("Family-Orientated");
        traits.add("Good");
        traits.add("Hates Children");
        traits.add("Jealous");
        traits.add("Loner");
        traits.add("Loyal");
        traits.add("Mean");
        traits.add("Noncommital");
        traits.add("Outgoing");
        //#endregion

        String result1;
        String result2;
        String result3;
        Random r1 = new Random();
        Random r2 = new Random();
        Random r3 = new Random();

        int rn1 = 0;
        int rn2 = 0;
        int rn3 = 0;

        for(int i = 0; i < traits.size(); i++){
            rn1 = r1.nextInt(traits.size());
            rn2 = r2.nextInt(traits.size()); 
            rn3 = r3.nextInt(traits.size());   
        }
        result1 = traits.get(rn1);
        result2 = traits.get(rn2);
        result3 = traits.get(rn3);
        JOptionPane.showMessageDialog(null, "Random Traits: " + result1 + " " + result2 +" " + result3,
            "Traits Results", 0);
    }
}