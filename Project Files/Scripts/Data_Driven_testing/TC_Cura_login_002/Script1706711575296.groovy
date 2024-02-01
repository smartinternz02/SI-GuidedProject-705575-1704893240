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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/CURA_page_OR/Page_CURA Healthcare Service/i_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/CURA_page_OR/Page_CURA Healthcare Service/a_Login'))

WebUI.setText(findTestObject('Object Repository/CURA_page_OR/Page_CURA Healthcare Service/input_username'), username)

WebUI.setText(findTestObject('Object Repository/CURA_page_OR/Page_CURA Healthcare Service/input_password'), password)

WebUI.click(findTestObject('Object Repository/CURA_page_OR/Page_CURA Healthcare Service/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA_page_OR/Page_CURA Healthcare Service/p_Login failed Please ensure the username a_eb55b5'), 
    0)

WebUI.closeBrowser()

