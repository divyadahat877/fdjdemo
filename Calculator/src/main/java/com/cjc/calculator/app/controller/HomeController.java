package com.cjc.calculator.app.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	int a;
	int b;
	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	public  void sub()
	{
		int d=a-b;
		System.out.println(d);
			
	}
}
