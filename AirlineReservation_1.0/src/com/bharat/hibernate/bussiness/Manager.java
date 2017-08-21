package com.bharat.hibernate.bussiness;

public class Manager {
	protected int maxCount;
	protected int index;
	
	public Manager(){
		index=0;
		maxCount = 40;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public void incrementIndex(){ index+=maxCount;}
	public void gotoStart(){index = 0;}
	
}
