package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class test2 {

	public static void main(String[] args) 
	{
		test2 cc = new test2();
		cc.conuntChar();
	}
	
	public TreeMap<Character, Integer> conuntChar()
	{
		String InputString = "RohitRSHastriSHeetalAAshsih";
		TreeMap<Character, Integer> tmp = new TreeMap();
		LinkedList lst = new LinkedList();
		LinkedHashSet lhs = new LinkedHashSet();
		LinkedHashMap lhm = new LinkedHashMap();
		
		for(int i=0;i<InputString.length();i++)
		{
			char s = InputString.charAt(i);
			lst.add(s);
		}
		lhs.addAll(lst);
		System.out.println("My list "+lhs);
		Iterator itrSet = lhs.iterator();
		while(itrSet.hasNext())
		{
			tmp.put((Character) itrSet.next(), 1);
		}
		Set es = tmp.entrySet();
		Iterator itrmp = es.iterator();
		
		System.out.println("My Map "+tmp);
		for(int j=1;lst.size()>j;j++)
		{
			if(tmp.containsKey(lst.get(j)))
			{
				System.out.println("My key match "+tmp.containsKey(lst.get(j)));	
			}
		}
		return tmp;
	}

}
