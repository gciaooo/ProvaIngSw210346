package it.unical.provaIngSw;
import java.util.List;

public class MyListUtil {
	
	public List<Integer> sort(List<Integer> list, int order) { 
		if (order == 0) {
			list.sort(null);
		}
		else if (order == 1) {
			for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(i) > list.get(j)) {
						int temp = list.get(i);
						list.set(i, list.get(j));
						list.set(j, temp);
					}
				}
			}
		}
		return list;
     }
}
