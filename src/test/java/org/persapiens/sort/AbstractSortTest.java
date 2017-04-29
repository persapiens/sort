package org.persapiens.sort;

import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author marcelo
 */
public abstract class AbstractSortTest <T> {
    ArrayBuilder<T> arrayBuilder;
    
	Sort sort;

    abstract Sort createSort();
	abstract ArrayBuilder<T> createArrayBuilder();

    @BeforeClass
    protected void init() {
        sort = createSort();
		arrayBuilder = createArrayBuilder();
    }    
	
	@Test
	public void emptyArray () {
		assertThat(sort.sort(arrayBuilder.emptyArray()))
			.isEqualTo(arrayBuilder.emptyArray());
	}
	
	@Test
	public void singleArray () {
		assertThat(sort.sort(arrayBuilder.singleArray()))
			.isEqualTo(arrayBuilder.singleArray());
	}	
	
	@Test
	public void twoElementsAscendingSorted () {
		assertThat(sort.sort(arrayBuilder.twoElementsAscendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.twoElementsAscendingSorted()
				: arrayBuilder.twoElementsDescendingSorted());
	}	
	
	@Test
	public void twoElementsDescendingSorted () {
		assertThat(sort.sort(arrayBuilder.twoElementsDescendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.twoElementsAscendingSorted()
				: arrayBuilder.twoElementsDescendingSorted());
	}	
	
	@Test
	public void threeElementsAscendingSorted () {
		assertThat(sort.sort(arrayBuilder.threeElementsAscendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.threeElementsAscendingSorted()
				: arrayBuilder.threeElementsDescendingSorted());
	}	
	
	@Test
	public void threeElements132 () {
		assertThat(sort.sort(arrayBuilder.threeElements132()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.threeElementsAscendingSorted()
				: arrayBuilder.threeElementsDescendingSorted());
	}	
	
	@Test
	public void threeElements213 () {
		assertThat(sort.sort(arrayBuilder.threeElements213()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.threeElementsAscendingSorted()
				: arrayBuilder.threeElementsDescendingSorted());
	}	
	
	@Test
	public void threeElements231 () {
		assertThat(sort.sort(arrayBuilder.threeElements231()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.threeElementsAscendingSorted()
				: arrayBuilder.threeElementsDescendingSorted());
	}	
	
	@Test
	public void threeElements312 () {
		assertThat(sort.sort(arrayBuilder.threeElements312()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.threeElementsAscendingSorted()
				: arrayBuilder.threeElementsDescendingSorted());
	}	
	
	@Test
	public void threeElementsDescendingSorted () {
		assertThat(sort.sort(arrayBuilder.threeElementsDescendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.threeElementsAscendingSorted()
				: arrayBuilder.threeElementsDescendingSorted());
    }
	
	@Test
	public void fourElementsAscendingSorted () {
		assertThat(sort.sort(arrayBuilder.fourElementsAscendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.fourElementsAscendingSorted()
				: arrayBuilder.fourElementsDescendingSorted());
	}	
	
	@Test
	public void fourElements1243 () {
		assertThat(sort.sort(arrayBuilder.fourElements1243()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.fourElementsAscendingSorted()
				: arrayBuilder.fourElementsDescendingSorted());
	}	
	
	@Test
	public void fourElements1342 () {
		assertThat(sort.sort(arrayBuilder.fourElements1342()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.fourElementsAscendingSorted()
				: arrayBuilder.fourElementsDescendingSorted());
	}	
	
	@Test
	public void fourElements4321 () {
		assertThat(sort.sort(arrayBuilder.fourElementsDescendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.fourElementsAscendingSorted()
				: arrayBuilder.fourElementsDescendingSorted());
	}	
	
	@Test
	public void tenElementsAscendingSorted () {
		assertThat(sort.sort(arrayBuilder.tenElementsAscendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.tenElementsAscendingSorted()
				: arrayBuilder.tenElementsDescendingSorted());
	}	
	
	@Test
	public void tenElementsDescendingSorted () {
		assertThat(sort.sort(arrayBuilder.tenElementsDescendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.tenElementsAscendingSorted()
				: arrayBuilder.tenElementsDescendingSorted());
	}	
	
	@Test
	public void sixElementsWith3Digits () {
		assertThat(sort.sort(arrayBuilder.sixElementsWith3Digits()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.sixElementsWith3DigitsSortedAscending()
				: arrayBuilder.sixElementsWith3DigitsSortedDescending());
	}	
	
	@Test
	public void sixElementsWith3DigitsSortedDescending () {
		assertThat(sort.sort(arrayBuilder.sixElementsWith3DigitsSortedDescending()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.sixElementsWith3DigitsSortedAscending()
				: arrayBuilder.sixElementsWith3DigitsSortedDescending());
	}	
	
	@Test
	public void sixElementsWith3DigitsSortedAscending () {
		assertThat(sort.sort(arrayBuilder.sixElementsWith3DigitsSortedAscending()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.sixElementsWith3DigitsSortedAscending()
				: arrayBuilder.sixElementsWith3DigitsSortedDescending());
	}	
    
}
