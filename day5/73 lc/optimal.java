package day5.73 lc;

class Solution {
    public void setZeroes(int[][] arr) {
        int row=arr.length;
        int col=arr[0].length;
        boolean firstrow=false;
        boolean firstcol=false;
        for(int i=0;i<row;i++){
            if(arr[i][0]==0){
                firstrow=true;
                break;
            }
        }
         for(int i=0;i<col;i++){
            if(arr[0][i]==0){
                firstcol=true;
                break;
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(arr[i][0]==0 || arr[0][j]==0)arr[i][j]=0;
            }
        }
        if(firstrow){
            for(int i=0;i<row;i++){
                arr[i][0]=0;
            }
        }
        if(firstcol){
            for(int i=0;i<col;i++){
                arr[0][i]=0;
            }
        }

    
        
    }
}// first we need to check the row and col for the 0 
// then trves thro the matrx and find the 0 then updeate the top of the matrx [r][0] or [0][c]
//then check the top index and then change the row and cols for them 
// if last the top has the 0 then changem them
