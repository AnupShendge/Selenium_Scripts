import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Reffered below program using https://www.youtube.com/watch?v=f_8yUC52g34 

public class BrokenLinkTest extends BaseClass {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {

		driver.get("https://www.zlti.com/");

		driver.manage().window().maximize();

		// To get the list of all the links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		System.out.println("Size of full links " + allLinks.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		// Iterate over all links : exclude all the links which doesnt have href
		// attribute
		for (int i = 0; i < allLinks.size(); i++) {
			
			WebElement element = allLinks.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			
			// Create connection using url object 'link'
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			
			Thread.sleep(2000);
			
			// Establish connection
			httpConn.connect();
			
			int responseCode = httpConn.getResponseCode();
			
			if(responseCode >=400) {
				System.out.println(url + "--->" + "is broken link");
			}
			else  {
				System.out.println(url + "--->" + "is valid link");
			}
				
			
			
		}

			//System.out.println(allLinks.get(i).getAttribute("href"));

			/*if (allLinks.get(i).getAttribute("href") != null) {
				activeLinks.add(allLinks.get(i));
			}

		}

		System.out.println("Size of active links is " + activeLinks.size());

		// Check the href url, with the httpconnection api :
		for (int j = 0; j < activeLinks.size(); j++) {
			try {
				HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
						.openConnection();
				connection.connect();
				String response = connection.getResponseMessage();
				connection.disconnect();
				System.out.println(activeLinks.get(j).getAttribute("href") + "--->" + response);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
}
