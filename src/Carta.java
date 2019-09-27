import org.jetbrains.annotations.Contract;

public class Carta {
    private String palo;
    private String numero;

    @Contract(pure = true)
    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    @Contract(pure = true)
    public String getPalo() {
        return palo;
    }

    @Contract(pure = true)
    public String getNumero() {
        return numero;
    }
}
