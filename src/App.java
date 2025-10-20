public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] arr={-1,10,8,9,19};
        int[] arr1={-9,5,7,-14,-19};
        SortBubble sortDe=new SortBubble();
        sortDe.sorAscendente(arr);
        sortDe.PrintArray(arr);
        System.out.println();
        sortDe.sortDecendente(arr1);
        sortDe.PrintArray(arr1);

    }
}
