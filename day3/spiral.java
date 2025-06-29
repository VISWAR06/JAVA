class Spiral {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer>ans=new ArrayList<>();
        int n=arr.length;
        int m=arr[0].length;
        int left=0,right=m-1,top=0,bottom=n-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                ans.add(arr[top][i]);

            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }return ans;
        
    }
}