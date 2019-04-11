
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ProblemaC {
    
    public static void main(String[] arguments)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> output = new ArrayList();
        
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            char[] charArray = br.readLine().toCharArray();
            int sortedSubStrings = n;
            for (int size = 2; size <= n; size++) {
                for (int j = 0; j <= n - size; j++) {
                    int start = j;
                    int end = size + j;
                    char[] subCharArray = subArray(charArray, start, end);
                    int sortedElements = 1;
                    for (int k = 0; k < subCharArray.length - 1; k++) {
                        if(subCharArray[k] <= subCharArray[k + 1]){
                            sortedElements++;
                        }
                    }
                    if(sortedElements == subCharArray.length){
                        sortedSubStrings++;
                    }
                }
            }
            output.add(sortedSubStrings);
        }
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
    
    private static char[] subArray(char[] array, int start, int end){
        return Arrays.copyOfRange(array, start, end);
    }
}
