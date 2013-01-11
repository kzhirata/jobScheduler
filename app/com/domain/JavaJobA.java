package com.domain;

import play.Logger;

public class JavaJobA {

	public void doJob(){
		Logger.info(this.getClass().getName() + " executes.");
		//throw new RuntimeException("AN ERROR OCURRED");
	}
	
}
