import java.util.Scanner;

public class InversionCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (arr[i] > arr[j]) {
                    count++;
                } else {
                    break;

                }
            }
        }
        System.out.println(count);
    }

}