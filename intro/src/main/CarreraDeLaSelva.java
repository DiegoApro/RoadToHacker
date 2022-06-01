package main;

import java.util.Scanner;

public class CarreraDeLaSelva {  public static void main(String[] args) {

    String[] circuitoChico = {};
    String[] circuitoMedio = {};
    String[] circuitoGrande = {};

    String[] [] participantes = {};  // {{DNI}, {nombre}, {apellido}, {edad}, {celular}, {número de participante}}

    int precioCircuitoChicoMenor = 1300;
    int precioCircuitoChicoMayor = 1500;
    int precioCircuitoMedianoMenor = 2000;
    int precioCircuitoMedianoMayor = 2300;
    int precioCircuitoGrande = 2800;

    // int edad = 0;
    int numeroParticipante = 0;
    int montoAbonar = 0;

    Scanner entrada = new Scanner (System.in);

    System.out.print("ingrese su DNI: ");
    int dni = entrada.nextInt();

    System.out.print("ingrese su nombre: ");
    String nombre = entrada.next();

    System.out.print("ingrese su apellido: ");
    String apellido = entrada.next();

    System.out.print("ingrese su edad: ");
    int edad = entrada.nextInt();


    System.out.print("ingrese su numero de emergencia: ");
    int numeroEmergencia = entrada.nextInt();

    System.out.print("ingrese su grupo sanguiño: ");
    String sangre = entrada.next();


    System.out.print("ingrese su celular: ");
    int celular = entrada.nextInt();

    System.out.print("si quiere competir en el Circuito Chico, coloque 1, en caso que sea en el Circuito Mediano coloque 2, y sino 3: ");
    int tipoCompe = entrada.nextInt();


    if (tipoCompe == 1){
        if (edad >= 18){
            System.out.print("Ústed debera abonar " + precioCircuitoChicoMayor);
        } else {
        System.out.print("Ústed debera abonar " + precioCircuitoChicoMenor);
        }
    }
    if (tipoCompe == 2){
        if (edad >= 18){
            System.out.print("Ústed debera abonar " + precioCircuitoMedianoMayor);
        } else {
            System.out.print("Ústed debera abonar " + precioCircuitoMedianoMenor);
        }
    }
    if (tipoCompe == 3){
        if (edad < 18){
            System.out.print("Ústed no puede partipar en el circuito grande por ser menor de edad");
        }else {
            System.out.print("Ústed debera abonar " + precioCircuitoGrande);
        }
    }

    };
}
