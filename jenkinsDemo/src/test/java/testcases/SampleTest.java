package testcases;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

public class SampleTest {
	@Test
public void demo() {
String time = LocalDateTime.now().toString();
System.out.println(time);
String date = time.replace(':', '-');
System.out.println(date);

	}
}
