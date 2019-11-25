package org.cts.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Branches {

	public static void main(String[] args) {
Map<Integer,String>mp=new LinkedHashMap();
mp.put(1,"java");
mp.put(2,"sql");
mp.put(3,"rpi");
mp.put(4,"selenium");
mp.put(5,"oracle");
System.out.println(mp);
Set<Entry<Integer, String>> x = mp.entrySet();

for(Entry<Integer,String>e:x)
System.out.println(e);	
	
	
	}

}
