public class App {
    public static void main(String[] args) throws Exception {
        
         int [] numeros={5,7,0,-1,10,8};
         System.out.println("Estudiante: Andres Tenesaca");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("posiscion ="+i+"="+numeros[i]);
           
        }
       
        SortBubble sortBubble=new SortBubble();
        SortSeleccion sortSeleccion=new SortSeleccion();
        // sortBubble.printArray(numeros);
        // System.out.println();
        // // sortBubble.SortBubble(numeros); 
        // // sortBubble.printArray(numeros); 
        // sortBubble.sortBubbleAvz(numeros);
        // sortBubble.printArray(numeros);
        sortSeleccion.printArray(numeros);
        System.out.println();
        sortSeleccion.sortAscendente(numeros);
        sortSeleccion.printArray(numeros);
        System.out.println();
        System.out.println("Desendente");
        sortSeleccion.sortDecendente(numeros);
        sortSeleccion.printArray(numeros);


        
    
    }
    // public static void bubbleSort(int[] numeros) {
    //    String titulo="Metodo burbuja";
    //      System.out.println("CANTIDAD DE NUMEROS ES "+ numeros.length);
    //      int numerosSize=numeros.length;
    //      for (int i = 0; i < numeros.length; i++) {
    //          for (int j = i+1; j < numeros.length; j++) {
    //              if (numeros[i]>numeros[j]) {
    //                 int temp=numeros[j];
    //                 numeros[j]=numeros[i];
    //                 numeros[i]=temp;
    //              }
    //          }
    //      } 
    //     //   for (int i = 0; i < numeros.length; i++) {
    //     //     System.out.println("ordenado " +"posiscion ="+i+"="+numeros[i]);
           
    //     // }
       
        
    // }
    // public static void printArray(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
          
    //         System.out.print(arr[i]);       
    //         if (i<arr.length-1) {
    //             System.out.print(",");
                
    //         }
    //     }
    // }
}
