class Solution {
    public int maximumWealth(int[][] arrounts) {
        int sum=0;
        int n=arrounts.length;
        int inner=arrounts[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<inner;j++){
                sum+=arrounts[i][j];
            }
            max=Math.max(sum,max);

        }
        return max;
    }
}