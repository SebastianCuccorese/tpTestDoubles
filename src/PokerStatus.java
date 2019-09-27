import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PokerStatus {

    public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        if(comparePoker(carta1, carta2, carta3, carta4, carta5)) {return "Es Poker";}
        else if(compareTrio(carta1, carta2, carta3, carta4, carta5)) {return "Es Trio";}
        else if(compareColor(carta1, carta2, carta3, carta4, carta5)) {return "Es Color";}
        else {return  "No hay jugada";}
    }

    private boolean compareTrio(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        ArrayList<Carta> mano = new ArrayList<>(Arrays.asList(carta1, carta2, carta3, carta4, carta5));

        return (filtrarManoPorNumero(mano, 0).size() ==3) || (filtrarManoPorNumero(mano, 1).size() == 3) || (filtrarManoPorNumero(mano, 0).size() == 3);
    }

    boolean comparePoker(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        ArrayList<Carta> mano = new ArrayList<>(Arrays.asList(carta1, carta2, carta3, carta4, carta5));

        return filtrarManoPorNumero(mano,0).size() == 4 || filtrarManoPorNumero(mano,1).size() == 4;
    }

    @NotNull List filtrarManoPorNumero(@NotNull List<Carta> cartaList, int i) {


        return cartaList.stream().filter(carta -> carta.getNumero().equals(cartaList.get(i).getNumero())).collect(Collectors.toList());
    }
    boolean compareColor(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        ArrayList<Carta> mano = new ArrayList<>(Arrays.asList(carta1, carta2, carta3, carta4, carta5));
        List<Carta> listaColor = mano.stream().filter(carta -> carta.getPalo().equals(mano.get(0).getPalo())).collect(Collectors.toList());

        return listaColor.size() == 5;
    }
}
