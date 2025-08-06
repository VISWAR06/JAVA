// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        Set<Integer>set=new TreeSet<>();
        for(int num:arr)set.add(num);
        for(int i=A;i<=B;i++){
            if(!set.contains(i))return false;
        }
        return true;
        
    }
}
