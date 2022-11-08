package com.eu9gr4.step_definitions;


import io.cucumber.java.AfterAll;
import org.junit.After;
import org.junit.Before;

public class Hooks {

	@Before
	public void setup(){

	}

	@After
	public void teatdown(){
		System.out.println("new line");
		
	}

	@AfterAll
	public void teardown2(){

	}



}