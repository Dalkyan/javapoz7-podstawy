package piąte;

public class Methods {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,1};

        printArray(array);

        System.out.println("Sum = " + sumOfArray(array));
        System.out.println("Avg = " + avg(array));
        System.out.println("Min = " + min(array));
        System.out.println("Max = " + max(array));
        System.out.println("Spread = " + spread(array));
        printArray(statsOfOccurence(array));
        System.out.println("Moda = " + moda(array));
        printArray(sortByCounting(array));

    }

    public static int[] sortByCounting(int[] array){
        int[] sortedArray = new int [array.length];
        int[] stats = statsOfOccurence(array);
        int k=0;
//        int[] sortedArray = new int [sumOfArray(stats)]; <-- alternatywne obliczanie długości tablicy
        for (int i = 0; i < stats.length; i++) {
            for (int j = 0; j < stats[i] ; j++) {
              sortedArray[k] =  i + min(array);
              k++;
            }
        }
        return sortedArray;
    }

    public static int indexOfMax(int[] array){
        int iMax = 0;
        for (int i = 1; i < array.length ; i++) {
            if (array[i] > array[iMax]){
                iMax = i;}
            }
        return iMax;}



    public static int moda(int[] array)
    {
        int[] stats = statsOfOccurence(array);
        int indexOfMaximumValue = indexOfMax(stats);
        return indexOfMaximumValue + min(array);
    }

    public static int[] statsOfOccurence (int[] array){
        int[] statsArray = new int[spread(array)];
        int min = min(array);
        for (int i = 0; i < array.length; i++) {
            statsArray[array[i] - min]++;
        }
        return statsArray;
    }

    //napisać funkcje ktora przyjmuje tablice liczb i wypisuje ich sume

    public static int sumOfArray(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        return sum; }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length -1){
                System.out.print("; ");
            }
        }
        System.out.println("]");
    }

    public static double avg (int [] array){
        int sum = sumOfArray(array);
        return (double) sum/array.length;
    }

    //napisać metodę ktora zwraca najmniejszy parametr
    public static int min(int[] array){
        int min = array[0];
        for (int i = 1; i <array.length ; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
  return min;
    }
    public static int max(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }return max;
    }
    public static int spread(int[] array){
        return max(array) - min(array) + 1;
    }

}


    //napisać metodę ktora zwraca najwikeszy element tablicy parametr


