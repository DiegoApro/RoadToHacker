package main;

import java.util.Scanner;

public class CarreraDeLaSelva {  public static void main(String[] args) {

    String[] circuitoChico = {};
    String[] circuitoMedio = {};
    String[] circuitoGrande = {};

    int precioCircuitoChicoMenor = 1300;
    int precioCircuitoChicoMayor = 1500;
    int precioCircuitoMedianoMenor = 2000;
    int precioCircuitoMedianoMayor = 2300;
    int precioCircuitoGrande = 2800;

    String[] participantes = {};

    // int edad = 0;
    int numeroParticipante = 0;
    int montoAbonar = 0;

    Scanner lectura = new Scanner (System.in);
    System.out.print("ingrese su DNI: ");
    int dni = lectura.nextInt();
    System.out.print("ingrese su nombre: ");
    String nombre = lectura.next();
    System.out.print("ingrese su apellido: ");
    String apellido = lectura.next();
    System.out.print("ingrese su edad: ");
    int celular = lectura.nextInt();
    System.out.print("ingrese su numero de emergencia: ");
    int numeroEmergencia = lectura.nextInt();
    System.out.print("ingrese su grupo sanguiño: ");
    String sangre = lectura.next();
    int edad = lectura.nextInt();
    System.out.print("ingrese su celular: ");

    System.out.print("si quiere competir en el Circuito Chico, coloque 1, en caso que sea en el Circuito Mediano coloque 2, y sino 3 ");
    String tipoCompe = lectura.next();

    if (tipoCompe == 1){
        circuitoChico.add(nombre);
        if (edad >= 18){
            System.out.print("Ústed debera abonar " + precioCircuitoChicoMayor);
        }
        System.out.print("Ústed debera abonar " + precioCircuitoChicoMenor);
    }
    if (tipoCompe == 2){
        circuitoMedio.add(nombre);
        if (edad >= 18){
            System.out.print("Ústed debera abonar " + precioCircuitoMedianoMayor);
        }
        System.out.print("Ústed debera abonar " + precioCircuitoMedianoMenor);
    }
    if (tipoCompe == 3 && edad >= 18){
        circuitoGrande.add(nombre);
        System.out.print("Ústed debera abonar " + precioCircuitoGrande);

    }
};
}
