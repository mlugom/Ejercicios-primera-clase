package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio3
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field_3.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,2, 0, Direction.EAST,0);
            boolean condicional = false;
            do{
                llegar();
                recoger();
                colocar();
                if(contador1 != 0){
                    bajar_fila();
                }else{
                    condicional = true;
                }
            }while(condicional == false);
            
	}
        public static int total;
        public static int contador1;
        public static void llegar(){
            estudiante.move();
        }
        public static void colocar(){
            total = estudiante.countThingsInBackpack();
            for(int i = 1; i <= total; i++){
                estudiante.putThing();
                estudiante.move();
            }
        }
        public static void bajar_fila(){
            for(int i = 1; i <= 3; i++){
                estudiante.turnLeft();
            }
            estudiante.move();
            for(int i = 1; i <= 3; i++){
                estudiante.turnLeft();
            }
            for(int i = 1; i <= total+1; i++){
                estudiante.move();
            }
            estudiante.turnLeft();
            estudiante.turnLeft();
        }
        public static void recoger(){
            boolean cond = false;
            contador1 = 0;
            do{
                boolean cond1 = estudiante.canPickThing();
                if(cond1 == true){
                    estudiante.pickThing();
                    contador1++;
                }else{
                    cond = true;
                }
            }while (cond == false);
        }
}

