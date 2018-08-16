package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio2
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field_2.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 0, Direction.EAST,0);
            avanza(5);
            esquina();
            avanza(5);
            esquina();
            avanza(4);
            esquina();
            avanza(4);
            esquina();
            avanza(3);
            esquina();
            avanza(3);
            esquina();
            avanza(2);
            esquina();
            avanza(2);
            esquina();
            avanza(1);
            esquina();
            avanza(1);
	}
        public static void esquina(){
            for(int i = 0; i < 3; i++){
                estudiante.turnLeft();
            }         
        }
        public static void avanza(int numero){
            for(int i = 0; i < numero; i++){
                estudiante.move();
                estudiante.pickThing();
            }
        }
        
}

