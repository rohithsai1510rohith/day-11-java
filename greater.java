import java.util.Scanner;

class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        char[] a = s.toCharArray();

        int i = n - 2;
        while (i >= 0 && a[i] >= a[i + 1])
            i--;

        int j = n - 1;
        while (a[j] <= a[i])
            j--;

        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        for (int l = i + 1, r = n - 1; l < r; l++, r--) {
            temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }

        System.out.println(new String(a));
    }
}