package pl.javastart.model;

public class EvenNumbersUtils {

    public void printArrayAndSum(){
        int i = 0;
        int sum = 0;
        while(i <= 100){
            System.out.println(i);
            sum += i;
            i += 2;
        }
        System.out.println("Suma wyrazów to: " + sum);
    }
}
