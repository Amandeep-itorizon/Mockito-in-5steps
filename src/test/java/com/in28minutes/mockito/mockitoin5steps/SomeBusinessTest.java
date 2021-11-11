package com.in28minutes.mockito.mockitoin5steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBusinessTest {

	@Test
	public void findGreatest_with3nums() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub());

		int result = someBusinessImpl.findGreatest();
		assertEquals(34, result);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retriveData() {
		return new int[] { 25, 34, 45 };
	}

}
