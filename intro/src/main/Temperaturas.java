package main;

public class Temperaturas {
    public static void main(String[] args) {

        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima",
                "Santiago de Chile", "Lisboa", "Tokio"};

        int [] [] temperatura= {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int ciudadMin = 0;
        int ciudadMax = 0;
        final int INDEX_MIN = 0;
        final int INDEX_MAX = 1;

        for (int i = 0; i < ciudades.length; i++) {
            if (temperatura[i][INDEX_MIN] < temperatura[ciudadMin][INDEX_MIN]) {
                ciudadMin = i;
            }

            if (temperatura[i][INDEX_MAX] > temperatura[ciudadMax][INDEX_MAX]) {
                ciudadMax = i;
            }
        }
        System.out.println("La menor temperatura la tuvo " + ciudades[ciudadMin] + " con " + temperatura[ciudadMin][INDEX_MIN] + " grados.");
        System.out.println("La mayor temperatura la tuvo " + ciudades[ciudadMax] + " con " + temperatura[ciudadMax][INDEX_MAX] + " grados.");
    }
}
