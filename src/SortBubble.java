public class SortBubble {
    
public void sorAscendente(int [] arr){
        int conta1=0;
        int cont2 =0;
    boolean canbio=false;
    for (int i = 0; i < arr.length; i++) {
        
        canbio=false;
        for (int j = 0; j < arr.length-i-1; j++) {
            conta1++;
            if (arr[j]>arr[j+1]) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                cont2++;
                canbio=true;
            }
        }
        if (!canbio) {
            break;
        }
    }
    System.out.println("cambios " +conta1);
    System.out.println("cambios " +cont2);
    
}

public void sortDecendente(int [] arr){
        int conta1=0;
        int cont2 =0;
    boolean canbio=false;
    for (int i = 0; i < arr.length; i++) {
        
        canbio=false;
        for (int j = 0; j < arr.length-i-1; j++) {
            conta1++;
            if (arr[j]<arr[j+1]) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                cont2++;
                canbio=true;
            }
        }
        if (!canbio) {
            break;
        }
    }
    System.out.println("cambios " +conta1);
    System.out.println("cambios " +cont2);
    
}

public void PrintArray(int arr[]){
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+",");
    
    }
     System.out.print("]");
    System.out.println();
    System.out.println("_____________________");
}
    
}
