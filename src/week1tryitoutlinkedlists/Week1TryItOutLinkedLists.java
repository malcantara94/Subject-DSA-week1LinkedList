/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1tryitoutlinkedlists;

import java.util.LinkedList;

/**
 *
 * @author Mark
 */
public class Week1TryItOutLinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Exercise 1: Create a list with the following elements - apple, banana, and cherry. 
//Write code that accomplishes the following:
//Print the list using println.
//Add orange to the beginning of the list.
//Print the list again.
//Remove an element from the list.
//Print the list again.
//Get an element at a specific index.
//Print the size of the list.
        

        LinkedList <String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("Original list: " + list);
        
        list.addFirst("orange");
        System.out.println("List after adding orange: " + list);
        
        list.remove(2);
        System.out.println("List after removing index #2: " + list);
        
        System.out.println("Get an element: " + list.get(1));
        
        int size = list.size();
        System.out.println("Size of the list: " + size);


    }
    
}
