import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    /* to be implemented in part (a) */
    int count = 0;
    for(int i = 0; i < myList.size(); i++){
      String word = (String) myList.get(i);
      if(word.length() == len){
        count++;
      }
    }
    return count;
  }

  public void removeWordsOfLength(int len)
  {
    /* to be implemented in part (b) */
    int i = 0;
    while(i < myList.size()){
      String word = (String) myList.get(i);
      if(word.length() == len){
        myList.remove(i);
  }
      else{
        i++;
      }
 }
}
}
