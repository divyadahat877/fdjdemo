package com.cjc.calculator.app.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	int a=30;
	int b=20;
	public void add()
	{
		int c=30+20;
		System.out.println(c);
	}
	public  void sub()
	{
		int d=30-20;
		System.out.println(d);
			
	}
}
