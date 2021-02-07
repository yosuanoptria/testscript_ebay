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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.urlEbay)

'open cell phones and accessories'
WebUI.callTestCase(findTestCase('pages/go cell phones and accessories page'), [:], FailureHandling.STOP_ON_FAILURE)

'select filter'
WebUI.callTestCase(findTestCase('pages/select filters'), [:], FailureHandling.STOP_ON_FAILURE)

'verify filter'
WebUI.callTestCase(findTestCase('pages/verify filter tags'), [('verify_price') : verify_price, ('verify_location') : verify_location
        , ('verify_total_filter') : verify_total_filter], FailureHandling.STOP_ON_FAILURE)

'Close browser'
WebUI.closeBrowser()