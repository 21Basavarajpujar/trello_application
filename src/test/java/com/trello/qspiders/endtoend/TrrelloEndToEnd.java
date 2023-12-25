package com.trello.qspiders.endtoend;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.trello.qspiders.genericutility.BaseClass;
import com.trello.qspiders.pomrepository.TrelloBoardsPage;
import com.trello.qspiders.pomrepository.TrelloHomePage;
import com.trello.qspiders.pomrepository.TrelloLoginPage;
import com.trello.qspiders.pomrepository.TrelloLoginToContinueWebPage;
import com.trello.qspiders.pomrepository.TrelloLogoutPage;
import com.trello.qspiders.pomrepository.TrelloUserCreateBoardPage;

public class TrrelloEndToEnd extends BaseClass {
	@Test
	public void createAndDeleteBoard() throws FileNotFoundException, IOException {
		Actions actions = new Actions(driver);
		driverutils.implicitWaitInSeconds(driver);
		TrelloHomePage homepage = new TrelloHomePage(driver);
		homepage.getLoginOption().click();
		TrelloLoginPage loginpage = new TrelloLoginPage(driver);
		loginpage.getEmailTextField().sendKeys(fileUtils.readData("username"));
		loginpage.getLoginContinueButton().click();
		TrelloLoginToContinueWebPage password = new TrelloLoginToContinueWebPage(driver);
		driverutils.elementToBeClickable(driver, password.getPasswordTextField());
		password.getPasswordTextField().sendKeys(fileUtils.readData("password"));
		password.getLoginSubmitButton().submit();
		TrelloBoardsPage boardspage = new TrelloBoardsPage(driver);
		boardspage.getCreateNewBoardOption().click();
		boardspage.getBoardTitleTextField().sendKeys(fileUtils.readData("boardtitle"));
		actions.moveToElement(boardspage.getBoardTitleTextField()).pause(10)
				.scrollToElement(boardspage.getCreateBoardButton()).build().perform();
		boardspage.getCreateBoardButton().click();
		driverutils.partialTitle(driver, fileUtils.readData("boardtitle"));
		TrelloUserCreateBoardPage board = new TrelloUserCreateBoardPage(driver);
		board.getShowMenuOPtion().click();
		board.getMoreOption().click();
		board.getCloseBoardOption().click();
		board.getCloseButton().click();
		board.getDeleteBoardOption().click();
		board.getDeleteButton().click();
		boardspage.getUserProfileIcon().click();
		boardspage.getLogoutButton().click();
		TrelloLogoutPage logout = new TrelloLogoutPage(driver);
		logout.getLogoutButton().submit();

	}

}
