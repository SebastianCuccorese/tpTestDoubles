import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    Map<Integer,String> map=new HashMap<Integer,String>();

    public Diccionario() {
        map.put(1, "AS");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        map.put(5,"5");
        map.put(6,"6");
        map.put(7, "7");
        map.put(8, "8");
        map.put(9,"9");
        map.put(10, "10");
        map.put(11, "J");
        map.put(12, "Q");
        map.put(13, "K");
    }
    public Integer buscarCartaDiccionario(Carta carta) {
        int i = 1;
        while (!map.get(i).equals(carta.getNumero())) {
            i += 1;
        }
        return i;
    }

}
