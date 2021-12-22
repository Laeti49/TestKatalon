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

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/strong_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_infokatalon.com'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h3_We Care About Your Health'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Atlanta 550 Pharr Road NE Suite 525Atlant_8f4c85'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service                _bba294'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'toto')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'Bf8z3mXXG60=')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service        We Care _b17f12'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service        We Care _b17f12'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service        We Care _b17f12'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service        We Care _b17f12'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service        We Care _b17f12'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h3_We Care About Your Health'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/span_Demo account_demo_username_label'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.mouseOver(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service        We Care _b17f12'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service        We Care _b17f12'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h3_We Care About Your Health'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/strong_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Atlanta 550 Pharr Road NE Suite 525Atlant_8f4c85'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Copyright  CURA Healthcare Service 2021'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/div_Demo account_col-sm-8'))

WebUI.rightClick(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.rightClick(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Login'))

WebUI.rightClick(findTestObject('Object Repository/Page_CURA Healthcare Service/section_Login                Please login t_80017f'))

