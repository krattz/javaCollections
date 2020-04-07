import java.util.ArrayDeque;
import java.util.Deque;
public class uniqueNumbers {
    // Function to find maximum number of
    // Unique numbers in Sub-Array
    // of given size
    public static int maxUniqueNum(int arr[], int intNumber , int subArraySize)
    {
        int maxUnique = 0;
        for (int i = 0; i < intNumber-subArraySize; i++) {
            int currentUnique = 0;
            Deque<Object> queue = new ArrayDeque<>();
            for (int k = i; k < i + subArraySize; k++) {
                if (!queue.contains(arr[k])) {
                    queue.add(arr[k]);
                    currentUnique++;
                }
            }
            if (currentUnique > maxUnique)
                maxUnique = currentUnique;
        }
        return maxUnique;
    }
    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = {7,5,5,7,5,5,7,5,5,6};
        int intNumber = 10;
        int subArraySize = 3;
        System.out.println(maxUniqueNum(arr, intNumber, subArraySize));

    }
}
