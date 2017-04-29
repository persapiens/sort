package org.persapiens.sort;

/**
 *
 * @author marcelo
 */
public class HeapSortMaxTest extends AbstractSortTest  <Integer>{
    @Override
    protected Sort createSort() {
        return HeapSort.builder().ascending(true).build();
    }

	@Override
	ArrayBuilder<Integer> createArrayBuilder() {
		return new ArrayBuilder<Integer>(new IdentidadeTransformar<Integer>());
	}
}
