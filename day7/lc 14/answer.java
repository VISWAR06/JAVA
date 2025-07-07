package day7.lc 14;

public class answer {
    public String prefix(String[] arr)
    String prefix=arr[0];
    for(int i=1;i<arr.length;i++){
        while(arr[i].indexOf(prefix)!=0){
            prefix=prefix.substring(0,prefix.length()-1);

        }
        if(prefix.length()==0)return "";
    }
    
}
