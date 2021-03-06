package org.persapiens.algorithms.sort;

import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author marcelo
 */
@Test
public abstract class AbstractSortTest <B extends Comparable, T extends Comparable> {
    ArrayBuilder<B,T> arrayBuilder;
    
	Sort sort;

    abstract Sort createSort();
	abstract ArrayBuilder<B,T> createArrayBuilder();

    @BeforeClass
    protected void init() {
        sort = createSort();
		arrayBuilder = createArrayBuilder();
    }    
	
	public void emptyArray () {
		assertThat(sort.sort(arrayBuilder.emptyArray()))
			.isEqualTo(arrayBuilder.emptyArray());
	}
	
	public void singleArray () {
		assertThat(sort.sort(arrayBuilder.singleArray()))
			.isEqualTo(arrayBuilder.singleArray());
	}	
	
	public void twoElementsAscendingSorted () {
		assertThat(sort.sort(arrayBuilder.twoElementsAscendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.twoElementsAscendingSorted()
				: arrayBuilder.twoElementsDescendingSorted());
	}	
	
	public void twoElementsDescendingSorted () {
		assertThat(sort.sort(arrayBuilder.twoElementsDescendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.twoElementsAscendingSorted()
				: arrayBuilder.twoElementsDescendingSorted());
	}	
	
	public void threeElementsAscendingSorted () {
		assertThat(sort.sort(arrayBuilder.threeElementsAscendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.threeElementsAscendingSorted()
				: arrayBuilder.threeElementsDescendingSorted());
	}	
	
	public void threeElements132 () {
		assertThat(sort.sort(arrayBuilder.threeElements132()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.threeElementsAscendingSorted()
				: arrayBuilder.threeElementsDescendingSorted());
	}	
	
	public void threeElements213 () {
		assertThat(sort.sort(arrayBuilder.threeElements213()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.threeElementsAscendingSorted()
				: arrayBuilder.threeElementsDescendingSorted());
	}	
	
	public void threeElements231 () {
		assertThat(sort.sort(arrayBuilder.threeElements231()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.threeElementsAscendingSorted()
				: arrayBuilder.threeElementsDescendingSorted());
	}	
	
	public void threeElements312 () {
		assertThat(sort.sort(arrayBuilder.threeElements312()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.threeElementsAscendingSorted()
				: arrayBuilder.threeElementsDescendingSorted());
	}	
	
	public void threeElementsDescendingSorted () {
		assertThat(sort.sort(arrayBuilder.threeElementsDescendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.threeElementsAscendingSorted()
				: arrayBuilder.threeElementsDescendingSorted());
    }
	
	public void fourElementsAscendingSorted () {
		assertThat(sort.sort(arrayBuilder.fourElementsAscendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.fourElementsAscendingSorted()
				: arrayBuilder.fourElementsDescendingSorted());
	}	
	
	public void fourElements1243 () {
		assertThat(sort.sort(arrayBuilder.fourElements1243()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.fourElementsAscendingSorted()
				: arrayBuilder.fourElementsDescendingSorted());
	}	
	
	public void fourElements1342 () {
		assertThat(sort.sort(arrayBuilder.fourElements1342()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.fourElementsAscendingSorted()
				: arrayBuilder.fourElementsDescendingSorted());
	}	
	
	public void fourElements4321 () {
		assertThat(sort.sort(arrayBuilder.fourElementsDescendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.fourElementsAscendingSorted()
				: arrayBuilder.fourElementsDescendingSorted());
	}	
	
	public void tenElementsWith1DigitAscendingSorted () {
		assertThat(sort.sort(arrayBuilder.tenElementsWith1DigitAscendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.tenElementsWith1DigitAscendingSorted()
				: arrayBuilder.tenElementsWith1DigitDescendingSorted());
	}	
	
	public void tenElementsWith1DigitDescendingSorted () {
		assertThat(sort.sort(arrayBuilder.tenElementsWith1DigitDescendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.tenElementsWith1DigitAscendingSorted()
				: arrayBuilder.tenElementsWith1DigitDescendingSorted());
	}	
	
	public void tenElementsWith2DigitsAscendingSorted () {
		assertThat(sort.sort(arrayBuilder.tenElementsWith2DigitsAscendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.tenElementsWith2DigitsAscendingSorted()
				: arrayBuilder.tenElementsWith2DigitsDescendingSorted());
	}	
	
	public void tenElementsWith2DigitsDescendingSorted () {
		assertThat(sort.sort(arrayBuilder.tenElementsWith2DigitsDescendingSorted()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.tenElementsWith2DigitsAscendingSorted()
				: arrayBuilder.tenElementsWith2DigitsDescendingSorted());
	}	
	
	public void tenElementsWith2Digits () {
		assertThat(sort.sort(arrayBuilder.tenElementsWith2Digits()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.tenElementsWith2DigitsAscendingSorted()
				: arrayBuilder.tenElementsWith2DigitsDescendingSorted());
	}	
	
	public void sixElementsWith3Digits () {
		assertThat(sort.sort(arrayBuilder.sixElementsWith3Digits()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.sixElementsWith3DigitsSortedAscending()
				: arrayBuilder.sixElementsWith3DigitsSortedDescending());
	}	
	
	public void sixElementsWith3DigitsSortedDescending () {
		assertThat(sort.sort(arrayBuilder.sixElementsWith3DigitsSortedDescending()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.sixElementsWith3DigitsSortedAscending()
				: arrayBuilder.sixElementsWith3DigitsSortedDescending());
	}	
	
	public void sixElementsWith3DigitsSortedAscending () {
		assertThat(sort.sort(arrayBuilder.sixElementsWith3DigitsSortedAscending()))
			.isEqualTo(sort.isAscending() ? arrayBuilder.sixElementsWith3DigitsSortedAscending()
				: arrayBuilder.sixElementsWith3DigitsSortedDescending());
	}	
    
}
