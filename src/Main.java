
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String nombre;
        int edad;
        char sexo;
        float peso;
        float altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre: ");

        nombre=sc.next();
        System.out.println("Introduzca la edad: ");
        edad= sc.nextInt();
        System.out.println("Introduzca el sexo: ");

        sexo=sc.next().charAt(0);
        System.out.println("Introduzca el peso: ");
        peso=sc.nextFloat();
        System.out.println("Introduzca la altura: ");
        altura=sc.nextFloat();

        Persona persona1 = new Persona();
        persona1.setNombre(nombre);
        persona1.setEdad(edad);
        persona1.setSexo(sexo);
        persona1.setPeso(peso);
        persona1.setAltura(altura);
        persona1.setDni(persona1.generaDNI()+"");

        System.out.println(persona1);

        System.out.println(persona1.calcularIMC());


    }


}