/*
Implemente un algoritmo que le permita solicitar el ingreso por teclado el 
nombre de la universidad, el departamento,la carrera, el nombre de la materia, 
nombres completos del estudiante,nivel, numero de cedula, pais, ciudad, canton,
provincia, ID, sexo.
 */
package datosdelestudiante1;

/**
 *
 * @author DARIO MAURICIO CHISAGUANO AIMACAÑA
 */
import java.util.Scanner;
public class DatosDelEstudiante1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);//new, reserva espacio de memoria
        System.out.println("Ingrese el nombre de la Universidad:");
        String nombreUniversidad=objeto.nextLine();
        
        System.out.println("Ingrese el Departamento:");
        String departamento=objeto.nextLine();
        
        System.out.println("Ingrese la Carrera:");
        String carrera=objeto.nextLine();
        
        System.out.println("Ingrese el Nombre de la materia:");
        String materia=objeto.nextLine();
        
        System.out.println("Ingrese el Nombre completo del estudiante:");
        String nombreEstudiante=objeto.nextLine();
        
        System.out.println("Ingrese el Nivel:");
        String nivel=objeto.nextLine();
        
        System.out.println("Ingrese el Numero de cedula:");
        String cedula=objeto.nextLine();
        
        System.out.println("Ingrese el Pais:");
        String pais=objeto.nextLine();
        
        System.out.println("Ingrese el Ciudad:");
        String ciudad=objeto.nextLine();
        
        System.out.println("Ingrese el Canton:");
        String canton=objeto.nextLine();
        
        System.out.println("Ingrese la Provincia:");
        String provincia=objeto.nextLine();
        
        System.out.println("Ingrese el ID:");
        String id=objeto.nextLine();
        
        System.out.println("Ingrese el Sexo:");
        String sexo=objeto.nextLine();
        
        System.out.println("Bienvenido a la Universidad:" +nombreUniversidad);
       
        
    }
    
}


