import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

for(def row=1; row <= findTestData('TestDataQAWorksAcceptanceContactForm').getRowNumbers(); row++)
{
	WebUI.openBrowser('')
	
	WebUI.navigateToUrl('http://www.qaworks.com/')
	
	WebUI.click(findTestObject('Page_QAWorks Limited - Software Qua/span_CONTACT US'))
	
	WebUI.setText(findTestObject('Page_CONTACT US  QAWorks Limited/input_your-name'), findTestData('TestDataQAWorksAcceptanceContactForm').getValue(
	        "Name", row))
	
	WebUI.setText(findTestObject('Page_CONTACT US  QAWorks Limited/input_your-email'), findTestData('TestDataQAWorksAcceptanceContactForm').getValue(
	        "Email", row))
	
	WebUI.setText(findTestObject('Page_CONTACT US  QAWorks Limited/input_your-company'), findTestData('TestDataQAWorksAcceptanceContactForm').getValue(
	        "Subject", row))
	
	WebUI.setText(findTestObject('Page_CONTACT US  QAWorks Limited/textarea_your-message'), findTestData('TestDataQAWorksAcceptanceContactForm').getValue(
	        "Message", row))
	
	WebUI.click(findTestObject('Page_CONTACT US  QAWorks Limited/input_contact-us-send'))
	
	WebUI.closeBrowser()
}

