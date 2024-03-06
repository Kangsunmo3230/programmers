package org.example.sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 1517번 버블소트 (Java)
 * <p>
 * N개의 수로 이루어진 수열 A[1],A[2], ... A[N] 이 있다.
 * 버블 소트를 수행할 떄, Swap이 총 몇 번 발생하는지 알아내는 프로그램을 작성하시오.
 * 버블 소트는 서로 인접해 있는 두수를 바꿔 가며 정렬하는 방법이다.
 * 예를 들어 수열이 3,2,1 이었다고 하자, 이 경우에는 인접해 있는 3, 2 가 바뀌어야 하므로 2 3 1 다음에는 3 1  21 3
 */
public class question3 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int temp;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
