package oops;

import java.util.*;

public class methodHandling 
{
	
	
	public static void main(String[] args) 
	{
		methodHandling clsObj = new methodHandling();
		/*clsObj.palindromTextNum();
		clsObj.fibanacci();
		clsObj.rightTriangleStart();
		clsObj.leftTriangleStart();
		clsObj.pyramidStart();
		clsObj.switchMethod();
		clsObj.stringSplit("This is my test");
		clsObj.arrayListMethod();*/
		clsObj.hashMapMethod();
	}
	
	public void palindromTextNum()
	{
		String reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value:");
		String input =	in.nextLine();
		System.out.println("Entered value "+input);
		int size = input.length();
		for(int i=size-1;i>=0;i--)
		{
			System.out.println("Value at position "+i+input.charAt(i));
			reverse = reverse+input.charAt(i);
		}
		System.out.println("Reversed text "+reverse);
		
		if(input.equals(reverse))
		{
			System.out.println("Entered value is Palindrom");
		}
		
		else
		{
			System.out.println("Entered value is not a Palindrom");
		}
	}
	
	public void fibanacci()
	{
		int n1=1, n2=2, n3, count=10;
		
		System.out.print("Fib value:"+n1+" "+n2);
		
		for(int i=2;i<=count;++i)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}
	
	public void rightTriangleStart()
	{
		int row=5;
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public void leftTriangleStart()
	{
		int row=5, i,j;
		for(i=0;i<row;i++)
		{
			for(j=2*(row-i);j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
	
	public void pyramidStart()
	{
		int i,j,row=5;
		for(i=0;i<row;i++)
		{
			for(j=(row-i);j>=0;j--)
			{
				System.out.print(" ");	
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void switchMethod()
	{
		Scanner scannaerObj = new Scanner(System.in);
		System.out.println("Inter case size: ");
		String size = scannaerObj.nextLine();
		int y = Integer.valueOf(size);
		switch(y)
	{
	case 1:
	{
		System.out.println("Case 1");
		break;
	}
	case 2:
	{
		System.out.println("Case 2");
		break;
	}
	default:
	{
		System.out.println("Dafult Case:"+y);
	}
	}
	}
	
	public void stringSplit(String sentence)
	{
		String[] words=sentence.split(" ");
		int[] num = {1,2,3,4,5};
		for(int i=0;i<words.length;i++)
		{
			System.out.println("Dafult Case:"+words[i]);
			for(int j:num)
			{
				System.out.println("Nums: "+num[i]);
			}
		}		
	}
	
	public void arrayListMethod()
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add("Sam");
	    arrayList.add("Ram");
	    arrayList.add("Jon");
	    
	    System.out.println("List 1st value "+arrayList.get(0));
	    arrayList.set(0, "Sampath");
	    System.out.println("List 1st updated value "+arrayList.get(0));
	    System.out.println("List size "+arrayList.size());
	    arrayList.remove(2);
	    System.out.println("List size after removed "+arrayList.size());
	    
	    Iterator<String> itr = arrayList.iterator();
	    System.out.println("Iterated "+itr.next());
	    System.out.println("HasNext  "+itr.hasNext());
	}
	
	public void hashMapMethod()
	{
		HashMap<String, String> hmp = new HashMap<String, String>();
		hmp.put("1", "Passed");
		hmp.put("2", "Failed");
		hmp.put("3", "Blocked");
		hmp.put("4", "Pending");
		System.out.println("HashMap"+hmp);
		System.out.println("HashMap value of key 2 "+hmp.get("2"));
		
		HashMap hmpNG = new HashMap();
	}
	

}
