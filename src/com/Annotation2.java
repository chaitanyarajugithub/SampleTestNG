package com;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {
@BeforeTest
public void setup()
{
Reporter.log("Executing setup",true);	
}
@Test
public void method1()
{
Reporter.log("Executing method1",true);	
}
@Test
public void method2()
{
	Reporter.log("Executing method2",true);	
}
@Test
public void method3()
{
Reporter.log("Executing method3",true);	
}
@AfterTest
public void teardown()
{
	Reporter.log("Executing teardown",true);	
}
}

