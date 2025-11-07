package com.kodewala.annotationbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderId {

	@Value("11")
	int srlNo;

	public int getSrlNo() {
		return srlNo;
	}

	public void setSrlNo(int srlNo) {
		this.srlNo = srlNo;
	}
	
	
}
