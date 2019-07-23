package pl.javastart.app;

import pl.javastart.model.EvenNumbersUtils;

public class EvenNumberTest {
    public static void main(String[] args) {
        EvenNumbersUtils util = new EvenNumbersUtils();

        int[] array = util.createArrayEvenNumbers();
        util.printArray(array);
        System.out.println("Suma wyrazów to: " + util.sumArray(array));
    }
}
