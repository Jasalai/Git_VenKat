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

// enviar docx
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar documentos'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.docx')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar doc
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar documentos'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.doc')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar pptx
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar documentos'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.pptx')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar ppt
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar documentos'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.ppt')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar xlsx
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar documentos'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.xlsx')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar xls
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar documentos'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.xls')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar png
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar documentos'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.png')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar jpeg
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar documentos'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.jpeg')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar psd
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar documentos'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.psd')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar 3gp
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar audio'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/desde la galeria'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.3gp')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar mov
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar video'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/desde la galeria'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.mov')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar mp4
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar video'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/desde la galeria'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.mp4')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar webm
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar video'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/desde la galeria'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.webm')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar pdf
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar documentos'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.pdf')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}

// enviar ai
Mobile.tap(findTestObject('Chat P2P - Grupal/boton adjuntar'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/adjuntar documentos'), 0)
Mobile.tap(findTestObject('Chat P2P - Grupal/buscar archivos'), 0)
Mobile.sendKeys(findTestObject('Chat P2P - Grupal/buscar archivo'), 'ven.ai')
Mobile.pressBack()
try {
	Mobile.tap(findTestObject('Chat P2P - Grupal/seleccionar primer archivo'), 0)
}
catch (Exception e) {
	Mobile.pressBack()
}
