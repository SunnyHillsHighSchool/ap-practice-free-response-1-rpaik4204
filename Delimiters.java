import java.util.*;

public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	public ArrayList<String> getDelimitersList(String[] tokens)
	{
    ArrayList<String> delimiters = new ArrayList<String>();
    for(String str : tokens)
      if(str.equals(openDel) || str.equals(closeDel))
        delimiters.add(str);

		return delimiters;
	}

	public boolean isBalanced(ArrayList<String> delimiters)
	{ 
    int openNum = 0, closedNum = 0;
    for(String str : delimiters)
    {
      if(str.equals(openDel))
        openNum++;

      if(str.equals(closeDel))
        closedNum++;

      if(closedNum > openNum)
        return false;
    }
    return openNum == closedNum;
	}
}