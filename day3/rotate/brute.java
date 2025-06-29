package rotate;

class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][n-1-i]=arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=ans[i][j];
            }
        }
       
        
        
    }
}