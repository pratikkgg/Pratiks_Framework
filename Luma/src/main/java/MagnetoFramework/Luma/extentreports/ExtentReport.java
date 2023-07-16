package MagnetoFramework.Luma.extentreports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;

public class ExtentReport {
	public ExtentReports setupReport() {
		
		String rpath = "E:\\New folder\\BDD\\Luma\\src\\test\\resources\\Reports";
		ExtentSparkReporter repo = new ExtentSparkReporter(rpath);
		repo.config().setReportName("Sharvari's Report");
		repo.config().setDocumentTitle("Luma Project Report");
		
		ExtentReports ext=new ExtentReports();
		ext.attachReporter(repo);
		ext.setSystemInfo("tester name", "SharvariG");
		return ext;

	}
}
