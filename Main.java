//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String texto = "Me llamo Manuela";
        System.out.println(texto);
        texto = texto + ", Me llamo Juanela";
        System.out.println(texto);

        int edad = 0;
        double edad2 = 2.5;
        System.out.println("edad: " + edad + ", edad2: " + edad2);

        if (edad == 0) {
            edad = 30;
        }
        System.out.println("edad: " + edad);

        int [] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        String [] nombres = new String[5];
        nombres[0] = "Manuela";

    }
}