import java.util.List;


public class MartianSort {

	public void sort(List<MartianName> nameList) {
		
		for (int i=1;i<nameList.size();i++) {
			int j = i;
			
			while(j > 0 && nameList.get(j).compareTo(nameList.get(j-1)) < 0) {
				MartianName buffer = nameList.get(j);
				nameList.set(j, nameList.get(j-1));
				nameList.set(j-1, buffer);
				j--;
			}
			
		}
	}
	
	
}
