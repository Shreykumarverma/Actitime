package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement customerNameTbx;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescriptionTbx;
	@FindBy(xpath="//div[text()='- Select Customer -' and@class='emptySelection']")
	private WebElement selectCustomerDropdown;
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement selectCustomer;
	@FindBy(xpath="//div[text()='Create Customer']")
	private  WebElement createCustomerBtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement createdCustomerTitle;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getCustomerNameTbx() {
		return customerNameTbx;
	}

	public WebElement getCustomerDescriptionTbx() {
		return customerDescriptionTbx;
	}

	public WebElement getSelectCustomerDropdown() {
		return selectCustomerDropdown;
	}

	public WebElement getSelectCustomer() {
		return selectCustomer;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getCreatedCustomerTitle() {
		return createdCustomerTitle;
	}
	
	

}
