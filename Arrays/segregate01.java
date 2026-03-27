public class segregate01 {
    void segrtsoln(int arr[]){
        int n= arr.length;
        int i=0 , j=n-1;
        while(i<0){
            if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;

            }
            
            else if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
            }
        }

    }

    
}
