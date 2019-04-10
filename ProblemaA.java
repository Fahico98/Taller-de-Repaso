
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaA {

    public static void main(String[] arguments) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strArray = br.readLine().split(" ");
        int[] intArray = new int[N];
        for (int i = 0; i < N; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        int posMax = -1 * (int) Math.pow(10, 9);
        int negMax = (int) Math.pow(10, 9);
        int posMaxIndex = -1;
        int negMaxIndex = -1;
        for (int j = 0; j < N; j++) {
            if (intArray[j] > posMax) {
                posMax = intArray[j];
                posMaxIndex = j;
            }
            if (intArray[j] < negMax) {
                negMax = intArray[j];
                negMaxIndex = j;
            }
        }
        int posMaxProduct = -1 * (int) Math.pow(10, 9);
        int negMaxProduct = -1 * (int) Math.pow(10, 9);
        for (int k = 0; k < N; k++) {
            if (k != posMaxIndex && k != negMaxIndex) {
                if (intArray[k] > 0) {
                    int posBuffer = intArray[k] * posMax;
                    if (posBuffer > posMaxProduct) {
                        posMaxProduct = posBuffer;
                    }
                } else {
                    int negBuffer = intArray[k] * negMax;
                    if (negBuffer > negMaxProduct) {
                        negMaxProduct = negBuffer;
                    }
                }
            }
        }
        System.out.println(Math.max(posMaxProduct, negMaxProduct));
    }
}
