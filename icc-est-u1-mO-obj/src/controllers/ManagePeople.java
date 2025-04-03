package controllers;

import models.Person;
import views.ViewConsol;

public class ManagePeople {

    private ViewConsol view;
    private Person[] people; 

    private BubbleSort bubbleSort;

    public ManagePeople(ViewConsol vista) {
        //Inicializa el BubbleSort y ViewConsole
        this.view = vista; //Instanciar la vista
        bubbleSort = new BubbleSort();

        //Inicializa el array (arreglo) de Person Objects
        this.people = new Person[5];
        this.people[0] = new Person("Alice", 30);
        this.people[1] = new Person("Bob", 25);
        this.people[2] = new Person("Charlie", 35);
        this.people[3] = new Person("David", 20);
        this.people[4] = new Person("Eve", 20);

        view.showMessaje("Clase creada \nPersonas");
        view.printPeoplelist(people);

    }
        public void sortPeopleByAge(){
            view.showMessaje("Listado por edad");
            bubbleSort.sortByAge(people);
            view.printPeoplelist(people);
        
    }
    public void sortByName(){
        view.showMessaje("Listado por nombre");
        bubbleSort.sortByName(people);
        view.printPeoplelist(people);

    }
}
