import java.util.ArrayList;

public class Partida {

   private ArrayList <Pregunta> preguntas=new ArrayList<>();

    public Partida() {
        Pregunta p1 = new Pregunta( "La capital de Francia es París", true , 2);
        Pregunta p2 = new Pregunta( "El cielo es rojo", false, 1);

        preguntas = new ArrayList<>();

        preguntas.add(p1);
        preguntas.add(p2);
    }

    public void mostrarPreguntas(){

        for (int i=0; i<preguntas.size(); i++){
            Pregunta preguntaActual = preguntas.get(i);
            if (preguntaActual.getEsCierta()) {
                System.out.println(preguntaActual.toString());
            }
        }
    }
}
