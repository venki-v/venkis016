package newpakage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class hello {

	@Keyword

	def prinln(){
		print("Hello Venki....")
	}

	@Keyword
	def printName(String name){

		println("\n Hello "+name+"  \n")
	}


	@Keyword

	def CalcilateSum(){

		def a = 10
		def b = 20
		def c = a+b
		println("\n sum is  "+c+"  \n")
	}

	//Tis is the Sum of two numbers
	@Keyword

	def CalcilateSumshobha(int a, int b){

		//def a = 10
		//def b = 20
		def c = a+b
		println("\n sum is  "+c+"  \n")
	}

}












