# PracticeFR1
Add your code from the Practice Free Response 1 to test it.

Many encoded strings contain delimiters. A delimiter is a non-empty string that acts as a boundary between
different parts of a larger string. The delimiters involved in this question occur in pairs that must be balanced,
with each pair having an open delimiter and a close delimiter. There will be only one type of delimiter for each
string. The following are examples of delimiters.

Example 1

Expressions in mathematics use open parentheses "(" and close parentheses ")" as delimiters. For each
open parenthesis, there must be a matching close parenthesis.
(x + y) * 5 is a valid mathematical expression.
(x + (y)
is NOT a valid mathematical expression because there are more open delimiters
than close delimiters.

Example 2

HTML uses <B> and </B> as delimiters. For each open delimiter <B>, there must be a matching close
delimiter </B>.
<B> Make this text bold </B>
is valid HTML.
<B> Make this text bold </UB>
is NOT valid HTML because there is one open
delimiter and no matching close delimiter.


In this question, you will write two methods in the following Delimiters class.

public class Delimiters
{
/** The open and close delimiters. */

   private String openDel;
   private String closeDel;
   
   /** Constructs a Delimiters object where open is the open delimiter and close is the
   close delimiter.
   Precondition: open and close are non-empty strings.*/

public Delimiters (String open, String close)
{
   openDel = open;
   closeDel = close;
}

/** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */

public ArrayList<String> getDelimitersList (String[] tokens)
  
{ /* to be implemented in part (a) */ }

/** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
Precondition: delimiters contains only valid open and close delimiters.
*/

public boolean isBalanced (ArrayList<String> delimiters)
  
{ /* to be implemented in part (b) */ }

// There may be instance variables, constructors, and methods that are not shown.
}
