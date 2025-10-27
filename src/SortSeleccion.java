public class SortSeleccion {

    public SortSeleccion() {
        
    }
     public void sortAscendente(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int indiceMenor=i;
            for (int j = i+1; j < arr.length; j++) {

                if (arr[j]<arr[indiceMenor]) {
                    indiceMenor=j;
                }
                
            }
            if (i!=indiceMenor) {
                int temp=arr[indiceMenor];
                arr[indiceMenor]=arr[i];
                arr[i]=temp;
            }

        }
     }

        public void sortDecendente(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int indiceMenor=i;
            for (int j = i+1; j < arr.length; j++) {

                if (arr[j]>arr[indiceMenor]) {
                    indiceMenor=j;
                }
                
            }
            if (i!=indiceMenor) {
                int temp=arr[indiceMenor];
                arr[indiceMenor]=arr[i];
                arr[i]=temp;
            }

        }
     }
      public void printArray(int[] arr) {
        System.out.println("Array Seleccion ");
        for (int i = 0; i < arr.length; i++) {
          
            System.out.print(arr[i]);       
            if (i<arr.length-1) {
                System.out.print(",");
                
            }
        }
    }
    public void printPersonArray(Persona[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getNombre() + ":" + arr[i].getEdad());
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
