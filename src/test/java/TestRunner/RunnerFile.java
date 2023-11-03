package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\EclipseWorkpace\\Nopcommerces\\src\\test\\resource\\Featuer",
		glue="stepdefination",
		monochrome = true,
		plugin={"json:target/MyReports/report.json",
				"html:target/MyReports/report.html",
				"junit:target/MyReports/report.xml"
				}

		)

public class RunnerFile {

}
