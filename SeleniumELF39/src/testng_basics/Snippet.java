package testng_basics;

public class Snippet {
	public void Select(WebElement element,String text)
			{
				Select sel=new Select(element);
				sel.selectByVisibleText(text);
			}
			
			public void Select(WebElement element,int num)
			{
				Select sel1=new Select(element);
				sel1.selectByIndex(num);
			
	
			}
			
			public void Select(WebElement element,String value)
			{
				Select sel2=new Select(element);
				sel2.selectByValue(value);
			}
}

