package main.jungle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JungleRace {

    public static void main(String[] args) {

        List<Persona> circuitoChico = new ArrayList<>();
        List<Persona> circuitoMedio = new ArrayList<>();
        List<Persona> circuitoGrande = new ArrayList<>();
        List<Persona> participantes = new ArrayList<>();
        int precio;

        Persona persona1 = new Persona("Fede", "Apro", 28);
        Persona persona2 = new Persona("Diego", "Apro", 20);
        Persona persona3 = new Persona("Juan", "Perez", 15);

        participantes.add(persona1);
        participantes.add(persona2);
        participantes.add(persona3);


        for (Persona participante : participantes) {
            int numeroCircuito = preguntarCircuito();

            if (numeroCircuito == 1) {
                precio = participante.getEdad() > 18 ? PreciosCircuitos.PRECIO_CIRCUITO_CHICO_MAYOR : PreciosCircuitos.PRECIO_CIRCUITO_CHICO_MENOR;
                System.out.println("Ústed debera abonar " + precio);
                circuitoChico.add(participante);

            } else if (numeroCircuito == 2) {
                precio = participante.getEdad() > 18 ? PreciosCircuitos.PRECIO_CIRCUITO_MEDIANO_MAYOR : PreciosCircuitos.PRECIO_CIRCUITO_MEDIANO_MENOR;
                System.out.println("Ústed debera abonar " + precio);
                circuitoMedio.add(participante);

            } else if (numeroCircuito == 3) {

                if (participante.getEdad() > 18) {
                    System.out.println("Ústed debera abonar " + PreciosCircuitos.PRECIO_CIRCUITO_GRANDE);
                    circuitoGrande.add(participante);
                } else {
                    System.out.println("No puede inscribirse a este circuito");
                }

            } else {
                System.out.println("El circuito ingresado no existe.");
            }

        }

        System.out.println("Listado de participantes por circuito:");
        System.out.println("Circuito Chico:");
        imprimirListaPersonas(circuitoChico);

        System.out.println("Circuito Medio:");
        imprimirListaPersonas(circuitoMedio);

        System.out.println("Circuito Grande:");
        imprimirListaPersonas(circuitoGrande);
    }

    public static int preguntarCircuito() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el circuito a inscribirse:");
        System.out.println("1 - Circuito chico");
        System.out.println("2 - Circuito medio");
        System.out.println("3 - Circuito grande");
        return entrada.nextInt();
    }

    public static void imprimirListaPersonas(List<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println("- " + persona.getNombre() + " " + persona.getApellido());
        }
    }

}
