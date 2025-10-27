public class SortInsertion {

    public void insertionSortAscendente(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void insertionSortDescendente(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) { 
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    public void sortByName(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void sortPersonByName(Persona[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Persona key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getNombre().compareTo(key.getNombre()) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void sortPersonByAge(Persona[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Persona key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getEdad() > key.getEdad()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    
    public void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    
    public void printPersonArray(Persona[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Imprime manualmente la información de la persona
            System.out.println("Nombre: " + arr[i].getNombre() + ", Edad: " + arr[i].getEdad());
        }
    }

}
