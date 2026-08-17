import java.util.Scanner;

class pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n * m];

        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();

        int count = 0;

        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] > a[j])
                    count++;

        System.out.println(count);
    }
}