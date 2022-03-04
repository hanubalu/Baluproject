package com.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Map
				//HashMap
				System.out.println("HashMap\n");
				HashMap<Integer,String> var = new HashMap<Integer, String>();
				var.put(3,"ram");
				var.put(1,"bheem");
				var.put(2,"gam");
				for(Entry<Integer, String> var1 : var.entrySet()) {
					System.out.println(var1.getKey()+" "+var1.getValue());
				}
				//HashTable
				System.out.println("\nHashTable\n");
				Hashtable<Integer,String> HashT = new Hashtable<Integer, String>();
				HashT.put(8,"balu");
				HashT.put(2,"suresh");
				HashT.put(6,"kgf");
				for(Entry<Integer,String> HashT1 : HashT.entrySet()) {
					System.out.println(HashT1.getKey()+" "+HashT1.getValue());
				}
				//TreeMap
				System.out.println("\nTreeMap\n");
				TreeMap<Integer,String> Tmap = new TreeMap<Integer, String>();
				Tmap.put(9,"shiva");
				Tmap.put(6,"kumari");
				Tmap.put(5,"jai");
				for(Entry<Integer,String> Tmap1 : Tmap.entrySet()) {
					System.out.println(Tmap1.getKey()+" "+Tmap1.getValue());
				}
			}

		}

