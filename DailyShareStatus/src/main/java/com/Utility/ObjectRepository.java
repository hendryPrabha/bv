package com.Utility;

public class ObjectRepository {
	private String GainerSymbol="(((//table[@id=\"topGainers\"])/..//th)/../..//tr//td[1])";
	private String GainerValue="(((//table[@id=\"topGainers\"])/..//th)/../..//tr//td[5])";
	private String GainerOpen="(((//table[@id=\"topGainers\"])/..//th)/../..//tr//td[6])";
	private String GainerHigh="(((//table[@id=\"topGainers\"])/..//th)/../..//tr//td[7])";
	private String GainerLow="(((//table[@id=\"topGainers\"])/..//th)/../..//tr//td[8])";
					
	public String getGainerSymbol() {
		return GainerSymbol;
	}
	public String getGainerValue() {
		return GainerValue;
	}
	public String getGainerOpen() {
		return GainerOpen;
	}
	public String getGainerHigh() {
		return GainerHigh;
	}
	public String getGainerLow() {
		return GainerLow;
	}
	

	

}
