import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] token)
    {
        ArrayList<String> delimitersList = new ArrayList<String>();
        for(int i =0; i < token.length; i++){
            if(token[i].equals(openDel)||token[i].equals(closeDel))
                delimitersList.add(token[i]);
        }
        return delimitersList;
    }

    public boolean isBalanced(ArrayList delimiters) {
        int open = 0;
        int close = 0;
        for(int i = 0; i < delimiters.size(); i++){
            if(delimiters.get(i).equals(openDel))
                open++;
            else
                close++;
            if (close > open)
                return false;
        }
        if(open == close){
            return true;
        }
        return false;
    }

    public String getOpenDel() {
        return openDel;
    }

    public String getCloseDel() {
        return closeDel;
    }
}

