package views;
import models.Person;

public class ViewConsol {
    /**
     * Muestra un mensaje en la consola.
     * 
     * @param messaje el mensaje se mostrará
    */
    public void showMessaje(String messaje) {
        System.out.println(messaje.toUpperCase());
    }

/**
     * Imprime la lista de personas en la consola
     * 
     * @param people un arreglo de objetos Person que se imprimirán.
     *               Person se imprimirá utilizando su método toString
    */
    public void printPeoplelist(Person[] people){
        for (Person person : people) {
            System.out.println(person);
         
        }
    }
}
