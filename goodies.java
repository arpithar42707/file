package com.city.highpeaksoftware.file1;


		import java.io.*;
		import java.util.*;

		public class goodies {
		    
		    public static void main(String []args)throws Exception
		    {
		        File file = new File("C:/users/DELL/Desktop/inp.txt");
		        ArrayList<String> al = new ArrayList<>();
		        ArrayList<Foodies> foodiesList = new ArrayList<>();
		        BufferedReader br = new BufferedReader(new FileReader(file));
		        String st;
		        while ((st = br.readLine()) != null){
		            String[] arr = st.split(":");
		            Foodies food = new Foodies(arr[0],Integer.parseInt(arr[1].trim()));
		            System.out.println(arr[0]+" :: "+arr[1]);
		            foodiesList.add(food);
		        }
		        Collections.sort(foodiesList);
		        System.out.println("Final ::"+foodiesList);
		    }


		}
		class Foodies implements Comparable<Foodies>{

		     String name;
		     int price;

		    public Foodies(String name, int price) {
		        super();
		        this.name = name;
		        this.price = price;
		    }



		    public int compareTo(Foodies compareFoodie) {
		    	 int comparePrice = ((Foodies) compareFoodie).price;

		         //ascending order
		         return this.price - comparePrice;

		         //descending order
		         //return compareQuantity - this.quantity;

		     }

		     @Override
		     public String toString() {
		         return "Foodies{" +
		                 "name='" + name + '\'' +
		                 ", price=" + price +
		                 '}';


	}

}
