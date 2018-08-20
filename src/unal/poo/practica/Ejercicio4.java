package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio4
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field_4.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 0, Direction.EAST,0);
            
            llegar_a_entrada(1);
            entrar();
            check();
            volver(1);
            llegar_a_entrada(2);
            entrar();
            colocar();
            volver(2);
            
	}
        public static boolean matriz [][] = new boolean [3][3];
        public static void llegar_a_entrada(int numPuerta){
            for(int i = 0; i < 3; i++){
                estudiante.turnLeft();
            }
            for(int i = 0 ; i < 4; i++){
                estudiante.move();
            }
            if(numPuerta == 1){
                estudiante.turnLeft();
                estudiante.move();
                estudiante.turnLeft();
            }else{
                for(int i = 0; i < 4; i++){
                    estudiante.move();
                }
                estudiante.turnLeft();
                for(int i = 0; i < 5; i++){
                    estudiante.move();
                }
                estudiante.turnLeft();
            }
        }
        public static void volver(int numPuerta){
            for(int i = 0; i < 3; i++){
                estudiante.turnLeft();
            }
            if(numPuerta == 1){
                estudiante.move();
                for(int i = 0; i < 3; i++){
                    estudiante.turnLeft();                    
                }
                for(int i = 0; i < 4; i++){
                    estudiante.move();
                }
                for(int i = 0; i < 3; i++){
                    estudiante.turnLeft();                    
                }                
            }else{
                for(int i = 0; i < 5; i++){
                    estudiante.move();
                }
                for(int i = 0; i < 3; i++){
                    estudiante.turnLeft();                    
                }
                for(int i = 0; i < 8; i++){
                    estudiante.move();
                }
                for(int i = 0; i < 3; i++){
                    estudiante.turnLeft();                    
                }
            }
        }
        public static void entrar(){
            estudiante.move();
        }
        public static void check(){
            for(int i = 0; i < 2; i++){
                estudiante.move();            
            }
            for(int i = 0; i < 3; i++){
                estudiante.turnLeft();                    
            }
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    matriz[i][j] = estudiante.canPickThing();
                    if(matriz[i][j] == true){
                        estudiante.pickThing();
                    }
                    if(j < 2){
                        estudiante.move();
                    }else if(j == 2 && i < 2){
                        for(int k = 0; k < 3; k++){
                            estudiante.turnLeft();
                        }
                        estudiante.move();
                        for(int k = 0; k < 3; k++){
                            estudiante.turnLeft();
                        }
                        estudiante.move();
                        estudiante.move();
                        for(int k = 0; k < 2; k++){
                            estudiante.turnLeft();
                        }
                    }else if(j == 2 && i == 2){
                        for(int k = 0; k < 2; k++){
                            estudiante.turnLeft();
                        }
                        estudiante.move();
                        estudiante.move();                        
                    }
                }
            }
            estudiante.turnLeft();
            estudiante.move();
        }
        public static void colocar(){
            estudiante.move();
            estudiante.move();
            for(int i = 0; i < 3; i++){
                estudiante.turnLeft();
            }
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(matriz[i][j] == true){
                        estudiante.putThing();
                    }
                    if(j < 2){
                        estudiante.move();
                    }else if(j == 2 && i < 2){
                        for(int k = 0; k < 3; k++){
                            estudiante.turnLeft();
                        }
                        estudiante.move();
                        for(int k = 0; k < 3; k++){
                            estudiante.turnLeft();
                        }
                        estudiante.move();
                        estudiante.move();
                        for(int k = 0; k < 2; k++){
                            estudiante.turnLeft();
                        }
                    }else if(j == 2 && i == 2){
                        for(int k = 0; k < 2; k++){
                            estudiante.turnLeft();
                        }
                        estudiante.move();
                        estudiante.move();
                    }
                }
            }
            estudiante.turnLeft();
            estudiante.move();
        }
}

