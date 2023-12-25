package com.trello.qspiders.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloUserCreateBoardPage {
	WebDriver driver;

	public TrelloUserCreateBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "button[aria-label='Show menu']")
	private WebElement showMenuOPtion;

	@FindBy(xpath = "//a[contains(.,'More')]")
	private WebElement moreOption;

	@FindBy(xpath = "//a[contains(.,'Close board')]")
	private WebElement closeBoardOption;

	@FindBy(css = "input[value='Close']")
	private WebElement closeButton;

	@FindBy(xpath = "//button[text()='Permanently delete board']")
	private WebElement deleteBoardOption;

	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement deleteButton;

	public WebElement getShowMenuOPtion() {
		return showMenuOPtion;
	}

	public WebElement getMoreOption() {
		return moreOption;
	}

	public WebElement getCloseBoardOption() {
		return closeBoardOption;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getDeleteBoardOption() {
		return deleteBoardOption;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

}
