package academy.devdojo.maratonajava;

public class EstruturadeRepetição02 {

    public static void main(String[] args) {
        // Imprima todos o números pares até 10 até 1000000

        for (int i = 0; i <= 1000000 ; i+=2) {

            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println(i);
            }
            
        }
    }
}
