package day6.88;

class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
     
        int left = m - 1;
        int right = 0;

        while (left >= 0 && right < n) {
            if (arr1[left] > arr2[right]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

      
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
        
    }
