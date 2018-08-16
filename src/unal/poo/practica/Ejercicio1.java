package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio1
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field_1.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 2, Direction.WEST,0);
            girar180();
            movimiento();
            girar180();
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
        public static void girar180(){
            estudiante.turnLeft();
            estudiante.turnLeft();
        }
        public static void movimiento(){
            estudiante.move();
            for (int i = 0; i < 3; i++){
                estudiante.turnLeft();
            }
            for(int i=0; i < 3; i++){
                estudiante.move();
            }            
            for(int i=0; i < 3; i++){
                estudiante.turnLeft();
            }   
            for(int i=0; i < 3; i++){
                estudiante.move();
            }
            for(int i=0; i < 3; i++){
                estudiante.turnLeft();
            }
            for(int i=0; i < 3; i++){
                estudiante.move();
            }
            for(int i=0; i < 3; i++){
                estudiante.turnLeft();
            }
            for(int i=0; i < 2; i++){
                estudiante.move();
            }
        }
}

