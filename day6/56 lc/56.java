package day6.56 lc;

class Solution {
    public int[][] merge(int[][] arr) {
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<row-i-1;j++){
                if(arr[j][0] > arr[j+1][0]){
                    int temp[]=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        List<int[]>list=new ArrayList<>();
        int[] current = arr[0];
        for(int i = 1;i < row; i++){
            if(arr[i][0] <= current[1]){
               current[1] = Math.max(arr[i][1],current[1]);
            }
            else{
                list.add(current);
                current=arr[i];
            }
        }
        list.add(current);
        return list.toArray(new int[list.size()][]);
      
    }
}