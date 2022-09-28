
import java.util.Random;

public class Persona {


    private String nombre="";
    private int edad = 0;
    private String dni;
    private char sexo='H';
    private float peso=0;
    private float altura=0;

    Persona(){}

    Persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.dni="";
        this.peso=0;
        this.altura=0;
    }

    Persona(String nombre, int edad, String dni, char sexo, float peso, float altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.dni=dni;
        this.peso=peso;
        this.altura=altura;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char i) {
        this.sexo = i;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {

        String a= nombre +" tiene " + edad + " años "+"\n";
        String b= "Su DNI es "+dni + "y su sexo es: " +sexo +"\n";
        String c= nombre + " pesa " + peso + "kg y mide " + altura + "m" +"\n";
        return(a+b+c);

    }

    public int calcularIMC() {

        float imc;

        imc = peso/(altura*2);

        if (imc<20) {
            return -1;
        } else if (imc>=20 && imc<=25) {
            return 0;
        } else {
            return 1;
        }
    }

    public int generaDNI() {

        int min = 10000000;
        int max = 99999999;
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        System.out.println(randomNum);

        return randomNum;

    }

}