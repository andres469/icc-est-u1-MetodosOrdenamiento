public class SortBubble {
    public SortBubble(){
        System.out.println("Se creo mi clase SortBublle");
    }
    public void SortBubble(int[] numeros){
        int contador=0;
        int numeroscanbio=0;
        String titulo="Metodo burbuja";
         System.out.println("CANTIDAD DE NUMEROS ES "+ numeros.length);
         int numerosSize=numeros.length;
         for (int i = 0; i < numeros.length; i++) {
             for (int j = i+1; j < numeros.length; j++) {
                contador++;
                 if (numeros[i]>numeros[j]) {
                    
                    int temp=numeros[j];
                    numeros[j]=numeros[i];
                    numeros[i]=temp;
                    numeroscanbio++;
                 }
             }
         }
         System.out.println("Total de iteraciones "+contador);
         System.out.println("Total de numeros cambiados "+numeroscanbio);
    }
    public void sortBubbleAvz(int[] numeros){
        int contCambios=0;
        int contPreeguntas=0;
        boolean canbio=false;
        for (int i = 0; i < numeros.length-1; i++) {
            canbio=false;
            for (int j = 0; j < numeros.length-i-1; j++) {
                contPreeguntas++;
                if (numeros[j]<numeros[j+1]) {
                    int temp=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=temp;
                    contCambios++;
                    canbio=true;
                }
            }
            if (!canbio) {
                break;
            }
        }
        System.out.println("Total de iteraciones "+contCambios);
         System.out.println("Total de numeros cambiados "+contPreeguntas);

    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
          
            System.out.print(arr[i]);       
            if (i<arr.length-1) {
                System.out.print(",");
                
            }
        }
    }
}
