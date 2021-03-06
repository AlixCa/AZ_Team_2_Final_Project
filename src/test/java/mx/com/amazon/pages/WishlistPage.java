package mx.com.amazon.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WishlistPage extends BasePage
{
    public WishlistPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    
    @FindBy(css = "[data-action='reg-nav-link'] div div span")
    List<WebElement> lists;
    
    public boolean isAtWishListPage()
    {
        return lists.size() > 0;
    }
    
    public boolean verifyWishListCreated(String wishList)
    {
        for(WebElement list : lists )
        {
            if (list.getText().equals(wishList))
                return true;
        }
        return false;
    }
}
