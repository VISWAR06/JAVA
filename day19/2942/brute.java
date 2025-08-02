class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>list=new ArrayList<>();
         for(int i=0;i<words.length;i++){
            char[] arr=words[i].toCharArray();
            for(int j=0;j<arr.length;j++){
                if(arr[j]==x){
                    list.add(i);
                    break;
                }
            }
         }
        return list;
        
    }
}