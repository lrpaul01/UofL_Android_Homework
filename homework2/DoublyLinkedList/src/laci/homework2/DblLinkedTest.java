package laci.homework2;

import org.junit.Assert;

import org.junit.Test;

public class DblLinkedTest {

	@Test
	public void test() {
		
		
	String names2Evaluate = "Alejandro Andrea Tammy Laci ";
	DblLinkedList list = new DblLinkedList();
	list.add("Laci");
	list.add("Tammy");
	list.add("Andrea");
	list.add("Alejandro");
	
	Assert.assertEquals(names2Evaluate, list.reversePrint());
	}

}
