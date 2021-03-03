import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.IOException;

public class ExtendReporter {
    public static void main(String[] args) throws IOException {

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent1.html");

        // create ExtentReports and attach reporter(s)
        //ExtentReports extent = new ExtentReports("extent.html");
        com.aventstack.extentreports.ExtentReports extent= new com.aventstack.extentreports.ExtentReports();
        extent.attachReporter(htmlReporter);


        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        // log with snapshot
      //  test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

        // test with snapshot

            test.addScreenCaptureFromPath("screenshot.png");


        // calling flush writes everything to the log file
        extent.flush();
    }
}
