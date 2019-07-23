package pl.javastart.model;

public class EvenNumbersUtils {

    public int[] createArrayEvenNumbers(){
        int[] array = new int[51];
        int i = 0;
        while(i <= 100){
            if(i % 2 != 0){
                i++;
                continue;
            }
            array[i / 2] = i;
            i++;
        }
        return array;
    }

    public void printArray(int[] array){
        for (int element : array){
            System.out.println(element);
        }
    }

    public int sumArray(int [] array){
        int sum = 0;
        for(int element : array){
            sum += element;
        }
        return sum;
    }
}
