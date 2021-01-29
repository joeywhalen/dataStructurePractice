package dataStructurePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
        String[] my_array = {"Aaron","Joan","Layla"};
        System.out.printf("At index 1 is &s\n", my_array[1]);
        //returns "Joan"
        int size = my_array.length;
        System.out.println(size);
        //returns the length or size of the array (3)
        
        for(String nombre : my_array) {
        	System.out.printf("Name is: %s,\n", nombre);
        }
		ArrayList<String> myNameList = new ArrayList<>();
		myNameList.add("John");
		myNameList.add("Heather");
		myNameList.add("Joey");
		
		myNameList.get(1);
		//returns "Heather"
		
		for(String name : myNameList) {
			System.out.printf("%s\n", name);
		}
		
		String[] foods = {"pop tarts", "asian food", "salad", "pizza"};
		String allFoods = Arrays.toString(foods);
		System.out.println(allFoods);
		
	}

}
