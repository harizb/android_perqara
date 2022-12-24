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

Mobile.startApplication('C:\\Users\\Dell\\Downloads\\API Demos for Android_1.9.0_Apkpure.apk', true)

Mobile.tap(findTestObject('Object Repository/checkboxandroid/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/checkboxandroid/android.widget.TextView - OK'), 0)

Mobile.tap(findTestObject('Object Repository/checkboxandroid/android.widget.TextView - API Demos'), 0)

Mobile.tap(findTestObject('Object Repository/checkboxandroid/android.widget.TextView - Accessibility'), 0)

Mobile.tap(findTestObject('Object Repository/checkboxandroid/android.widget.TextView - Accessibility Node Querying'), 0)

Mobile.tap(findTestObject('Object Repository/checkboxandroid/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/checkboxandroid/android.widget.CheckBox (1)'), 0)

Mobile.tap(findTestObject('Object Repository/checkboxandroid/android.widget.CheckBox (2)'), 0)

Mobile.tap(findTestObject('Object Repository/checkboxandroid/android.widget.CheckBox (3)'), 0)

Mobile.closeApplication()

