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

Mobile.tap(findTestObject('Registrar/registrarse'), 0)

Mobile.tap(findTestObject('Registrar/seleccionar pais'), 0)

Mobile.tap(findTestObject('Registrar/buscar pais'), 0)

Mobile.sendKeys(findTestObject('Registrar/buscar pais'), 'República Dominicana')

Mobile.tap(findTestObject('Registrar/Republica Dominicana'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 2'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 4'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 5'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 6'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 7'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 8'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 9'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 0'), 0)

Mobile.tap(findTestObject('Registrar/continuar y recibir otp'), 0)

Mobile.verifyElementVisible(findTestObject('Registrar/ventana de validacion'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/validar otp'), 0)

Mobile.tap(findTestObject('Registrar/ingresar nombre'), 0)

Mobile.sendKeys(findTestObject('Registrar/ingresar nombre'), 'Nuevo Usuario')

Mobile.tap(findTestObject('Registrar/ingresar descripcion'), 0)

Mobile.sendKeys(findTestObject('Registrar/ingresar descripcion'), 'Placeholder')

Mobile.tap(findTestObject('Registrar/aceptar terminos'), 0)

Mobile.tap(findTestObject('Registrar/agregar foto de perfil'), 0)

Mobile.tap(findTestObject('Registrar/agregar desde la camara'), 0)

Mobile.tap(findTestObject('Chat P2P - Grupal/tomar foto'), 0)

Mobile.tap(findTestObject('Registrar/aceptar foto'), 0)

Mobile.tap(findTestObject('Registrar/completar registro'), 0)

Mobile.verifyElementVisible(findTestObject('Registrar/mensaje de exito'), 0)

