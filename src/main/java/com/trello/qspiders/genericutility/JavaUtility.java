package com.trello.qspiders.genericutility;

import java.time.LocalDateTime;

public class JavaUtility {
	/**
	 * This method will give the unique Name to the screenshot
	 * 
	 * @author Akash
	 * @return timeStamp
	 */
	public String timeStamp() {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		return timeStamp;
	}
}
