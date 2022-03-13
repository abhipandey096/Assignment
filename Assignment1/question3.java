package Assignment1;

import java.util.Scanner;
class question3 {
    public static int[] copyOf(int[] array,int arr_size){
        int new_array[]=new int[arr_size];
        for(int k=0;k<arr_size;k++){
            new_array[k]=array[k];
        }
        return new_array;
    }
    public static void main(String[] args) {
        int arr_size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array a:");
		arr_size=sc.nextInt();
        int a[]=new int[arr_size];
        
        System.out.println("Enter elements in array-");
        for(int i=0;i<arr_size;i++){
            a[i]=sc.nextInt();
        }
        int[] new_array=copyOf(a,arr_size);
        System.out.println("New_array elements are--");
        for(int j=0;j<arr_size;j++){
            System.out.print(new_array[j]+"\t"); 
        }
    }
}
