import java.util.*;
public class mergersort {
    static void merge(int arr[],int l,int mid,int r){
        int s1=mid-l+1;
        int s2=r-mid;

        int L[]=new int[s1];
        int R[]=new int[s2];

        for(int i=0;i<s1;++i){
            L[i]=arr[l+i];
        }
        for(int i=0;i<s2;++i){
            R[i]=arr[mid+1+i];
        }

        int i=0; int j=0;
        int k=l;

        while(i<s1&&j<s2){
            if(L[i]<R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<s1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<s2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    static void mergesort(int arr[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, r);
            merge(arr,l,mid,r);
        }
    }
    public static void main(String[] args) {
        int arr[]={15,5,24,8,1,3,16,10,20};

        mergesort(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
