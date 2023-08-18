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

Mobile.startExistingApplication('com.cybercapitalparnerscorp.venchat.develop', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)

Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar video'), 0)

Mobile.tap(findTestObject('Chat P2P - Grupal/desde la camara'), 0)

Mobile.tap(findTestObject('Chat P2P - Grupal/grabar video'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHold(findTestObject('Chat P2P - Grupal/grabar video'), 6, 0)

Mobile.tap(findTestObject('Chat P2P - Grupal/grabar video'), 0)

Mobile.tap(findTestObject('Chat P2P - Grupal/aceptar video'), 0)

Mobile.tap(findTestObject('Chat P2P - Grupal/aceptar video - 2'), 0)

Mobile.waitForElementPresent(findTestObject('Chat P2P - Grupal/escribir mensaje'), 0)

Mobile.tap(findTestObject('Chat P2P - Grupal/escribir mensaje'), 0)

Mobile.sendKeys(findTestObject('Chat P2P - Grupal/escribir mensaje'), 'Auto - Video')

Mobile.tap(findTestObject('Chat P2P - Grupal/enviar adjunto'), 0)
