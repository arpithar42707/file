package com.city.highpeaksoftware.file1;


		import java.io.*;
		import java.util.*;

		public class goodies {
			 public static void distGoodies(ArrayList<Foodies> foodiesList, int n) throws IOException{
			        int startIndex=0;
			        int currentDiff= Integer.MAX_VALUE;
			        ArrayList<Foodies> finalFoodiesList = new ArrayList<>();
			        int index = 0;
			        while(index+n<foodiesList.size()){
			            int minPrice = foodiesList.get(index+n).price - foodiesList.get(index).price;
			            if(currentDiff>minPrice) {
			                currentDiff = minPrice;
			                startIndex = index;
			            }
			            index++;
			        }
			        while(startIndex<startIndex+n&&startIndex+n<foodiesList.size()){
			            finalFoodiesList.add(foodiesList.get(startIndex++));
			        }
			        System.out.println("finalFoodiesList :: "+finalFoodiesList);
			        FileWriter writer = new FileWriter("C:/users/DELL/Desktop/output.txt");
			        for(Foodies obj: finalFoodiesList) {
			            writer.write(obj.name +": "+ obj.price + System.lineSeparator());
			        }
			        writer.close();
			 }
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
		     public static void distGoodies(ArrayList<Foodies> foodiesList, int n) throws IOException{
		    	    int startIndex=0;
		    	    int currentDiff= Integer.MAX_VALUE;
		    	    ArrayList<Foodies> finalFoodiesList = new ArrayList<>();
		    	    int index = 0;
		    	    while(index+n<foodiesList.size()){
		    	        int minPrice = foodiesList.get(index+n).price - foodiesList.get(index).price;
		    	        if(currentDiff>minPrice) {
		    	            currentDiff = minPrice;
		    	            startIndex = index;
		    	        }
		    	        index++;
		    	    }
		    	    while(startIndex<startIndex+n&&startIndex+n<foodiesList.size()){
		    	        finalFoodiesList.add(foodiesList.get(startIndex++));
		    	    }
		    	    System.out.println("finalFoodiesList :: "+finalFoodiesList);
		    	    FileWriter writer = new FileWriter("C:/users/DELL/Desktop/output.txt");
		    	    for(Foodies obj: finalFoodiesList) {
		    	        writer.write(obj.name +": "+ obj.price + System.lineSeparator());
		    	    }
		    	    writer.close();
		    	}

}
