import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox_selected_Not extends BaseClass{
	public static void main(String[] args) {
		
		
		driver.get("http://localhost/login.do");
		
		// Method 1
		boolean result = driver.findElement(By.name("remember")).isSelected();
		
		System.out.println(result);
		
		// Method 2
		
		/*WebElement KeepMeLogIN_Checkbox = driver.findElement(By.name("remember"));
		//select the checkbox
		
		//KeepMeLogIN_Checkbox.click();
		
		/Using the isSelected() method, it checks whether the checkbox is selected or 
		not :   if it is already selected, it return true and if not selected, then it returns 
				false/
		
				if (KeepMeLogIN_Checkbox.isSelected()) {
					System.out.println("Checkbox is selected");
				}else{
					System.out.println("Checkbox is NOT selected");
				}*/
	}
}
