package leetcode;

import java.util.*;

public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
        }
        int result=Integer.MAX_VALUE;
        int count=0;
        //行分时
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                count += arr[i][j];
                if (j == m - 1) {
                    result = Math.min(result, Math.abs(sum - 2 * count));
                }
            }
        }
            count=0;
            //列分时
            for (int j = 0; j < m; j++) {
                for ( int i = 0; i < n; i++) {
                    count += arr[i][j];
                    // 遍历到列末尾时候开始统计
                    if (i == n - 1) {
                        result = Math.min(result, Math.abs(sum - 2 * count));
                    }
                }
            }

            System.out.println(result);
            sc.close();
        }
    }

