package com.siddhu;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SiddhuService {
	
	@Cacheable("siddhu")
	public String getSiddhuNameService(String siddhuname)
	{
		return findNameInDatabase(siddhuname);
	}

    private String findNameInDatabase(String siddhuname) {
		// TODO Auto-generated method stub
		//For simplicity we will return the hardcode value but in real scenario think that this method will make a
		// DB call or call another springboot application or call another Webservice. We will try to mimic that 
		//using thread.sleep function to stop the execution for 4 sec
		System.out.println("Inside Service SiddhuService :::::::::::::::::::::::::::::::::");
		try {
			Thread.sleep(4000);
		}
		catch(InterruptedException exp)
		{
			 Thread.currentThread().interrupt();
	            throw new RuntimeException(exp);
		}
		return siddhuname;		
	}

}
