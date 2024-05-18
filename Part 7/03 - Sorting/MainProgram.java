public class MainProgram {

    public static void main(String[] args) {
        
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array) {
        int smallestNumber = array[0];
        
        for (int number: array) {
            if (smallestNumber > number) {
                smallestNumber = number;
            }
        }
        
        return smallestNumber;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallestNumber = array[0];
        int smallestNumberIndex = 0;
        int i = 0;
        
        for (int number: array) {
            if (number < smallestNumber) {
                smallestNumber = number;
                smallestNumberIndex = i;
            }
            i++;
        }
        
        return smallestNumberIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = 0;
        
        for (int i = startIndex ; i < table.length ; i++) {
            if (table[i] <= smallest) {
                smallest = table[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        
        for (int i = 0 ; i < array.length ; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            
            System.out.println(array);
        }
    }
}