import java.util.Scanner;

public class UngDungThiDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so sinh vien");
        int student = sc.nextInt();
        int[] arr = new int[student];

        System.out.println("nhap diem");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }






        System.out.println("So luong sinh vien do: " + CheckStudent(arr));


    }

    public static int CheckStudent(int[] num) {
//        boolean result = false;
int count = 0;
        for (int i = 0; i< num.length; i++) {
            if (num[i] >= 5) {
//                result = true;
                count +=1;
            }
        }
        return count;
    }
}
