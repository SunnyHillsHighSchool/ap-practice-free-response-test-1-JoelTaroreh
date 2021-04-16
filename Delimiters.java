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
    ArrayList<String> delims = new ArrayList<String>();
    for(int i = 0; i < tokens.length; i++) {
      if(tokens[i].equals(openDel) || tokens[i].equals(closeDel) ) {
        delims.add(tokens[i]);
      }
    } 
		return delims;
	}

	public boolean isBalanced(ArrayList<String> delimiters)
	{ 
    int count = 0;
    for(int i = 0; i < delimiters.size(); i++) {
      if(delimiters.get(i).equals(openDel)) {
        count++;
      }
      if(delimiters.get(i).equals(closeDel)) {
        count--;
      }
      if(count < 0) {
        return false;
      }
    }
    if(count == 0) {
      return true;
    }
    else {
      return false;
    }
	}
}