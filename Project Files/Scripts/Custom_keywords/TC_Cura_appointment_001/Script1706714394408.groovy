import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.selectOptionByValue(findTestObject('Object Repository/CURA_page_OR/TC_Cura_005/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Tokyo CURA Healthcare Center', true)

CustomKeywords.'cura_custom_keyword_001.Check_DropDown.check_drop_downlistexits'(findTestObject('CURA_page_OR/TC_Cura_005/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Tokyo CURA Healthcare Center')

WebUI.check(findTestObject('Object Repository/CURA_page_OR/TC_Cura_005/label_Apply for hospital readmission'))

WebUI.check(findTestObject('Object Repository/CURA_page_OR/TC_Cura_005/label_Medicaid'))

WebUI.click(findTestObject('Object Repository/CURA_page_OR/TC_Cura_005/div_input-group-addon'))

WebUI.click(findTestObject('Object Repository/CURA_page_OR/TC_Cura_005/td_24'))

WebUI.click(findTestObject('Object Repository/CURA_page_OR/TC_Cura_005/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA_page_OR/TC_Cura_005/h2_Appointment Confirmation'), 0)

