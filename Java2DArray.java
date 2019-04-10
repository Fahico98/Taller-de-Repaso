
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Java2DArray {
    
    public static void main(String[] arguments) throws IOException{
        
        BufferedReader br = null;
        br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] matrix = new int[6][6];
        
        for (int i = 0; i < 6; i++) {
            String[] arrayStr = br.readLine().split(" ");
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = Integer.parseInt(arrayStr[j]);
            }
        }
        
        int max = -10;
        int sum = 0;
        
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                sum = (matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                    + matrix[i + 1][j + 1]
                    + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i +2][j + 2]);
                
                /*
                System.out.println(matrix[i][j] + " " + matrix[i][j + 1] + " " + matrix[i][j + 2]);
                System.out.println("   " + matrix[i + 1][j + 1]);
                System.out.println(matrix[i + 2][j] + " " + matrix[i + 2][j + 1] + " " + matrix[i +2][j + 2]);
                System.out.println("sum ---> " + sum);
                */
                
                if(sum > max){
                    max = sum;
                    //System.out.println("max changed...!");
                }
            }
        }
        
        System.out.println(max);
    }
}
