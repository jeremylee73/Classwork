import java.util.List;
import java.util.ArrayList;

public class MakeAllWords{
  public static List<String> makeAllWords(int k, int maxLetter){
    List<String> ans = new ArrayList<String>();
    mawH(k, maxLetter, "", ans);
    return ans;
  }

  private static void mawH(int k, int maxLetter, String partial, List<String> ans){
    if (k == 0){
      ans.add(partial);
    } else {
      for (int charNum = 0; charNum < maxLetter; charNum++){
        mawH(k-1, maxLetter, partial + (char) ('a' + charNum), ans);
      }
    }
  }

  public static void main(String[] args){
    List<String> list = makeAllWords(1, 3);
    for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
  }
}
