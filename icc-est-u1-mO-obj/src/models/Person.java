package models;

public class Person {

    private String name;
    private int age;

    public Person() {

        //Constructur vacio porque no recibe argumentos 
    } //Sobrecarja de métodos por eso no sale error
    public Person(String name, int age){
        //Constructor con argumentos
        this.name = name; //referencia a la clase global
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override //Sobreescribir
    public String toString() {
        
        return "Person [name=" + name +", age=" + age + "]";
    }
    
}
