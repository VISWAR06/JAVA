package day17.top150;

public class Solution {
    public String reverseVowels(String st) {
        int s = 0, e = st.length() - 1;
        char[] arr = st.toCharArray(); // Strings are immutable, so we convert to char array

        while (s <= e) {
            if (
                ((arr[s] == 'a' || arr[s] == 'e' || arr[s] == 'i' || arr[s] == 'o' || arr[s] == 'u') ||
                (arr[s] == 'A' || arr[s] == 'E' || arr[s] == 'I' || arr[s] == 'O' || arr[s] == 'U')) &&
                ((arr[e] == 'a' || arr[e] == 'e' || arr[e] == 'i' || arr[e] == 'o' || arr[e] == 'u') ||
                (arr[e] == 'A' || arr[e] == 'E' || arr[e] == 'I' || arr[e] == 'O' || arr[e] == 'U'))
            ) {
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            } else if (
                !(arr[s] == 'a' || arr[s] == 'e' || arr[s] == 'i' || arr[s] == 'o' || arr[s] == 'u' ||
                  arr[s] == 'A' || arr[s] == 'E' || arr[s] == 'I' || arr[s] == 'O' || arr[s] == 'U')
            ) {
                s++;
            } else {
                e--;
            }
        }

        return new String(arr);
    }
}
 {
    
}
