package com.lsengine;


public class DemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LSEnginePropertiesReader ls = LSEnginePropertiesReader.getInstance();
		ls.loadProperties("C:/Users/USER/Desktop/raja.txt");
		System.out.println(ls.getAllProperties().toString());
		System.out.println("-----------------------------------------------------------");
		LSEnginePropertiesReader ls2 = LSEnginePropertiesReader.getInstance();
		ls2.loadProperties("C:/Users/USER/Desktop/test.properties");
		System.out.println(ls2.getAllProperties().toString());
	}

}
