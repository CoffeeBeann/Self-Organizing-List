/********************************************************
Filename: SOL.java
Author: MIDN 2/C Coffey, MIDN 2/C Lee
Implement a Self Organizing List Based on Access Frequency
*********************************************************/ 

// Import Libraries
import java.util.List
import java.util.ArrayList

// SOL Class
public class SOL<T extends Comparable<T>> 
{
    // Private Variables
    private List<T> elements;

    // TODO
    // find a way to associate each T element to an frequency int

    // Public Constructor
    public SOL() 
    {
        elements = new ArrayList<T>();
    }

    /**
     * Method to add an element to the back of a List
     * Runtime O(1)
     */
    public void add(T data) 
    {
        elements.add(data);
    }

    /**
     * Method to retrieve an element of the List and update frequency
     * Runtime O(n)
     */
    // Arraylist might have a built in method for this so i might change this
    // later, need to figure our underlying runtime though
    public T get(T data)
    {
        for (int i = 0; i < elements.size(); i++) 
        {
            if (elements.get(i).compareTo(data) == 0)
                return element.get(i);
        }
    }

    /**
     * Method to retrieve an element given an index
     * Runtime O(1)
     */
    public T get(int index) 
    {
        return elements.get(index);
    }

    /**
     * Method to remove an element from a list and returns true if successfull
     * Runtime O(n)
     */
    // Arraylist might have a built in method for this so might change this
    // later
    public boolean remove(T data) 
    {   
        for (int i = 0; i < elements.size(); i++) 
        {
            if (elements.get(i).compareTo(data) == 0)
            {
                elements.remove(i);
                return true;
            }    
        }

        // Element not found, return false
        return false;
    }

    /**
     * Method to remove an element from a list given an index
     * Runtime O(i)
     */
    public void remove(int index) 
    {   
        elements.remove(index);
    }

    
    // Main Method for Testing
    public static void main(String[] args) {}
}
