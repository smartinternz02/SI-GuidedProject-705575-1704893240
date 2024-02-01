import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class Cura_page_Test_listeners {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase() {
		WebUI.click(findTestObject('Object Repository/CURA_page_OR/TC_Cura_006/amenu-toggle'))

WebUI.click(findTestObject('Object Repository/CURA_page_OR/TC_Cura_006/a_Login'))

WebUI.setText(findTestObject('Object Repository/CURA_page_OR/TC_Cura_006/input_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/CURA_page_OR/TC_Cura_006/input_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/CURA_page_OR/TC_Cura_006/button_Login'))
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase() {
		WebUI.click(findTestObject('Object Repository/CURA_page_OR/TC_Cura_009/amenu-toggle'))

WebUI.click(findTestObject('Object Repository/CURA_page_OR/TC_Cura_009/a_Logout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA_page_OR/TC_Cura_009/h1_CURA Healthcare Service'), 0)
	}
}