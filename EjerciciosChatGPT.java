//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjerciciosChatGPT {
    public static void main(String[] args) {
        char caracter = '@';
        char[] myArray = new char[7];
        myArray[0] = '!';
        myArray[1] = '+';
        myArray[2] = '-';
        myArray[3] = '@';
        myArray[4] = '?';
        myArray[5] = '@';
        myArray[6] = '*';
        int contador = 0;
        for (char c : myArray) {
            if (c == '@') {
                contador++;
            }
        }
        System.out.println("Tenemos este monton de " + caracter + " en el sistema, un total de " + contador);
    }
}