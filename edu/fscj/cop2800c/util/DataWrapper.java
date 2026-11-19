//DataWrapper.java
//Liliana Torrres
// Thrusday, November 19th, 2026
// Generic class for wrapping data objects

package edu.fscj.cop2800c.util;

import java.util.List;

public class DataWrapper<T> {
   private T value;
   
   //Default constructor
   public DataWrapper() {
      this.value = null;
   }
   
   //Constructor
   public DataWrapper(T value) {
      this.value = value;
   }
   
   //Get method
   public T getValue() {
      return value;
   }
   
   //Generic method to display a list
   public static <T> void displayList(List<DataWrapper<T>> list) {
      for (DataWrapper<T> element : list) {
         //getValue drills down to the object's toString
         System.out.println(element.getValue());
      }
   }
}