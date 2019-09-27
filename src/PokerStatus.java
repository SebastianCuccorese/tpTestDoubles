import org.jetbrains.annotations.NotNull;


public class PokerStatus {

    private boolean comparePoker(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {

    }
    private boolean compareTwoCardsNumber(Carta carta1, Carta carta2) {
        return carta1.getNumero().equals(carta2.getNumero());
    }

    private boolean compararSiLosPalosSonIguales(@NotNull Carta carta1, Carta carta2) {
        return carta1.getPalo().equals(carta2.getPalo());
    }
}
