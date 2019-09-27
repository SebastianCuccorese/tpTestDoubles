import org.jetbrains.annotations.NotNull;

public class Mazo {
    Diccionario diccionario = new Diccionario();

    public Carta buscarCartaMayor(Carta carta1, Carta carta2) {
       if(diccionario.buscarCartaDiccionario(carta1) > diccionario.buscarCartaDiccionario(carta2)) {
           return carta1;
        }
       else{return  carta2;}
    }
}
