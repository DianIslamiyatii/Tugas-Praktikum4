package Praktikum_4;
public class No3 {
    public static void Selectionsort(int[] A) {
        int smallIndex;
        int pass, j, n = A.length;
        int temp;
        
        //index of smallest element in the sublist
        for (pass = 0; pass < n-1; pass++) {     //pass=0; 0<4-T
            smallIndex = pass;                   //0
            for (j = pass + 1; j < n; j++) {     //j=1; 1<5 /j=2; 2<5
                if (A[j] < A[smallIndex]) {     //A[1]<A[0]-6<10-T /A[2]<A[1]-8<6-F
                    smallIndex = j; //1 /2
                }
            }
            //tukar nilai terkecil dengan array[pas]
            temp = A[pass]; //
            A[pass] = A[smallIndex];
            A[smallIndex]= temp;
        }
    }
    
    public static void tampil(int data[]) {
        for(int i = 0; i <data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main (String[] args) {
        int A[] = {25, 7, 9, 13, 3} ;
        No3.tampil(A);
        No3.Selectionsort(A);
        No3.tampil(A);
        System.out.println("Dian Islamiyati");
    }
    
}


