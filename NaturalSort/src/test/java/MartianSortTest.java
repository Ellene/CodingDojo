import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class MartianSortTest {

	private MartianSort martianSort = new MartianSort();
	
	@Test
	public void should_consider_alpha2_lower_than_alpha2a() {
		// Given
		MartianName alpha2 = new MartianName("alpha2");
		MartianName alpha2a = new MartianName("alpha2a");
		
		List<MartianName> nameList = new ArrayList<>();
		nameList.add(alpha2a);
		nameList.add(alpha2);
		
		// When
		martianSort.sort(nameList);
		
		// Then
		Assertions.assertThat(nameList).containsExactly(alpha2, alpha2a);
		
	}
	
	

	@Test
	public void should_consider_alpha2a_lower_than_alpha2a900() {
		// Given
		MartianName alpha2 = new MartianName("alpha2");
		MartianName alpha2a900 = new MartianName("alpha2a900");
		
		List<MartianName> nameList = new ArrayList<>();
		nameList.add(alpha2);
		nameList.add(alpha2a900);
		
		// When
		martianSort.sort(nameList);
		
		// Then
		Assertions.assertThat(nameList).containsExactly(alpha2, alpha2a900);
	}
	
	@Test
	public void should_consider_alpha2a_lower_than_alpha2a900_and_alpha2a_higher_alpha1() {
		// Given
		MartianName alpha2 = new MartianName("alpha2");
		MartianName alpha1 = new MartianName("alpha1");
		MartianName alpha2a900 = new MartianName("alpha2a900");
		
		List<MartianName> nameList = new ArrayList<>();
		nameList.add(alpha2);
		nameList.add(alpha2a900);
		nameList.add(alpha1);
		
		// When
		martianSort.sort(nameList);
		
		// Then
		Assertions.assertThat(nameList).containsExactly(alpha1, alpha2, alpha2a900);
	}
	
	@Test

	public void should_consider_alpha1_lower_than_alpha2a900() {
		// Given
		MartianName alpha2 = new MartianName("alpha1");
		MartianName alpha2a900 = new MartianName("alpha2a900");
		
		List<MartianName> nameList = new ArrayList<>();
		nameList.add(alpha2);
		nameList.add(alpha2a900);
		
		// When
		martianSort.sort(nameList);
		
		// Then
		Assertions.assertThat(nameList).containsExactly(alpha2, alpha2a900);
		
	}

	
}
