package com.in28minutes.mockito.mockitoin5steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessAnnotationMockTest {

	@Mock
	DataService dataServiceMock;

	@InjectMocks
	SomeBusinessImpl someBusinessImpl;

	@Test
	public void findGreatest_with3nums() {
		when(dataServiceMock.retriveData()).thenReturn(new int[] { 25, 43, 54 });
		int result = someBusinessImpl.findGreatest();
		assertEquals(54, result);

	}
}
