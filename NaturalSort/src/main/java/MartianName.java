
public class MartianName implements Comparable<MartianName> {
	
	public String name;
	
	public MartianName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(MartianName o) {
		String otherName = o.name;
		
		return name.compareToIgnoreCase(otherName);
	}

}
