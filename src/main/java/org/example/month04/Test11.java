package org.example.month04;

public class Test11 {
    public static void main(String[] args) {
        // 5! 2 1!
        // 1! 2 4
        // 1 2 4 8 16 32 64 128 256  512 1024 2048 4096
        // 2500 1250 625! 312 156 78 39! 19! 9! 4 2 1!
        //
        int n = 5000;
        int ans = 1;
        while (n != 1){
            System.out.println(n % 2);
            if (n % 2 == 1) {
                ans++;
            }
            n = n/2;
        }
        System.out.println(ans);
    }
}
