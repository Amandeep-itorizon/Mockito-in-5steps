package com.in28minutes.mockito.mockitoin5steps;

public class SomeBusinessImpl {
	private DataService ds;

	public SomeBusinessImpl(DataService ds) {
		this.ds = ds;
	}

	public int findGreatest() {
		int[] data = ds.retriveData();
		int greatest = Integer.MIN_VALUE;
		for (int val : data) { // 25, 34, 45
			if (val > greatest) {
				greatest = val;
			}
		}
		return greatest;
	}
}
