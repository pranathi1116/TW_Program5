import java.util.*;
public class ArrayTypeFunctions {
    public static int findArrayType(int arraySize,int[] array) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] % 2 == 0)
                evenCount += 1;
            else
                oddCount+=1;
        }
        if(evenCount==arraySize)
            return 1;
        else if(oddCount==arraySize)
            return 2;
        else
            return 3;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++)
            array[i] = scanner.nextInt();
        if(findArrayType(arraySize,array)==1)
            System.out.println("The array is Even");
        else if(findArrayType(arraySize,array)==2)
            System.out.println("The array is Odd");
        else
            System.out.println("The array is Mixed");
    }
}

