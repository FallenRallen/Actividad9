import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

    class Perro {
        //variables de la clase...
        private String raza;
        private String nombre;
        private int edad;

        //Constructor
        public Perro(String raza, String nombre, int edad) {
            this.edad = edad;
            this.nombre = nombre;
            this.raza = raza;
        }

        public void comer(String comida, double gramos) {
            System.out.println(nombre + " esta comiendo " + gramos + " gramos de " + comida);
        }

        public String ladrar() {
            return "guau guau";
        }

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
    public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("¿Como se llama el primer perrito?");
        String nombre1 = input.nextLine();
        System.out.println("¿Que raza es el primer perrito?");
        String raza1 = input.nextLine();
        System.out.println("¿Cuantos años tiene el primer perrito?");
        int edad1 = input.nextInt();
        input.nextLine();

        Perro perro1 = new Perro(raza1, nombre1, edad1);

        System.out.println("¿Como se llama el segundo perrito?");
        String nombre2 = input.nextLine();
        System.out.println("¿Que raza es el segundo perrito?");
        String raza2 = input.nextLine();
        System.out.println("¿Cuantos años tiene el segundo perrito?");
        int edad2;

        try {
            edad2 = input.nextInt();
            Perro perro2 = new Perro(raza2, nombre2, edad2);

            perro1.comer("Pollo", 800.0);
            perro1.ladrar();

            perro2.comer("Carne", 500.0);
            perro2.ladrar();
        }catch(Exception e) {
            System.out.println("Por favor, ingrese un numero valido para la edad del perrito");
            }
        input.close();
        }
    }
