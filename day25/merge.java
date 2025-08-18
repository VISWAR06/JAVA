
public static void main(String[] args){
    int[] arr={1,5,2,5,2};
    mergesort(arr,0,arr.length-1);
}
public static void mergesort(int[] arr,int l,int r){
    if(l<r){
        int mid=l+(r-l)/2;
        mergesort(arr,l,mid);
        mergesort(arr, mid+1, r);
        merger(arr,l,mid,r);
    }
}
public static void merge(int[] arr,int l, int mid,int r){
    int i=0,j=0,k=l;
    int n1=mid-l+1;
    int n2=r-mid;
    int[]arr1=new int[n1];
    int[]arr2=new int[n2];
    for(int x=0;x<n1;x++){
        arr1[x]=arr[l+x];
    }
    for(int x=0;x<n2;x++){
        arr2[x]=arr[mid+1+x];
    }
    while(i<n1 && j<n2){
       
    }
}