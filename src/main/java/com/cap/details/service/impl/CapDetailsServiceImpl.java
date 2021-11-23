package com.cap.details.service.impl;

import java.io.*;
import java.nio.charset.StandardCharsets;
import org.springframework.stereotype.Component;

@Component
public class CapDetailsServiceImpl implements CapDetailsService{

	@Override
	public String getCapDetails(String capRegNumber) {
		System.out.println("capRegNumber :" + capRegNumber);
		var classLoader = Thread.currentThread().getContextClassLoader();
		String result;
		InputStream inputStream = null;
		try {
			if(capRegNumber.equalsIgnoreCase("123")) {
				inputStream = classLoader.getResourceAsStream("abc.json");
			}
			if(capRegNumber.equalsIgnoreCase("456")) {
				inputStream = classLoader.getResourceAsStream("xyz.json");
			}
			if(capRegNumber.equalsIgnoreCase("789")) {
				inputStream = classLoader.getResourceAsStream("pqr.json");
			}
			
			var streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
			var reader = new BufferedReader(streamReader);
			while ((result = reader.readLine()) != null) {
				return result;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}


}
