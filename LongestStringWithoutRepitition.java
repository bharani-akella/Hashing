package interview;
import java.util.HashMap;
public class LongestStringWithoutRepitition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabcdabcdef";
HashMap<Character, Integer> h=new HashMap<Character,Integer>();
int max=0;
for(int i=0,j=0;i<s.length();i++){
	if(h.containsKey(s.charAt(i))){
		j=Math.max(j, h.get(s.charAt(i))+1);
	}
	h.put(s.charAt(i), i);
	max=Math.max(max, i-j+1);
}
System.out.println(max);
	}

}
