package getPropProg;

import java.util.Properties;

import org.testng.annotations.Test;

public class getPropertyProgrammeTest {
@Test
public void getPropertyProg() {
	String Browser = System.getProperty("browser");
	System.out.println(Browser);
	
	String URL = System.getProperty("url");
	System.out.println(URL);
}
}
