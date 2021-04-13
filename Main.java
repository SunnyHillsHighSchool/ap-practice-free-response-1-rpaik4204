import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Delimiters fun = new Delimiters( "(", ")" );		
		System.out.println( fun.getDelimitersList( new String[]{"(","x + y",")"," * 5"} ) );
		Delimiters fun2 = new Delimiters( "<q>", "</q>" );		
		System.out.println( fun2.getDelimitersList( new String[]{"<q>","yy","</q>","zz","</q>"} ) );	
			
		Delimiters fun3 = new Delimiters( "<sup>", "</sup>" );	
		ArrayList<String> stuff = new ArrayList<String>();
		stuff.add( "<sup>" );
		stuff.add( "<sup>" );
		stuff.add( "</sup>" );
		stuff.add( "<sup>" );
		stuff.add( "</sup>" );
		stuff.add( "</sup>" );			
		System.out.println( fun3.isBalanced( stuff ));
		stuff = new ArrayList<String>();
		stuff.add( "<sup>" );
		stuff.add( "</sup>" );
		stuff.add( "</sup>" );
		stuff.add( "<sup>" );			
		System.out.println( fun3.isBalanced( stuff ));
		stuff = new ArrayList<String>();
		stuff.add( "</sup>" );			
		System.out.println( fun3.isBalanced( stuff ));
		stuff = new ArrayList<String>();
		stuff.add( "<sup>" );
		stuff.add( "<sup>" );
		stuff.add( "</sup>" );			
		System.out.println( fun3.isBalanced( stuff ));
		stuff = new ArrayList<String>();
		stuff.add( "<sup>" );
		stuff.add( "<sup>" );
		stuff.add( "</sup>" );
		stuff.add( "</sup>" );			
		System.out.println( fun3.isBalanced( stuff ));
	}
}

/*
 *output

 [(, )]
[<q>, </q>, </q>]
true
false
false
false
true
*/

