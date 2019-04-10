
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class JavaNegativeSubarray {
    
    public static void main(String[] arguments) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] stringArray = br.readLine().split(" ");
        int[] intArray = new int[n];
        int negativeCount = 0;
        
        for (int i = 0; i < n; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        
        for (int size = 1; size <= n; size++) {
            for (int j = 0; j <= n - size; j++) {
                int start = j;
                int end = size + j;
                int[] subArray = subArray(intArray, start, end);
                int sum = IntStream.of(subArray).sum();
                //System.out.println(Arrays.toString(subArray));
                //System.out.println("sum ---> " + sum);
                if(sum < 0){
                    negativeCount++;
                }
            }
        }
        
        System.out.println(negativeCount);
    }

    private static int[] subArray(int[] array, int start, int end){
        return Arrays.copyOfRange(array, start, end);
    }
}
