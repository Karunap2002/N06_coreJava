package org.tnsif.collection.map;
import java.util.*;
import java.util.Map.Entry;
public class hashMapDemo {

	public static void main(String[] args) {
		
        HashMap<String, String> person=new HashMap<String,String>();
				person.put("karunap@gmail.com", "Karuna");
				person.put("sakshir@gmail.com", "Sakshi");
				person.put("Snehal233@gmail.com", "Snehal");
				person.put("kunal34@gmail.com", "Kunal");
				person.put("Snehal233@gmail.com", "Snehal darade");
				System.out.println(person);
				
				person.put("abc23@gmail.com",null);
				System.out.println(person.containsKey("karunap2002gmail.com"));
				System.out.println(person.containsValue("Sakshi"));
				
				
					
				System.out.println("-----------------------------------------------");
				System.out.println(person.get("kunal1233@gmail.com"));
				System.out.println("-----------------------------------------------");
				
				Set<Entry<String,String>> dict=person.entrySet();
				System.out.println(dict);
				System.out.println("-----------------------------------------------");
				
				Iterator<Entry<String,String>>it=dict.iterator();
				while(it.hasNext())
				{
					Entry<String,String> rec=it.next();
					System.out.println(rec.getKey()+" : "+rec.getValue());
				}
				System.out.println("-----------------------------------------------");

			}

		}


	
