
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Java1DArray {
    
    public static void main(String[] arguments) throws IOException{
        
        BufferedReader br = null;
        br = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(br.readLine());
        int[] array = new int[arraySize];
        
        for(int i = 0; i < array.length; i++){
            int element = Integer.parseInt(br.readLine());
            array[i] = element;
        }
        
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
