//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicios1 {
    public static void main(String[] args) {
        char caracter = '@';
        char[] myArray = new char[7];
        myArray[0] = '?';
        myArray[2] = '!';
        myArray[5] = '@';
        myArray[4] = '/';
        char[] myArray2 = {'?', '!', '@', '=', '+', '-', '€'};
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray[i] == caracter) {
                System.out.println("En la posicion valor indidice =" + (i + 1) + " , valor array = " + myArray[i]);

            }
            if (myArray2[i] == caracter) {
                System.out.println("En la posicion valor indidice = " + (i + 1) + " , valor array2 = " + myArray2[i]);

            }
            if (myArray[i] != '\u0000') {
                System.out.println("Posición " + i + " contiene: " + myArray[i]);
            }
        }
        int contador = 0;
        for (int x = 0; x < myArray.length; x++ ){
            if (myArray[x] != '\u0000'){
                contador++;
            }
        }
        System.out.println("La lista contiene " + contador + " símbolos");

    }
}