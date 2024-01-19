import java.util.ArrayList;

public class MediaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);


        double sum = 0;

        for (int i =0; i <numeros.size() ;i++) {
            if (numeros.get(i) % 2==0){
                sum = sum + numeros.get(i);
            }

        }

        double media = sum / numeros.size();
        System.out.println("la media es:" + media);
        System.out.println("El total es:" + sum);


    }
}
