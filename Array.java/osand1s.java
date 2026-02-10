public class osand1s {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,0 ,0,1,1,0};
        int n = arr.length;


        // int noOfzeros = 0;
        // for(int ele : arr){
                    //     if(ele == 0){
        //         noOfzeros++;
        //     }
        //     }
        //     for(int i=0; i<noOfzeros;i++){
        //         arr[i] = 0;
        //         System.out.print(arr[i]+" ");
        //     }
        //     for(int i=noOfzeros;i<n;i++){
        //         arr[i] = 1;
        //         System.out.print(arr[i]+" ");
        //     }

        int i = 0, j = n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
           
            else if(arr[i]==1 && arr[j]==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
            

        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");

        }
   
    }
        
}   
        

  

