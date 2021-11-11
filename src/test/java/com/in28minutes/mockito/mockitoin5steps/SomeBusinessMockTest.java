package com.in28minutes.mockito.mockitoin5steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class SomeBusinessMockTest {

	@Test
	public void findGreatest_with3nums() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retriveData()).thenReturn(new int[] { 25, 43, 54 });

		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);

		int result = someBusinessImpl.findGreatest();
		assertEquals(54, result);

	}
}
