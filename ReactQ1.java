import java.util.Scanner;

// arr = 1 7 3 6 5 6
// left sum = arr[0] + arr[1] + arr[2] -> leftsum = 1+7+3=11
// output - 3
// right sum = arr[4] + arr[5] -> rightsum = 5+6=11

// 7 4 3 6 5

public class ReactQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int leftsum = 0;
        int rightsum = 0;
        int index=0;

        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                leftsum += arr[j];
            }
            for (int k = i+1; k < n; k++) {
                rightsum += arr[k];
            }
            if(leftsum==rightsum){
                index = i;
                break;
            }
            leftsum=0;
            rightsum=0;
        }
        if(index==0){
            System.out.println(-1);
        } else{
            System.out.println(index);
        }


    }
}
