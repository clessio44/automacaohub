package PageObjectTDD;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReport {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	//before
	public static void ConfigurationReport(String nameTest) {
		htmlReporter = new ExtentHtmlReporter("src/test/resources/Reports/Report.html");
		
	//	htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Relatorio TDD");
		htmlReporter.config().setReportName("AdvantageDemo");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	public static ExtentTest ReportRelatorio(String testName) {
		test = extent.createTest(testName);
		//extent.setSystemInfo("Automation", "TDD");
		//extent.setSystemInfo("Test", "Positivo");
		//extent.setSystemInfo("Test2", "Negativo");
		return test;
	}
	
	public static void relatorioReport(ITestResult result, WebDriver driver) {
		if(result.getStatus() == ITestResult.FAILURE){
			test.log(Status.FAIL, "TestCase Fail" + result.getName());
			test.log(Status.FAIL, "TestCase Fail" + result.getThrowable());
		}
		else if(result.getStatus() == ITestResult.SUCCESS){
			test.log(Status.PASS, "TestCase Passed" + result.getName());
		}
		else if(result.getStatus() == ITestResult.SKIP){
			test.log(Status.SKIP, "TestCase Skip" + result.getName());
		}
	}
	//after
	public void endReport() {
		extent.flush();
		
	}
	
	
	
}
