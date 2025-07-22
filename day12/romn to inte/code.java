package day12.romn to inte;

class Solution {
    public int romanToInt(String s) {
        int ans=0;
      int n=s.length();
      for(int i=0;i<n;i++){
        char curr=s.charAt(i);
        if(i+1<n){
         char next=s.charAt(i+1);
         if(curr=='I' &&(next=='V'||next=='X')){
            ans-=1;
            continue;}

        else if(curr=='X' &&(next=='L'||next=='C')){
            ans-=10;
            continue;}

         else if(curr=='C' &&(next=='D'||next=='M')){
            ans-=100;
            continue;}

        }
    
         if(curr=='I')ans+=1;
        else if(curr=='V')ans+=5;
        else if(curr=='X')ans+=10;
        else if(curr=='L')ans+=50;
        else if(curr=='C')ans+=100;
        else if(curr=='D')ans+=500;
        else if(curr=='M')ans+=1000;
      }
      return ans;
        
    }
}