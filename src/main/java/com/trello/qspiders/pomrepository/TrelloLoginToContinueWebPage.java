package com.trello.qspiders.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginToContinueWebPage {
	WebDriver driver;

	public TrelloLoginToContinueWebPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "password")
	private WebElement PasswordTextField;

	@FindBy(id = "login-submit")
	private WebElement loginSubmitButton;

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginSubmitButton() {
		return loginSubmitButton;
	}

}
