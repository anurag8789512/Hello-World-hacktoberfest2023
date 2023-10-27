import java.util.Scanner;
public class binsearch {
    
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[],key,n;
        System.out.println("Enter size of array");
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ENter key");
        key=sc.nextInt();
        int low=0,high=arr.length-1;
        int mid=(low+high)/2;
        int c=0;
        while(low<=high){
            mid=(low+high)/2;
            if(key==arr[mid]){
                c++;
                System.out.println("Key found at index "+mid);
                break;
            }
            else if(key>arr[mid]){
                low=mid+1;
            }
            else if(key<arr[mid]){
                high=mid-1;
            }
        }
        if(c==0){
            System.out.println("Key is not present in the set!!!");
        }
        sc.close();
    }
}
