package cura_custom_keyword_001

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.common.WebUiCommonHelper

import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

public class Check_DropDown {
	@Keyword
	def check_drop_downlistexits(TestObject object,String option){
		boolean flag = false;
		WebElement element = WebUiCommonHelper.findWebElement(object,20);
		Select dd1=new Select(element);
		for(WebElement ele : dd1.getOptions()) {
			if(ele.getText()().equals(option)) {
				System.out.println("element Exists");
				flag=true;
			}
			else {
				System.out.println("element not exists");
			}
		}
		return flag;
	}
}
