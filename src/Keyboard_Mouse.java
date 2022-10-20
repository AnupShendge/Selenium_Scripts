import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Keyboard_Mouse extends BaseClass {

	public static void main(String[] args) throws AWTException {
		
		driver.get("http://localhost:8080/login.do");
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);
		
		

	}

}
