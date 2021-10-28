package it.unical.provaIngSw;
import java.util.Comparator;
import java.util.List;

public class MyListUtil {
	
	private Comparator<Integer> decrescente(int i1, int i2) {
		
	}
	
	public List<Integer> sort(List<Integer> list, int order) { 
		if (order == 0) {
			list.sort(null);
		}
		else if (order == 1){
			list.sort(decrescente(0, 0));
		}
		return list;
     }
}
