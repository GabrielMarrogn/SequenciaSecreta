import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int sequencia = 0;
        int igual = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                igual = arr[i];
                sequencia++;
            }

            if(arr[i] != igual){
                sequencia++;
                igual = arr[i];
            }

            if(arr[i] == igual){
                igual = arr[i];
            }
        }

        System.out.println(sequencia);
        sc.close();
    }
}
