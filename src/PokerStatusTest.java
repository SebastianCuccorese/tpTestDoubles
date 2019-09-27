import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.catalog.Catalog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PokerStatusTest {
    private Carta asPicas;
    private Carta asCorazones;
    private Carta asDiamantes;
    private Carta JDiamantes;
    private Carta QDiamantes;
    private Carta DiezDiamantes;
    private Carta ochoDiamantes;
    private PokerStatus pokerStatus;
    ArrayList<Carta> i = new ArrayList<>();
    @BeforeEach
    void setUp() {
        asPicas = new Carta("Picas", "AS");
        asCorazones = new Carta("Corazones", "AS");
        Carta asTreboles = new Carta("Treboles", "AS");
        asDiamantes = new Carta("Diamantes", "AS");
        JDiamantes = new Carta("Diamantes", "J");
        QDiamantes = new Carta("Diamantes", "Q");
        DiezDiamantes = new Carta("Diamantes", "10");
        ochoDiamantes = new Carta("Diamantes", "8");
        pokerStatus = new PokerStatus();
        i.addAll(Arrays.asList(asPicas, asCorazones,  QDiamantes, asTreboles, asDiamantes));
    }

    @Test
    void compareColor() {
        assertTrue(pokerStatus.compareColor(DiezDiamantes, ochoDiamantes, JDiamantes, QDiamantes, asDiamantes));
    }
    @Test
    void comparePoker() {
        assertTrue(pokerStatus.comparePoker(asPicas, asCorazones,  asDiamantes, JDiamantes, asDiamantes));
    }
}