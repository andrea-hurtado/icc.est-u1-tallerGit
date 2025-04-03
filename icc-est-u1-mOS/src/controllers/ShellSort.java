package controllers;

public class ShellSort {
    public void sort (int[] array){
        int n = array.length;
        for(int gap=n/2; gap>0; gap/=2){
            //inserción 
            for(int i = gap; i<n; i++){
                int temp = array[i];
                int j = 1;
                //Aquí se desplaza ´temp´ a su posición correcta dentro 
                while (j>= gap && array[j-gap]>temp) {
                    array[j]= array[j-gap];
                    j -= gap;
                }
                array [j] = temp;
            }
        }
    }
    public void printArray (int[] array){
        for(int num : array){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}