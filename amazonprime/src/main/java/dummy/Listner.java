package dummy;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listner implements ITestListener {
	 ExtentReports er;
	 ExtentTest test;
	 
		public void onTestStart(ITestResult result) {
			String name=result.getName();
			//perticular test case monitor
			test=er.createTest(name);
			
		}

		public void onTestSuccess(ITestResult result) {
			String name=result.getName();
			test.log(Status.PASS, name+"---->pass");
			
		}

		public void onTestFailure(ITestResult result) {
			String name=result.getName();
			test.log(Status.FAIL, name+"---->fail");
			
				}

		public void onTestSkipped(ITestResult result) {
			String name=result.getName();
			test.log(Status.SKIP, name+"---->skip");
			
				}

		public void onStart(ITestContext context) {
			ExtentSparkReporter esr=new ExtentSparkReporter(".//extentreport"+1+".html");
			//to provide title to the report
			esr.config().setDocumentTitle("final vtiger report");
			//providing the name
			esr.config().setTheme(Theme.STANDARD);
			//providing reporter name
			esr.config().setReportName("Rajyalaxmi");
			//extra relavent information about report
			er=new ExtentReports();
			er.attachReporter(esr);
			er.setSystemInfo("operating System", "window");
			er.setSystemInfo("Language", "java");
			
				}

		public void onFinish(ITestContext context) {
			er.flush();
			
		}
		

	}


