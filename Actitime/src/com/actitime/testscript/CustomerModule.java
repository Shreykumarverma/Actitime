package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.HomePage;
import com.actitime.POM.TaskListPage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
@Listeners(com.actitime.generic.ListnersImplementation.class)
public class CustomerModule extends BaseClass{
@Test
public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("createCustomer",true);
	FileLib f=new FileLib();
	String customerName = f.getExcelData("CreateCustomer", 1, 2);
	String customerDescription = f.getExcelData("CreateCustomer", 1, 3);
	HomePage h=new HomePage(driver);
	h.setTask();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustomerBtn().click();
	t.getCustomerNameTbx().sendKeys(customerName);
	t.getCustomerDescriptionTbx().sendKeys(customerDescription);
	t.getSelectCustomerDropdown().click();
	t.getSelectCustomer().click();
	t.getCreateCustomerBtn().click();
	Thread.sleep(5000);
	String actualcustomer = t.getCreatedCustomerTitle().getText();
	Assert.assertEquals(actualcustomer, customerName);
}
}
