package assignment;
import java.util.*;

public class ListToArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating Arraylist  
        List<String> mobileList = new ArrayList<>();  
        //adding String Objects to fruitsList ArrayList  
        mobileList.add("Apple");  
        mobileList.add("Samsung");  
        mobileList.add("Oneplus");  
        mobileList.add("Motorola");  
        mobileList.add("Xiaomi");  
        System.out.println("Converting ArrayList to Array" );  
        String[] item = mobileList.toArray(new String[mobileList.size()]);  
        for(String s : item){  
            System.out.println(s);  
        }  
        System.out.println("Converting Array to ArrayList" );  
        List<String>l2 = new ArrayList<>();  
        l2 =  Arrays.asList(item);  
        System.out.println(l2);  
    }  

}
