package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PermissionsPage
{
@FindBy(xpath="//td[text()=' Customer Orders']/following-sibling::td[@align='center']/child::a[text()='All']")
private WebElement custOrderAllLink;

@FindBy(xpath="//td[text()=' Contracts']/following-sibling::td/child::a[text()='All']")
private WebElement contractsAllLink;

@FindBy(xpath="//td[text()='Read sendings']/preceding-sibling::td/child::a")
private WebElement shipmentReadLink;
@FindBy(xpath="//td[text()=' Invoices']/following-sibling::td/child::a[text()='All']")
private WebElement invoicesAllLink;
@FindBy(xpath="//td[text()=' Products']/following-sibling::td[@align='center']/child::a[text()='All']")
private WebElement productsAllLink;
@FindBy(xpath="//td[text()=' Third parties']/following-sibling::td/child::a[text()='All']")
private WebElement thirdPartyAllLink;
@FindBy(xpath="//td[text()=' Proposals']/following-sibling::td/child::a[text()='All']")
private WebElement proposalsAllLink;

@FindBy(xpath="//td[text()='Read stocks']/preceding-sibling::td/child::a")
private WebElement readStocksLink;

public PermissionsPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public void clikonAllCustOrder()
{
custOrderAllLink.click();

}
public void clickonAllContracts()
{
	contractsAllLink.click();	
}
public void clickonShipmentRead()
{
	shipmentReadLink.click();	
}
public void clickonInvoices()
{
	invoicesAllLink.click();	
}
public void clickonAllProduct()
{
	productsAllLink.click();	
}

public void clikonAllThirdPrties()
{
	
thirdPartyAllLink.click();
}
public void clickonAllProposal()
{
	proposalsAllLink.click();

}

public void clickonReadStocks()
{
	readStocksLink.click();

}
}
