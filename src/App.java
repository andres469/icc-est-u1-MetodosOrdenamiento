import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        String ESTUDIANTE = "Andres Tenesaca";
        SortInsertion sortInse = new SortInsertion();
        
        // --- 1. Arreglo de números enteros ---
        int[] numerosOriginal = {10, 0, -5, 5, 15, 2};
        int[] numerosAsc = Arrays.copyOf(numerosOriginal, numerosOriginal.length);
        int[] numerosDesc = Arrays.copyOf(numerosOriginal, numerosOriginal.length);
        
        System.out.println("1. Arreglo de números enteros");
        System.out.println("Estudiante: " + ESTUDIANTE);
        System.out.println("Método Inserción");
        System.out.println("Original");
        sortInse.printArray(numerosOriginal);
        System.out.println();
        
        sortInse.insertionSortAscendente(numerosAsc);
        System.out.println("Ordenado Ascendente");
        sortInse.printArray(numerosAsc);
        System.out.println();
        
        sortInse.insertionSortDescendente(numerosDesc);
        System.out.println("Ordenado Descendente");
        sortInse.printArray(numerosDesc);
        System.out.println();
        
        
        // --- 2. Arreglo de cadenas (nombres) ---
        String[] nombresOriginal = {"Pedro", "Ana", "Maria", "Luis", "Juan"};
        String[] nombresOrdenado = Arrays.copyOf(nombresOriginal, nombresOriginal.length);
        
        System.out.println("\n2. Arreglo de cadenas (nombres)");
        System.out.println("Estudiante: " + ESTUDIANTE);
        System.out.println("Array de Nombres Original:");
        sortInse.printArray(nombresOriginal);
        System.out.println();
        
        sortInse.sortByName(nombresOrdenado);
        System.out.println("Ordenado por Nombre:");
        sortInse.printArray(nombresOrdenado);
        System.out.println();
        
        
        // --- 3 & 4. Arreglo de objetos Persona ---
        
        Persona[] personasOriginal = new Persona[]{
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28)
        };
        
        Persona[] personasPorNombre = Arrays.copyOf(personasOriginal, personasOriginal.length);
        Persona[] personasPorEdad = Arrays.copyOf(personasOriginal, personasOriginal.length);

        
        // 3. Arreglo de personas ordenado por nombre
        System.out.println("\n3. Arreglo de personas ordenado por nombre");
        System.out.println("Estudiante: " + ESTUDIANTE);
        System.out.println("Array de Personas Original:");
        sortInse.printPersonArray(personasOriginal);

        sortInse.sortPersonByName(personasPorNombre);
        System.out.println("\nOrdenado por Nombres de Personas:");
        sortInse.printPersonArray(personasPorNombre);
        
        
        // 4. Arreglo de personas ordenado por edad
        System.out.println("\n4. Arreglo de personas ordenado por edad");
        System.out.println("Estudiante: " + ESTUDIANTE);
        System.out.println("Array de Personas Original:");
        sortInse.printPersonArray(personasOriginal);
        
        sortInse.sortPersonByAge(personasPorEdad);
        System.out.println("\nOrdenado por EDAD de Personas:");
        sortInse.printPersonArray(personasPorEdad);
    }
}
