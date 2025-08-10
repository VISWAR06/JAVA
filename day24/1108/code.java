class Solution {
    public String defangIPaddr(String address) {
        String re="[.]";
       return address.replace(".",re);
       
        
    }
}