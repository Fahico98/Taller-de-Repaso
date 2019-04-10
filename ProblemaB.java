
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProblemaB {
    
    public static void main(String[] arguments)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> output = new ArrayList();
        
        for(int i = 0; i < T; i++){
            int brokenWalls = 0;
            String[] strArray = br.readLine().split("");
            for(int j = 0; j < strArray.length; j++){
                if(strArray[j].compareTo("W") == 0){
                    
                    String buffer_1 = "", buffer_2 = "", buffer_3 = "", buffer_4 = "";
                    
                    if(j - 2 >= 0){
                        buffer_1 = strArray[j - 2];
                    }
                    if(j - 1 >= 0){
                        buffer_2 = strArray[j - 1];
                    }
                    if(j + 1 < strArray.length){
                        buffer_3 = strArray[j + 1];
                    }
                    if(j + 2 < strArray.length){
                        buffer_4 = strArray[j + 2];
                    }
                    
                    if(buffer_1.compareTo("B") == 0 || buffer_2.compareTo("B") == 0 ||
                            buffer_3.compareTo("B") == 0 || buffer_4.compareTo("B") == 0){
                        brokenWalls++;
                    }
                }
            }
            output.add(brokenWalls);
        }
        
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}
