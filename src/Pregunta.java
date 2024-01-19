public class Pregunta {

    private String afirmacion;

    private Boolean esCierta;

    private int dificultad;


    public Pregunta(String afirmacion, Boolean esCierta, int dificultad) {
        this.afirmacion = afirmacion;
        this.esCierta = esCierta;
        this.dificultad = dificultad;
    }

    public String getAfirmacion() {
        return afirmacion;
    }

    public Boolean getEsCierta() {
        return esCierta;
    }

    public int getDificultad() {
        return dificultad;
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "afirmacion='" + afirmacion + '\'' +
                ", esCierta=" + esCierta +
                ", dificultad=" + dificultad +
                '}';
    }
}

