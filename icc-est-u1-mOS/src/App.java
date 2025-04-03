import controllers.ShellSort;
//Shell es la mejora de la inserción 
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int [] a = {-10, 0, 4 , 6 , 2, 1 , 9 , 7, 5};
        //Instancia
        ShellSort sS = new ShellSort();
        System.out.println("Antes de ordenar: ");
        sS.printArray(a);
        sS.sort(a);
        System.out.println("Después de ordenar");
        sS.printArray(a);
    }
}
