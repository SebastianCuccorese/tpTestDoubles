import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    Map<Integer,String> map=new HashMap<Integer,String>();

    public Diccionario() {
        map.put(1, "2");
        map.put(2, "3");
        map.put(3, "4");
        map.put(4,"5");
        map.put(5,"6");
        map.put(6, "7");
        map.put(7, "8");
        map.put(8,"9");
        map.put(9, "10");
        map.put(10, "J");
        map.put(11, "Q");
        map.put(12, "K");
        map.put(13, "AS");
    }
    public Integer buscarCartaDiccionario(Carta carta) {
        int i = 1;
        while (!map.get(i).equals(carta.getNumero())) {
            i += 1;
        }
        return i;
    }

}
