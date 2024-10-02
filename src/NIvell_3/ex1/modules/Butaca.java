package NIvell_3.ex1.modules;

public class Butaca {

    private int numFila;
    private int numAsiento;
    private String persona;

    public Butaca(int numFila, int numAsiento, String persona) {
        this.numAsiento = numAsiento;
        this.numFila = numFila;
        this.persona = persona;
    }
    //GETTERS

    public int getNumFila() {
        return this.numFila;
    }
    public int getNumAsiento() {
        return this.numAsiento;
    }
    public String getPersona() {
        return persona;
    }

    public String equals(Butaca butaca1, Butaca butaca2) {
        String respuesta = "";
        if(butaca1.getNumAsiento() == butaca2.getNumAsiento() && butaca1.getNumFila() == butaca2.getNumFila()) {
            respuesta = "Las dos butacas son iguales";
        }
        return respuesta;
    }

    //ToSring

    public String toString() {
        return "Fila: " + numFila + ", Seient: " + numAsiento + ", Persona: " + this.persona;
    }
}
