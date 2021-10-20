package com.siddhu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/siddhu")
public class SiddhuController {
	
	@Autowired
	private SiddhuService siddhuService;
	

	@GetMapping("/{siddhuname}")
	public String getSiddhuName(@PathVariable("siddhuname") String siddhuname)
	{
		//return  siddhuname;
		return siddhuService.getSiddhuNameService(siddhuname);
	}
}
