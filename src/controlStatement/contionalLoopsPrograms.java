package controlStatement;

public class contionalLoopsPrograms {

	public static void main(String[] args) 
	{
		System.out.println("Start");
		/*
		forDec();
		String input="JAVA IS FUN"; String output=replaceChar(input); System.out.println(output);
		replaceCharinString();
		replaceStringDoWhile();
		*/
		breakContinueKeyWord();
		System.out.println("End");
	}
	
	//Print 50, 45, 40, 35
	public static void forDec()
	{
		for(int i=50; i>5; i=i-5)
		{
			System.out.println("Value "+i);
		}
		System.out.println("Program to decrease ");
	}

	//Replace char by appending
	public static String replaceChar(String inputText)
	{
		String output =""; 		int i=0;
		String text = "test";
		System.out.println(text+'a');//texta - Add char but source not modified
		System.out.println(text+='b');//textb - Add char but source modified
		//System.out.println(text=+'c'); applicable only for int 
		System.out.println(text+=+'d');//textb100
		while(i<inputText.length())
		{
			//System.out.println("size: "+inputText.length());
			//System.out.println(inputText.charAt(i));
			if(inputText.charAt(i)=='A'||inputText.charAt(i)=='E'|inputText.charAt(i)=='I'||inputText.charAt(i)=='O'||inputText.charAt(i)=='U')
			{
				output+='X';
				
				//add
			}
			else
			{
				output+=inputText.charAt(i);
				//Append text
			}
			i++;
		}
		return output;
	}
	
	//Replace char using replace string function
	public static void replaceCharinString()
	{
		String input = "JAVA IS THE FUN";
		String output = "";
		output= input.replace('A', 'X');
		output= output.replace('E', 'X');
		output= output.replace('I', 'X');
		output= output.replace('O', 'X');
		output= output.replace('U', 'X');
		System.out.println(output);
	}
	
	//Reverse string using do while
	public static void replaceStringDoWhile()
	{
		String input = "JAVA";
		String output = "";
		System.out.println("size: "+input.length());
		int i=input.length()-1;
		do 
		{
			output+=input.charAt(i);
			i--;
		}	
		while(i>=0);
		System.out.println(output);
	}
	
	//continue and break
	public static void breakContinueKeyWord()
	{
		for(int i=0;i<7;i++)
		{
			if(i==2)
			{
				System.out.println("Before break");
				break;
				//After break it goes out side for loop
			}
			if(i==1)
			{
				System.out.println("Before Continue");
				continue;
				//After continue goes back to 
			}
		}
	}
}
