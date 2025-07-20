 public class Variables {
     public static final String EMAIL = "elvarion@gmail.com";
    public static void main(String[] args){
        // 1. Declara una variable de tipo String y asígnale tu nombre.

        // 2. Crea una variable de tipo int y asígnale tu edad.

        // 3. Crea una variable double con tu altura en metros.

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.

        // 5. Declara una constante con tu email.

        // 6. Crea una variable de tipo char y guárdale tu inicial.

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.

        // 9. Imprime el tipo de dos variables creadas anteriormente.

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.

        String name = "Daniel";
        System.out.println("Me llamo " + name);
        int age = 35;
        System.out.println("Tengo " + age + " años.");
        double high = 1.75;
        System.out.println("Esta es mi altura: " + high);
        boolean iLikeProgramming = true;
        System.out.println("Me encanta programar = " + iLikeProgramming);
        System.out.println("Mi direccion email: " + EMAIL);
        char initial = 'D';
        System.out.println("La inicial de mi nombre: " + initial);
        String location = "C/ Illes pitiüses nº 15 piso 9 puerta 7";
        System.out.println(location);
        location = "C/ Islas pitiusas nº 15 piso 9 puerta 7";
        System.out.println(location);
        int a = 1;
        int b = 7;
        System.out.println("(a+b) = " + (a+b));

    }
}