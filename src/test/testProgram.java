package test;
import java.io.*;
import java.util.*;

public class testProgram 
{
	    public static Map<String,List<Integer>> sortLogs(String[][] logs1)
	    {
	    Map<String,List<Integer>> map= new HashMap<String,List<Integer>> ();
	    
	    for(String[] str:logs1)
	    {
	      String usr= str[1];
	      System.out.println(usr);
	      List<Integer> list=null;
	      if(!map.containsKey(usr))
	      {
	        //int list[] = new int[2];
	        map.put(usr,list);
	        list.add(Integer.parseInt(str[0]));
	        list.add(Integer.parseInt(str[0]));
	      }
	      else
	      {
	        list=map.get(usr);
	        int temp=Integer.parseInt(str[0]);
	        
	        if(list.get(0)>temp)
	        {
	        	int user = list.get(0);
	        	user=temp;
	        }
	        else if(list.get(1) <temp) 
	        {
	           list.add(1,temp);
	        }
	        map.put(usr,list);
	      }
	    } 
	    return map;
	  }
	    
	  public static void main(String[] argv) {

	    String[][] logs1 = new String[][] {
	        { "58523", "user_1", "resource_1" },
	        { "62314", "user_2", "resource_2" },
	        { "54001", "user_1", "resource_3" },
	        { "200", "user_6", "resource_5" },
	        { "215", "user_6", "resource_4" },
	        { "54060", "user_2", "resource_3" },
	        { "53760", "user_3", "resource_3" },
	        { "58522", "user_22", "resource_1" },
	        { "53651", "user_5", "resource_3" },
	        { "2", "user_6", "resource_1" },
	        { "100", "user_6", "resource_6" },
	        { "400", "user_7", "resource_2" },
	        { "100", "user_8", "resource_6" },
	        {"54359", "user_1", "resource_3"},
	    };

	    String[][] logs2 = new String[][] {
	        {"300", "user_1", "resource_3"},
	        {"599", "user_1", "resource_3"},
	        {"900", "user_1", "resource_3"},
	        {"1199", "user_1", "resource_3"},
	        {"1200", "user_1", "resource_3"},
	        {"1201", "user_1", "resource_3"},
	        {"1202", "user_1", "resource_3"}
	    };

	    String[][] logs3 = new String[][] {
	        {"300", "user_10", "resource_5"}
	    };

	    Map<String,List<Integer>> map= sortLogs(logs1);
	   System.out.print(map.toString());
	    for(Map.Entry<String,List<Integer>> m :map.entrySet()){
	      System.out.println(m.getKey() +" "+m.getValue().get(0)+" "+m.getValue().get(1));
	    }
	  }
	}
