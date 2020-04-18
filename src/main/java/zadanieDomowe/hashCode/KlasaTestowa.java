package zadanieDomowe.hashCode;

import java.util.HashMap;
import java.util.Map;

public class KlasaTestowa {
    public static void main(String[] args) {
        String zmienna = "teks";
        String zmienna2 = new String("tekst");

        Czlowiek czlowiek1 = new Czlowiek("Mateusz", 99);
        Czlowiek czlowiek2 = new Czlowiek("Mateusz", 99);
        Czlowiek czlowiek3 = new Czlowiek("X", 99);

        Czlowiek czlowiek4 = new SuperCzlowiek("SuperMateusz",100);
        Czlowiek czlowiek5 = new EkstraCzlowiek("SuperMateusz",100);

//        System.out.println(czlowiek4.equals(czlowiek5));

        Map<String,Czlowiek> map = new HashMap<>();
        map.put("Mateusz", czlowiek4);
        map.put("X",czlowiek3);

        System.out.println(map.get("Mateusz").getImie());

    }


}
