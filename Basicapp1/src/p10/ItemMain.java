package p10;

import java.util.*;
import java.util.HashSet;

public class ItemMain {

	public static void main(String[] args) {
		
		Set<Item> itemSet=new HashSet<>();
		
		Item item1=new Item(101,10,"Milk","Nandini");		//112
		Item item2=new Item(108,10,"Butter","Amul");		//118
		Item item3=new Item(103,10,"Butter","MilkyMist");	//118
		Item item4=new Item(101,10,"Milk","Nandini");		//112
		Item item5=new Item(105,10,"Milk","CountryDelight");//123
		Item item6=new Item(106,10,"Egg","DairyFarm");		//118
		
		itemSet.add(item1);
		itemSet.add(item2);
		itemSet.add(item3);
		itemSet.add(item4);
		itemSet.add(item5);
		itemSet.add(item6);
		System.out.println("--------------------------------------------");
		for (Item item : itemSet) {
			System.out.println(item);
			
		}
		System.out.println("--------------------------------------------");
	}
}
