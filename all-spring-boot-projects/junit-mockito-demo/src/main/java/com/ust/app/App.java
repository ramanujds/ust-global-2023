package com.ust.app;

public class App {

	private AppService service;
	
	public void setService(AppService service) {
		this.service = service;
	}
	
	public AppService getService() {
		return service;
	}
	

	public boolean check(int n) {
		
		return service.checkEven(n);
	}
	
	
	public int findLength(String str) {
		return service.getStringLength(str);
	}
	
	




	
}
