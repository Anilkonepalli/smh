package com.srm.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smh.entity.BillingEnum;
import com.smh.entity.ChaildTestFee;
import com.smh.entity.Consultant;
import com.smh.entity.IdCreator;
import com.smh.entity.IndividualTestEnum;
import com.smh.entity.TestFee;
import com.smh.entity.TestFields;
import com.smh.entity.test.WidalTest;
import com.smh.util.RegIdGenerator;

public class HibernateTest {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFatory(){
		if(sessionFactory!=null){
			return sessionFactory;
		}
		else{
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			sessionFactory=(SessionFactory) context.getBean("sessionFactory");
			return sessionFactory;
		}
	}
	
	public static void main(String[] args) throws Exception{
		
		insertTestData();
		 insertIdCreator();
		
		insertAdditionalTest();
		insertRemainingData();
		
	}
	public static void insertAdditionalTest(){
		
		SessionFactory sessionFactory=getSessionFatory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		TestFields dlcCountHiddenParam=new TestFields("hidden","","dlcCount.testFee.id","","","");
		TestFields neutrophils=new TestFields("text","Neutrophils","dlcCount.neutrophils","40-75%","%","");		
		TestFields lymphocytes=new TestFields("text","Lymphocytes","dlcCount.lymphocytes","20-40%","%","");
		TestFields eosinophils=new TestFields("text","Eosinophils","dlcCount.eosinophils","01-06%","%","");
		TestFields monocytes=new TestFields("text","MOnocytes","dlcCount.monocytes","01-06%","%","");
		session.save(neutrophils);
		session.save(lymphocytes);
		session.save(eosinophils);
		session.save(monocytes);
		session.save(dlcCountHiddenParam);
		
		List<TestFields> testFieldList=new ArrayList<TestFields>();
		testFieldList.add(neutrophils);
		testFieldList.add(lymphocytes);
		testFieldList.add(eosinophils);
		testFieldList.add(monocytes);
		testFieldList.add(dlcCountHiddenParam);
		
		TestFee dlc=new TestFee();
		dlc.setTestName("DLC Count");
		dlc.setDescription("DLC Count");
		dlc.setCategory("Hematology");
		dlc.setIndividualTestEnum(IndividualTestEnum.Y);
		dlc.setFee(30.0);
		dlc.setTestFields(testFieldList);
		session.save(dlc);
		List<TestFee> testFeeList=new ArrayList<TestFee>();
		testFeeList.add(dlc);
	
		TestFields cbpTesthiddenParam=new TestFields("hidden","","cbpTest.testFee.id","","","");
		TestFields heamoglobin=new TestFields("text","Haemoglobin","cbpTest.heamoglobin","M 13.0-18.0 gms% F 11.0-16.0 gms%","gms%","");
		TestFields tlcCount=new TestFields("text","TLC Count","cbpTest.tlcCount","4000-10000/cmm","cmm","");
		TestFields esrTest=new TestFields("text","E.S.R","cbpTest.esr","0-20mm/hr","mm/hr","");
		TestFields plateletCount=new TestFields("text","Platelet Count","cbpTest.plateletCount","1.4-4.4 lakhs/cmm","laksh/cmm","");
		session.save(cbpTesthiddenParam);
		session.save(heamoglobin);
		session.save(tlcCount);
		session.save(esrTest);
		session.save(plateletCount);
		
		List<TestFields> cbpTestFieldList=new ArrayList<TestFields>();
		cbpTestFieldList.add(cbpTesthiddenParam);
		cbpTestFieldList.add(heamoglobin);
		cbpTestFieldList.add(tlcCount);
		cbpTestFieldList.add(esrTest);
		cbpTestFieldList.add(plateletCount);
		
		TestFee cbpTest=new TestFee();
		cbpTest.setTestName("CBP");
		cbpTest.setDescription("Complete Blood Picture");
		cbpTest.setCategory("Hematology");
		cbpTest.setIndividualTestEnum(IndividualTestEnum.Y);
		cbpTest.setFee(250.0);
		cbpTest.setTestFields(cbpTestFieldList);
		cbpTest.setTestFeeList(testFeeList);
		
		session.save(cbpTest);
		
		session.getTransaction().commit();
		session.close();
	}
//==================================================================CMPLTE HAEMOGRAM TEST	START
	private static void insertRemainingData()
	{
		
		SessionFactory sessionFactory=getSessionFatory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		TestFields dlcCountHiddenParam=new TestFields("hidden","","dlcCount.testFee.id","","","");
		TestFields neutrophils=new TestFields("text","Neutrophils","dlcCount.neutrophils","40-75%","%","");		
		TestFields lymphocytes=new TestFields("text","Lymphocytes","dlcCount.lymphocytes","20-40%","%","");
		
		session.save(dlcCountHiddenParam);
		session.save(neutrophils);
		session.save(lymphocytes);
		
		List<TestFields> testFieldList=new ArrayList<TestFields>();
		testFieldList.add(neutrophils);
		testFieldList.add(lymphocytes);
		testFieldList.add(dlcCountHiddenParam);
		
		TestFee dlc=new TestFee();
		dlc.setTestName("DLC Count");
		dlc.setDescription("DLC Count");
		dlc.setCategory("Hematology");
		dlc.setIndividualTestEnum(IndividualTestEnum.Y);
		dlc.setFee(30.0);
		dlc.setTestFields(testFieldList);
		session.save(dlc);
		List<TestFee> testFeeList=new ArrayList<TestFee>();
		testFeeList.add(dlc);
	
		TestFields cbhHiddenParam=new TestFields("hidden","","cbhTest.testFee.id","","","");
		TestFields heamoglobin=new TestFields("text","Haemoglobin","cbhTest.heamoglobin","M 13.0-18.0 gms% F 11.0-16.0 gms%","gms%","");
		TestFields tlcCount=new TestFields("text","TLC Count","cbhTest.tlcCount","4000-10000/cmm","cmm","");
		TestFields esrTest=new TestFields("text","E.S.R","cbhTest.esr","0-20mm/hr","mm/hr","");
		TestFields plateletCount=new TestFields("text","Platelet Count","cbhTest.plateletCount","1.4-4.4 lakhs/cmm","laksh/cmm","");
		TestFields rbcCount=new TestFields("text","R B C Count","cbhTest.rbcCount","4.3-5.5 million/cmm","million/cmm","");
		TestFields pcv=new TestFields("text","P.C.V","cbhTest.pcv","42-52 %","%","");
		TestFields mcv=new TestFields("text","MCV","cbhTest.mcv","80-100 fl","fl","");
		TestFields mch=new TestFields("text","MCH","cbhTest","27-31 pg","pg","");
		TestFields mchc=new TestFields("text","MCHC","cbhTest","32-36 %","%","");
		
		
		session.save(cbhHiddenParam);
		session.save(heamoglobin);
		session.save(tlcCount);
		session.save(esrTest);
		session.save(plateletCount);
		session.save(rbcCount);
        session.save(pcv);
        session.save(mcv);
        session.save(mch);
        session.save(mchc);

		List<TestFields> cbhTestFieldList=new ArrayList<TestFields>();
		cbhTestFieldList.add(cbhHiddenParam);
		cbhTestFieldList.add(heamoglobin);
		cbhTestFieldList.add(tlcCount);
		cbhTestFieldList.add(esrTest);
		cbhTestFieldList.add(plateletCount);
		cbhTestFieldList.add(rbcCount);
		cbhTestFieldList.add(pcv);
		cbhTestFieldList.add(mcv);
		cbhTestFieldList.add(mch);
		cbhTestFieldList.add(mchc);
		
		TestFee cbhTest=new TestFee();
		cbhTest.setTestName("CH");
		cbhTest.setDescription("Complete Haemogram");
		cbhTest.setCategory("Hematology");
		cbhTest.setIndividualTestEnum(IndividualTestEnum.Y);
		cbhTest.setFee(250.0);
		cbhTest.setTestFields(cbhTestFieldList);
		cbhTest.setTestFeeList(testFeeList);
		
		session.save(cbhTest);
		
//==================================================================CMPLTE HAEMOGRAM TEST	END		
		
//====================================================================BIO CHEMISTRY START
		TestFields serumEletrolytesHiddenParam=new TestFields("hidden","","serumEletrolytes.testFee.id","","","");
		TestFields sodium=new TestFields("text","Sodium","serumEletrolytes.sodium"," 135-155 mmol/L","mmol/L","");
		TestFields potassium=new TestFields("text","Potassium","serumEletrolytes.potassium"," 3.5-5.5 mmol/L","mmol/L","");
		TestFields chlorides =new TestFields("text","Chlorides","serumEletrolytes.chlorides","98-107 mmolg/L","mmol/L","");
		
		session.save(serumEletrolytesHiddenParam);
		session.save(sodium);
		session.save(potassium);
		session.save(chlorides);
		
		List<TestFields> serumTestFieldList=new ArrayList<TestFields>();
		serumTestFieldList.add(sodium);
		serumTestFieldList.add(potassium);
		serumTestFieldList.add(chlorides);
		serumTestFieldList.add(serumEletrolytesHiddenParam);
		
		TestFee serum=new TestFee();
		serum.setTestName("Serum Electrolytes");
		serum.setDescription("Serum Electrolytes");
		serum.setCategory("BIO-CHEMISTRY");
		serum.setIndividualTestEnum(IndividualTestEnum.Y);
		serum.setFee(300.0);
		serum.setTestFields(serumTestFieldList);
		session.save(serum);
		
		TestFields serumTHiddenParam=new TestFields("hidden","","serumTTest.testFee.id","","","");
		TestFields serumBilirubinT=new TestFields("text","Serum Bilirubin(T)","serumTTest.serumBilirubinT","0.4-1.0 mg/dl","mg/dl","");
		TestFields serumBilurubinD =new TestFields("text","Serum Bilirubin(D)","serumTTest.serumBilurubinD","0.0-0.4 mg/dl","mg/dl","");
		
		session.save(serumBilurubinD);
		session.save(serumBilirubinT);
		session.save(serumTHiddenParam);
		
		List<TestFields> SerumTDlist=new ArrayList<TestFields>();
		SerumTDlist.add(serumBilirubinT);
		SerumTDlist.add(serumBilurubinD);
		SerumTDlist.add(serumTHiddenParam);
		
		TestFee serumT=new TestFee();
		serumT.setCategory("BIO-CHEMISTRY");
		serumT.setIndividualTestEnum(IndividualTestEnum.Y);
		serumT.setDescription("Serum Bilirubin");
		serumT.setTestName("Serum Bilirubin Total & Direct");
		serumT.setFee(100.0);
		serumT.setTestFields(SerumTDlist);
		session.save(serumT);
		
		List<TestFee> lftTestFee=new ArrayList<TestFee>();
		lftTestFee.add(serumT);
	
		TestFields lftTestHiddenParam=new TestFields("hidden","","lftTest.testFee.id","","","");
		TestFields totalProteins=new TestFields("text","Total Proteins","lftTest.totalProteins","6.0-8.0 gms/dl","gms/dl","");
		TestFields albumin=new TestFields("text","Albumin","lftTest.albumin","2.5-5.5 gms/dl","gms/dl","");
		TestFields globulin=new TestFields("text","Globulin","lftTest.globulin","","","");
		TestFields agRatio=new TestFields("text","A/G Ratio","lftTest.agRatio","","","");
		
		session.save(lftTestHiddenParam);
		session.save(totalProteins);
		session.save(albumin);
		session.save(globulin);
		session.save(agRatio);
		
		List<TestFields> lftTestFieldsList=new ArrayList<TestFields>();
		
		lftTestFieldsList.add(lftTestHiddenParam);
		lftTestFieldsList.add(totalProteins);
		lftTestFieldsList.add(albumin);
		lftTestFieldsList.add(globulin);
		lftTestFieldsList.add(agRatio);
		
		TestFee lft=new TestFee();
		lft.setTestName("L.F.T");
		lft.setDescription("Liver Function Test");
		lft.setCategory("BIO-CHEMISTRY");
		lft.setIndividualTestEnum(IndividualTestEnum.Y);
		lft.setFee(400.0);
		lft.setTestFields(lftTestFieldsList);
		lft.setTestFeeList(lftTestFee);
		session.save(lft);
		
		TestFields fastingBloodSugarHiddenParam=new TestFields("hidden","","fbsTest.testFee.id","","","");		
		TestFields fastingBloodSugar=new TestFields("text","Fasting Blood Sugar","fbsTest.fastingBloodSugar","70-110 mg/dl","mg/dl","");
		session.save(fastingBloodSugar);
		session.save(fastingBloodSugarHiddenParam);
		
		List<TestFields> fbsTestList=new ArrayList<TestFields>();
		fbsTestList.add(fastingBloodSugar);
		fbsTestList.add(fastingBloodSugarHiddenParam);
		
		TestFee fbsTest=new TestFee();
		fbsTest.setCategory("BIO-CHEMISTRY");
		fbsTest.setTestName("FBS");
		fbsTest.setDescription("Fasting Blood Sugar");
		fbsTest.setFee(30.0);
		fbsTest.setIndividualTestEnum(IndividualTestEnum.Y);
		fbsTest.setTestFields(fbsTestList);
		session.save(fbsTest);
		
		TestFields ppBloodSugarHiddenParam=new TestFields("hidden","","ppBloodSugarTest.testFee.id","","","");		
		TestFields ppBloodSugar =new TestFields("text","P.P BloodSugar","ppBloodSugarTest.ppBloodSugar","70-140 mg/dl","mgd/dl","");
		session.save(ppBloodSugar);
		session.save(ppBloodSugarHiddenParam);
		
		List<TestFields> ppbloodSugarTestFields=new ArrayList<TestFields>();
		ppbloodSugarTestFields.add(ppBloodSugar);
		ppbloodSugarTestFields.add(ppBloodSugarHiddenParam);
		
		TestFee ppBloodSugarTest=new TestFee();
		ppBloodSugarTest.setCategory("BIO-CHEMISTRY");
		ppBloodSugarTest.setDescription("P.P Blood Sugar");
		ppBloodSugarTest.setIndividualTestEnum(IndividualTestEnum.Y);
		ppBloodSugarTest.setTestName("PPBS");
		ppBloodSugarTest.setFee(30.0);
		ppBloodSugarTest.setTestFields(ppbloodSugarTestFields);
		session.save(ppBloodSugarTest);
		
		TestFields randomBloodSugarHiddenParam=new TestFields("hidden","","randomBloodSugarTest.testFee.id","","","");		
		TestFields randomBloodSugar=new TestFields("text","Random blood Sugar","randomBloodSugarTest.randomBloodSugar","70-140 mg/dl","mg/dl","");
		session.save(randomBloodSugar);
		session.save(randomBloodSugarHiddenParam);
		
		List<TestFields> randomBloodSugarTestFields=new ArrayList<TestFields>();
		randomBloodSugarTestFields.add(randomBloodSugar);
		randomBloodSugarTestFields.add(randomBloodSugarHiddenParam);
		
		TestFee randomBloodSugarTest=new TestFee();
		randomBloodSugarTest.setCategory("BIO-CHEMISTRY");
		randomBloodSugarTest.setDescription("Random Blood Sugar");
		randomBloodSugarTest.setIndividualTestEnum(IndividualTestEnum.Y);
		randomBloodSugarTest.setTestName("RBS");
		randomBloodSugarTest.setFee(30.0);
		randomBloodSugarTest.setTestFields(randomBloodSugarTestFields);
		session.save(randomBloodSugarTest);
		
		
		
		
		TestFields bloodUreaHiddenParam=new TestFields("hidden","","bloodUreaTest.testFee.id","","","");		
		TestFields bloodUrea=new TestFields("text","Blood Urea","bloodUreaTest.bloodUrea","10-40 mg/dl","mg/dl","");
		session.save(bloodUrea);
		session.save(bloodUreaHiddenParam);
		
		List<TestFields> bloodAreaTestFields=new ArrayList<TestFields>();
		bloodAreaTestFields.add(bloodUrea);
		bloodAreaTestFields.add(bloodUreaHiddenParam);
		
		TestFee bloodUreaTest=new TestFee();
		bloodUreaTest.setCategory("BIO-CHEMISTRY");
		bloodUreaTest.setDescription("Blood Urea");
		bloodUreaTest.setIndividualTestEnum(IndividualTestEnum.Y);
		bloodUreaTest.setTestName("Blood Urea");
		bloodUreaTest.setFee(100.0);
		bloodUreaTest.setTestFields(bloodAreaTestFields);
		session.save(bloodUreaTest);
		
		
		
		
		
		TestFields serumCreatinineHiddenParam=new TestFields("hidden","","serumCreatinineTest.testFee.id","","","");		
		TestFields serumCreatinine=new TestFields("text","Serum Creatinine","serumCreatinineTest.serumCreatinine","0.6-1.3 mg/dl","mg/dl","");
		
		session.save(serumCreatinine);
		session.save(serumCreatinineHiddenParam);
		
		List<TestFields> serumCreatinineTestFields=new ArrayList<TestFields>();
		serumCreatinineTestFields.add(serumCreatinine);
		serumCreatinineTestFields.add(serumCreatinineHiddenParam);
		
		TestFee serumCreatinineTest=new TestFee();
		serumCreatinineTest.setCategory("BIO-CHEMISTRY");
		serumCreatinineTest.setDescription("Serum Creatinine");
		serumCreatinineTest.setIndividualTestEnum(IndividualTestEnum.Y);
		serumCreatinineTest.setTestName("S.Creatinine");
		serumCreatinineTest.setFee(100.0);
		serumCreatinineTest.setTestFields(serumCreatinineTestFields);
		session.save(serumCreatinineTest);
		
		TestFields sgotHiddenParam=new TestFields("hidden","","sgotTest.testFee.id","","","");		
		TestFields sgot=new TestFields("text","S.G.O.T","sgotTest.sgot"," 5-50 IU/L","IU/L","");
		
		session.save(sgot);
		session.save(sgotHiddenParam);
		
		List<TestFields> sgotTestFields=new ArrayList<TestFields>();
		sgotTestFields.add(sgot);
		sgotTestFields.add(sgotHiddenParam);
		
		TestFee sgotTest=new TestFee();
		sgotTest.setCategory("BIO-CHEMISTRY");
		sgotTest.setDescription("SGOT");
		sgotTest.setIndividualTestEnum(IndividualTestEnum.Y);
		sgotTest.setTestName("SGOT");
		sgotTest.setFee(100.0);
		sgotTest.setTestFields(sgotTestFields);
		session.save(sgotTest);
		
		
		TestFields sgptHiddenParam=new TestFields("hidden","","sgptTest.testFee.id","","","");		
		TestFields sgpt=new TestFields("text","S.G.P.T","sgptTest.sgpt"," 5-50 IU/L","IU/L","");
		
		session.save(sgpt);
		session.save(sgptHiddenParam);
		
		List<TestFields> sgptTestFields=new ArrayList<TestFields>();
		sgptTestFields.add(sgpt);
		sgptTestFields.add(sgptHiddenParam);
		
		TestFee sgptTest=new TestFee();
		sgptTest.setCategory("BIO-CHEMISTRY");
		sgptTest.setDescription("SGPT");
		sgptTest.setIndividualTestEnum(IndividualTestEnum.Y);
		sgptTest.setTestName("SGPT");
		sgptTest.setFee(100.0);
		sgptTest.setTestFields(sgptTestFields);
		session.save(sgptTest);
		
		TestFields alpHiddenParam=new TestFields("hidden","","alpTest.testFee.id","","","");		
		TestFields alp=new TestFields("text","A.L.P","alpTest.alp"," 25-125 IU/L","IU/L","");
		

		session.save(alp);
		session.save(alpHiddenParam);
		
		List<TestFields> alpTestFields=new ArrayList<TestFields>();
		alpTestFields.add(alp);
		alpTestFields.add(alpHiddenParam);
		
		TestFee alpTest=new TestFee();
		alpTest.setCategory("BIO-CHEMISTRY");
		alpTest.setDescription("ALP");
		alpTest.setIndividualTestEnum(IndividualTestEnum.Y);
		alpTest.setTestName("A.L.P");
		alpTest.setFee(100.0);
		alpTest.setTestFields(alpTestFields);
		session.save(alpTest);
		
		
		TestFields serumCalciumHiddenParam=new TestFields("hidden","","serumCalciumTest.testFee.id","","","");		
		TestFields serumCalcium =new TestFields("text","Serum Calcium","serumCalciumTest.serumCalcium","8.5-10.5 mg/dl","mg/dl","");
          
		session.save(serumCalcium);
		session.save(serumCalciumHiddenParam);
		
		List<TestFields> serumCalciumTestFields=new ArrayList<TestFields>();
		serumCalciumTestFields.add(serumCalcium);
		serumCalciumTestFields.add(serumCalciumHiddenParam);
		
		TestFee serumCalciumTest=new TestFee();
		serumCalciumTest.setCategory("BIO-CHEMISTRY");
		serumCalciumTest.setDescription("Serum Calcium");
		serumCalciumTest.setIndividualTestEnum(IndividualTestEnum.Y);
		serumCalciumTest.setTestName("S.Calcium");
		serumCalciumTest.setFee(100.0);
		serumCalciumTest.setTestFields(serumCalciumTestFields);
		session.save(serumCalciumTest);
		

		TestFields ionisedCalciumHiddenParam=new TestFields("hidden","","ionisedCalciumTest.testFee.id","","","");		
		TestFields ionisedCalcium=new TestFields("text","Ionised calcium","ionisedCalciumTest.ionisedCalcium","1.1-1.4 mmol/L","mmol/L","");
		
		session.save(ionisedCalcium);
		session.save(ionisedCalciumHiddenParam);
		
		List<TestFields> ionisedCalciumTestFields=new ArrayList<TestFields>();
		ionisedCalciumTestFields.add(ionisedCalcium);
		ionisedCalciumTestFields.add(ionisedCalciumHiddenParam);
		
		TestFee ionisedCalciumTest=new TestFee();
		ionisedCalciumTest.setCategory("BIO-CHEMISTRY");
		ionisedCalciumTest.setDescription("Ionised calcium");
		ionisedCalciumTest.setIndividualTestEnum(IndividualTestEnum.Y);
		ionisedCalciumTest.setTestName("I.Calcium");
		ionisedCalciumTest.setFee(100.0);
		ionisedCalciumTest.setTestFields(ionisedCalciumTestFields);
		session.save(ionisedCalciumTest);
		
		TestFields ionisedCalciumMgHiddenParam=new TestFields("hidden","","ionisedCalciumMgTest.testFee.id","","","");		
		TestFields ionisedCalciumMg = new TestFields("text","Ionised Calcium Mg","ionisedCalciumMgTest.ionisedCalciumMg","4.4-5.6 mg/dl","mg/dl","");
		
		session.save(ionisedCalciumMg);
		session.save(ionisedCalciumMgHiddenParam);
		
		List<TestFields> ionisedCalciumMgTestFields=new ArrayList<TestFields>();
		ionisedCalciumMgTestFields.add(ionisedCalciumMg);
		ionisedCalciumMgTestFields.add(ionisedCalciumMgHiddenParam);
		
		TestFee ionisedCalciumMgTest=new TestFee();
		ionisedCalciumMgTest.setCategory("BIO-CHEMISTRY");
		ionisedCalciumMgTest.setDescription("Ionised calcium Mg");
		ionisedCalciumMgTest.setIndividualTestEnum(IndividualTestEnum.Y);
		ionisedCalciumMgTest.setTestName("I.CalciumMg");
		ionisedCalciumMgTest.setFee(100.0);
		ionisedCalciumMgTest.setTestFields(ionisedCalciumMgTestFields);
		session.save(ionisedCalciumMgTest);
		
		TestFields serumAmylaseHiddenParam=new TestFields("hidden","","serumAmylaseTest.testFee.id","","","");		
		TestFields serumAmylase=new TestFields("text","Serum Amylase","serumAmylaseTest.serumAmylase","25-125 IU/L","IU/L","");
		session.save(serumAmylase);
		session.save(serumAmylaseHiddenParam);
		
		List<TestFields> serumAmylaseTestTestFields=new ArrayList<TestFields>();
		serumAmylaseTestTestFields.add(serumAmylase);
		serumAmylaseTestTestFields.add(serumAmylaseHiddenParam);
		
		TestFee serumAmylaseTest=new TestFee();
		serumAmylaseTest.setCategory("BIO-CHEMISTRY");
		serumAmylaseTest.setDescription("Serum Amylase");
		serumAmylaseTest.setIndividualTestEnum(IndividualTestEnum.Y);
		serumAmylaseTest.setTestName("Serum Amylase");
		serumAmylaseTest.setFee(100.0);
		serumAmylaseTest.setTestFields(serumAmylaseTestTestFields);
		session.save(serumAmylaseTest);
		
		TestFields cpkHiddenParam=new TestFields("hidden","","cpkTest.testFee.id","","","");		
		TestFields cpk=new TestFields("text","CPK","cpkTest.cpk","25-125 IU/L","IU/L","");
		

		session.save(cpk);
		session.save(cpkHiddenParam);
		
		List<TestFields> cpkTestFields=new ArrayList<TestFields>();
		cpkTestFields.add(cpk);
		cpkTestFields.add(cpkHiddenParam);
		
		TestFee cpkTest=new TestFee();
		cpkTest.setCategory("BIO-CHEMISTRY");
		cpkTest.setDescription("CPK");
		cpkTest.setIndividualTestEnum(IndividualTestEnum.Y);
		cpkTest.setTestName("CPK");
		cpkTest.setFee(100.0);
		cpkTest.setTestFields(cpkTestFields);
		session.save(cpkTest);
		
		TestFields cpkMbHiddenParam=new TestFields("hidden","","cpkMbTest.testFee.id","","","");		
		TestFields cpkMb=new TestFields("text","CPK-MB","cpkMbTest.cpkMb","0-25 IU/L","IU/L","");
		
		session.save(cpkMb);
		session.save(cpkMbHiddenParam);
			
			List<TestFields> cpkMbTestFields=new ArrayList<TestFields>();
			cpkMbTestFields.add(cpkMb);
			cpkMbTestFields.add(cpkMbHiddenParam);
			
			TestFee cpkMbTest=new TestFee();
			cpkMbTest.setCategory("BIO-CHEMISTRY");
			cpkMbTest.setDescription("CPK-MB");
			cpkMbTest.setIndividualTestEnum(IndividualTestEnum.Y);
			cpkMbTest.setTestName("CPK-MB");
			cpkMbTest.setFee(100.0);
			cpkMbTest.setTestFields(cpkMbTestFields);
			session.save(cpkMbTest);
			
			TestFields serumUricAcidHiddenParam=new TestFields("hidden","","serumUricAcidTest.testFee.id","","","");		
			TestFields serumUricAcid=new TestFields("text","Serum Uric Acid","serumUricAcidTest.serumUricAcid","M 3.5-7.2 mg/dl F 3.5-6.2 mg/dl","mg/dl","");
			

			session.save(serumUricAcid);
			session.save(serumUricAcidHiddenParam);
			
			List<TestFields>serumUricAcidTestFields=new ArrayList<TestFields>();
			serumUricAcidTestFields.add(serumUricAcid);
			serumAmylaseTestTestFields.add(serumUricAcidHiddenParam);
			
			TestFee serumUricAcidTest=new TestFee();
			serumUricAcidTest.setCategory("BIO-CHEMISTRY");
			serumUricAcidTest.setDescription("Serum Uric Acid");
			serumUricAcidTest.setIndividualTestEnum(IndividualTestEnum.Y);
			serumUricAcidTest.setTestName("Serum Uric Acid");
			serumUricAcidTest.setFee(100.0);
			serumUricAcidTest.setTestFields(serumUricAcidTestFields);
			session.save(serumUricAcidTest);
			
	
			
		
	TestFields pseudoCholinesteraseHiddenParam=new TestFields("hidden","","pseudoCholinesteraseTest.testFee.id","","","");		
		
		TestFields pseudoCholinesterase=new TestFields("text","Pseudo Cholinesterase","pseudoCholinesteraseTest.pseudoCholinesterase","M 4620.0-11500.0 U/L F 3930-10800.0 U/L","U/L","");
		
		session.save(pseudoCholinesterase);
		session.save(pseudoCholinesteraseHiddenParam);
			
			List<TestFields> pseudoCholinesteraseTestFields=new ArrayList<TestFields>();
			pseudoCholinesteraseTestFields.add(pseudoCholinesterase);
			pseudoCholinesteraseTestFields.add(pseudoCholinesteraseHiddenParam);
			
			TestFee pseudoCholinesteraseTest=new TestFee();
			pseudoCholinesteraseTest.setCategory("BIO-CHEMISTRY");
			pseudoCholinesteraseTest.setDescription("Pseudo Cholinesterase");
			pseudoCholinesteraseTest.setIndividualTestEnum(IndividualTestEnum.Y);
			pseudoCholinesteraseTest.setTestName("Pseudo Cholinesterase");
			pseudoCholinesteraseTest.setFee(800.0);
			pseudoCholinesteraseTest.setTestFields(pseudoCholinesteraseTestFields);
			session.save(pseudoCholinesteraseTest);
			
			
			TestFields phosphorousHiddenParam=new TestFields("hidden","","phosphorousTest.testFee.id","","","");		
			TestFields phosphorous=new TestFields("text","Phosphorous","phosphorousTest.phosphorous","2.5-4.5 mg/dl","mg/dl","");
			

			session.save(phosphorous);
			session.save(phosphorousHiddenParam);
			
			List<TestFields> phosphorousTestFields=new ArrayList<TestFields>();
			phosphorousTestFields.add(phosphorous);
			phosphorousTestFields.add(phosphorousHiddenParam);
			
			TestFee phosphorousTest=new TestFee();
			phosphorousTest.setCategory("BIO-CHEMISTRY");
			phosphorousTest.setDescription("Phosphorous");
			phosphorousTest.setIndividualTestEnum(IndividualTestEnum.Y);
			phosphorousTest.setTestName("Phosphorous");
			phosphorousTest.setFee(250.0);
			phosphorousTest.setTestFields(phosphorousTestFields);
			session.save(phosphorousTest);
	

			TestFee abgTest=new TestFee();
			abgTest.setCategory("BIO-CHEMISTRY");
			abgTest.setDescription("ABG TEST");
			abgTest.setIndividualTestEnum(IndividualTestEnum.Y);
			abgTest.setTestName("ABG");
			abgTest.setFee(1800.0);
			session.save(abgTest);
			
			
			TestFee hevTest=new TestFee();
			hevTest.setCategory("BIO-CHEMISTRY");
			hevTest.setDescription("HEV TEST");
			hevTest.setIndividualTestEnum(IndividualTestEnum.Y);
			hevTest.setTestName("HEV");
			hevTest.setFee(800.0);
			session.save(hevTest);

			TestFee havTest=new TestFee();
			havTest.setCategory("BIO-CHEMISTRY");
			havTest.setDescription("HAV TEST");
			havTest.setIndividualTestEnum(IndividualTestEnum.Y);
			havTest.setTestName("HAV");
			havTest.setFee(800.0);
			session.save(havTest);

		
//=======================================================================BIO CHEMISTRY END
	
	//=======================================================================CLINICAL PATHOLOGY
			TestFields urineExaminationHiddenParam=new TestFields("hidden","","urineExaminationTest.testFee.id","","","");		
			TestFields spGravity=new TestFields("text","SP.Gravity","urineExaminationTest.spGravity","","","");		
			TestFields colourAppearance=new TestFields("text","Colour & Appearance","urineExaminationTest.colourAppearance","","","");
			TestFields reaction=new TestFields("text","reaction","urineExaminationTest.reaction","","","");
			TestFields urinAlbumin=new TestFields("text","albumin","urineExaminationTest.albumin","","","");
		
			TestFields sugar=new TestFields("text","Sugar","urineExaminationTest.sugar","","","");
			TestFields ketones=new TestFields("text","Ketones","urineExaminationTest.ketones","","","");
			TestFields bileSalts=new TestFields("text","Bile Salts","urineExaminationTest.bileSalts","","","");
			TestFields bilePigments=new TestFields("text","Bile Pigments","urineExaminationTest.bilePigments","","","");
			TestFields urobilinogen=new TestFields("text","Urobilinogen","urineExaminationTest.urobilinogen","","","");
			TestFields micro=new TestFields("text","","urineExaminationTest.micro","","","");
		
			session.save(urineExaminationHiddenParam);
			session.save(spGravity);
			session.save(colourAppearance);
			session.save(reaction);
			session.save(urinAlbumin);
			session.save(sugar);
			session.save(ketones);
			session.save(bileSalts);
			session.save(bilePigments);
			session.save(urobilinogen);
			session.save(micro);

			
			List<TestFields> urineExaminationTestFieldList=new ArrayList<TestFields>();
			urineExaminationTestFieldList.add(urineExaminationHiddenParam);
			urineExaminationTestFieldList.add(spGravity);
			urineExaminationTestFieldList.add(colourAppearance);
			urineExaminationTestFieldList.add(reaction);
			urineExaminationTestFieldList.add(urinAlbumin);
			urineExaminationTestFieldList.add(sugar);
			urineExaminationTestFieldList.add(ketones);
			urineExaminationTestFieldList.add(bileSalts);
			urineExaminationTestFieldList.add(bilePigments);
			urineExaminationTestFieldList.add(urobilinogen);
			urineExaminationTestFieldList.add(micro);
			
			
			TestFee urineExaminationTest=new TestFee();
			urineExaminationTest.setTestName("Urine Examination");
			urineExaminationTest.setDescription("Urine Examination");
			urineExaminationTest.setCategory("ClinicalPathology");
			urineExaminationTest.setIndividualTestEnum(IndividualTestEnum.Y);
			urineExaminationTest.setFee(30.0);
			urineExaminationTest.setTestFields(urineExaminationTestFieldList);
			session.save(urineExaminationTest);
			  
	      	
	
//=================================================================================clinical pathology end
//====================================================================================SEROLOGY STRART
			TestFields widalHiddenParam=new TestFields("hidden","","widalTest.testFee.id","","","");		
			TestFields o=new TestFields("text","O","widalTest.o","","","");		
			TestFields h=new TestFields("text","H","widalTest.h","","%","");
			TestFields ah=new TestFields("text","AH","widalTest.ah","","%","");
			TestFields bh=new TestFields("text","BH","widalTest.bh","","%","");
			session.save(o);
			session.save(h);
			session.save(ah);
			session.save(bh);
			session.save(widalHiddenParam);
			
			List<TestFields> widalTestFields=new ArrayList<TestFields>();
			widalTestFields.add(widalHiddenParam);
			widalTestFields.add(o);
			widalTestFields.add(h);
			widalTestFields.add(ah);
			widalTestFields.add(bh);
			
			TestFee widalTest=new TestFee();
			widalTest.setTestName("Widal Test");
			widalTest.setDescription("Widal Test");
			widalTest.setCategory("Serology");
			widalTest.setIndividualTestEnum(IndividualTestEnum.Y);
			widalTest.setFee(100.0);
			widalTest.setTestFields(widalTestFields);
			session.save(widalTest);
			
			
			/*List<TestFee> widalTtestFeeList=new ArrayList<TestFee>();
			widalTtestFeeList.add(widalTest);*/
			
			TestFields dengueHiddenParam=new TestFields("hidden","","dengueTest.testFee.id","","","");		
			TestFields dengueNsAntigen=new TestFields("text","Dengue NS1 Antigen","dengueTest.dengueNsAntigen","","","");	
			
			TestFields dengueIgG=new TestFields("text","Dengue IgG","DengueTest.dengueIgG","","","");	
			
			TestFields dengueIgM=new TestFields("text","DEngue IgM","dengueTest.dengueIgM","","","");
    
            session.save(dengueHiddenParam);
			session.save(dengueNsAntigen);
			session.save(dengueIgG);
			session.save(dengueIgM);
	
			List<TestFields> dengueTestFieldList=new ArrayList<TestFields>();
			dengueTestFieldList.add(dengueHiddenParam);
			dengueTestFieldList.add(dengueNsAntigen);
			dengueTestFieldList.add(dengueIgG);
			dengueTestFieldList.add(dengueIgM);
	
			TestFee dengueTest=new TestFee();
			dengueTest.setTestName("Dengue Test");
			dengueTest.setDescription("Dengue Test");
			dengueTest.setCategory("Serology");
		    dengueTest.setIndividualTestEnum(IndividualTestEnum.Y);
		    dengueTest.setFee(700.0);
		    dengueTest.setTestFields(dengueTestFieldList);
			session.save(dengueTest);
	
	
			List<TestFee> dengueTestFeeList=new ArrayList<TestFee>();
			dengueTestFeeList.add(dengueTest);
    
			TestFields viralAntibodiesHiddenParam=new TestFields("hidden","","viralAntibodiesTest.testFee.id","","","");		
			TestFields viralAntibodies=new TestFields("text","Viral Antibodies","viralAntibodiesTest.viralAntibodies","","","");
				
			session.save(viralAntibodies);
			session.save(viralAntibodiesHiddenParam);
				
			List<TestFields> viralAntibodiesTestFields=new ArrayList<TestFields>();
			viralAntibodiesTestFields.add(viralAntibodies);
			viralAntibodiesTestFields.add(viralAntibodiesHiddenParam);
				
			TestFee viralAntibodiesTest=new TestFee();
			viralAntibodiesTest.setCategory("Serology");
			viralAntibodiesTest.setDescription("Viral Antibodies");
			viralAntibodiesTest.setIndividualTestEnum(IndividualTestEnum.Y);
			viralAntibodiesTest.setTestName("Viral Antibodies");
			viralAntibodiesTest.setFee(0.0);
			viralAntibodiesTest.setTestFields(viralAntibodiesTestFields);
			session.save(viralAntibodiesTest);
	   
			TestFields hbsAgHiddenParam=new TestFields("hidden","","hbsAgTest.testFee.id","","","");		
			TestFields hbsAg=new TestFields("text","Hbs Ag","hbsAgTest.hbsAg","","","");
			session.save(hbsAg);
			session.save(hbsAgHiddenParam);
			
			List<TestFields> hbsAgTestFields=new ArrayList<TestFields>();
			hbsAgTestFields.add(hbsAg);
			hbsAgTestFields.add(hbsAgHiddenParam);
			
			TestFee hbsAgTest=new TestFee();
			hbsAgTest.setCategory("Serology");
			hbsAgTest.setDescription("Hbs Ag");
			hbsAgTest.setIndividualTestEnum(IndividualTestEnum.Y);
			hbsAgTest.setTestName("Hbs Ag");
			hbsAgTest.setFee(200.0);
			hbsAgTest.setTestFields(hbsAgTestFields);
			session.save(hbsAgTest);
			
			TestFields ctniTropiHiddenParam=new TestFields("hidden","","ctniTropiTest.testFee.id","","","");		
			TestFields ctniTropi=new TestFields("text","CTnI Trop-I","ctniTropiTest.ctniTropi","","","");
			session.save(ctniTropi);
			session.save(ctniTropiHiddenParam);
			
			
			List<TestFields> ctniTropiTestFields=new ArrayList<TestFields>();
			ctniTropiTestFields.add(ctniTropi);
			ctniTropiTestFields.add(ctniTropiHiddenParam);
			
			TestFee ctniTropiTest=new TestFee();
			ctniTropiTest.setCategory("Serology");
			ctniTropiTest.setDescription("CTnI Trop-I");
			ctniTropiTest.setIndividualTestEnum(IndividualTestEnum.Y);
			ctniTropiTest.setTestName("CTnI Trop-I");
			ctniTropiTest.setFee(600.0);
			ctniTropiTest.setTestFields(ctniTropiTestFields);
			session.save(ctniTropiTest);
	
			TestFields raFactorHiddenParam=new TestFields("hidden","","raFactorTest.testFee.id","","","");		
			TestFields raFactor=new TestFields("text","R.A.Factor","raFactorTest.raFactor","","","");
			session.save(raFactor);
			session.save(raFactorHiddenParam);
				
			List<TestFields>raFactorTestFields=new ArrayList<TestFields>();
			raFactorTestFields.add(raFactor);
			raFactorTestFields.add(raFactorHiddenParam);
				
			TestFee raFactorTest=new TestFee();
			raFactorTest.setCategory("Serology");
			raFactorTest.setDescription("R.A.Factor");
			raFactorTest.setIndividualTestEnum(IndividualTestEnum.Y);
			raFactorTest.setTestName("R.A.Factor");
			raFactorTest.setFee(80.0);
			raFactorTest.setTestFields(raFactorTestFields);
			session.save(raFactorTest);
			
			TestFields crpHiddenParam=new TestFields("hidden","","crpTest.testFee.id","","","");		
			TestFields crp=new TestFields("text","CRP","crpTest.crp","","","");
			session.save(crp);
			session.save(crpHiddenParam);
				
			List<TestFields> crpTestFields=new ArrayList<TestFields>();
		     crpTestFields.add(crp);
		     crpTestFields.add(crpHiddenParam);
			 	
			TestFee crpTest=new TestFee();
			crpTest.setCategory("Serology");
			crpTest.setDescription("CRP");
			crpTest.setIndividualTestEnum(IndividualTestEnum.Y);
			crpTest.setTestName("CRP");
			crpTest.setFee(150.0);
			crpTest.setTestFields(crpTestFields);
			session.save(crpTest);
			
			TestFields asoHiddenParam=new TestFields("hidden","","asoTest.testFee.id","","","");			
			TestFields aso=new TestFields("text","ASO","asoTest.aso","","","");
			session.save(aso);
			session.save(asoHiddenParam);
				
			List<TestFields>asoTestFields=new ArrayList<TestFields>();
			asoTestFields.add(aso);
			asoTestFields.add(asoHiddenParam);
				
			TestFee asoTest=new TestFee();
			asoTest.setCategory("Serology");
			asoTest.setDescription("ASO");
			asoTest.setIndividualTestEnum(IndividualTestEnum.Y);
			asoTest.setTestName("ASO");
			asoTest.setFee(100.0);
			asoTest.setTestFields(asoTestFields);
			session.save(asoTest);
				
			TestFields chikengunyaHiddenParam=new TestFields("hidden","","chikengunyaTest.testFee.id","","","");		
			TestFields chikengunya=new TestFields("text","Chikengunya","chikengunyaTest.chikengunya","","","");

			session.save(chikengunya);
			session.save(chikengunyaHiddenParam);
					
			List<TestFields>chikengunyaTestFields=new ArrayList<TestFields>();
			chikengunyaTestFields.add(chikengunya);
			chikengunyaTestFields.add(chikengunyaHiddenParam);
					
			TestFee chikengunyaTest=new TestFee();
			chikengunyaTest.setCategory("Serology");
			chikengunyaTest.setDescription("Chikengunya Test");
			chikengunyaTest.setIndividualTestEnum(IndividualTestEnum.Y);
			chikengunyaTest.setTestName("Chikengunya Test");
			chikengunyaTest.setFee(0.0);
			chikengunyaTest.setTestFields(chikengunyaTestFields);
			session.save(chikengunyaTest);
					
			TestFields vdrlHiddenParam=new TestFields("hidden","","vdrlTest.testFee.id","","","");				
			TestFields vdrl=new TestFields("text","VDRL","vdrlTest.vdrl","","","");
			session.save(vdrl);
			session.save(vdrlHiddenParam);
						
			List<TestFields> vdrlTestFields=new ArrayList<TestFields>();
			vdrlTestFields.add(vdrl);
			vdrlTestFields.add(vdrlHiddenParam);
						
			TestFee vdrlTest=new TestFee();
			vdrlTest.setCategory("Serology");
			vdrlTest.setDescription("VDRL");
			vdrlTest.setIndividualTestEnum(IndividualTestEnum.Y);
			vdrlTest.setTestName("VDRL");
			vdrlTest.setFee(0.0);
			vdrlTest.setTestFields(vdrlTestFields);
			session.save(vdrlTest);
		
			//======================================================================================SEROLOGY END
			
	        session.getTransaction().commit();
	        session.close();

	}		

			
	private static void insertIdCreator() throws Exception{
		SessionFactory sessionFactory=getSessionFatory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		IdCreator idCreator=new IdCreator();
		idCreator.setId(1l);
		Date date = new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
		idCreator.setDate(formatter.parse(formatter.format(date)));
		idCreator.setPresentValue(0l);
		session.save(idCreator);
		session.getTransaction().commit();
		session.close();
		
	}
	
	public static void idGeneratorTest(){
		//RegIdGenerator regIdGenerator=new RegIdGenerator();
		/*Date date = new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("yyMMdd");
		
		System.out.println(formatter.format(date));*/
	}
	
	public static void insertConsultant(){
		SessionFactory factory=getSessionFatory();
		System.out.println(factory);
		Consultant consultant=new Consultant();
		consultant.setName("Raghu");
		Consultant consultant1=new Consultant();
		consultant1.setName("sachin");
		Session session= factory.openSession();
		session.beginTransaction();
		session.save(consultant);
		
	/*	PatientDetails patientDetails= new PatientDetails();
		patientDetails.setAddress("Test Addrs");
		patientDetails.setCity("Test City");
		patientDetails.setContactNo("9898998");
		patientDetails.setEmergencyContact("Emrgnecy 108");
		patientDetails.setGenderEnum(GenderEnum.MALE);
		patientDetails.setGuardianName("Test Guaridain");
		patientDetails.setIsArogyaSree(false);
		patientDetails.setMaritalStatusEnum(MaritalStatusEnum.UNMARRIED);
		patientDetails.setPatientName("Test Name ABC");
		session.save(patientDetails);
		Branch brnach= new Branch();
		brnach.setBranchName("Test Branch");
		brnach.setLocation("Test Location");
		session.save(brnach);
		
		Ward ward= new Ward();
		ward.setBranch(brnach);
		ward.setDescription("Test Desc");
		session.save(ward);
		
		Bed bed= new Bed();
		bed.setBedNum("123");
		bed.setFee(100d);
		bed.setIsAvailability(false);
		bed.setWard(ward);
		session.save(bed);
		
		Patient patient=new Patient();
		patient.setPatientDetails(patientDetails);
		patient.setPatientTypeEnum(PatientTypeEnum.IP);
		patient.setRegistrationDate(new Date());
		Date date= new Date();
		date.setDate(2);
		patient.setDischargeDate(date);
		patient.setBed(bed);
		session.save(patient);
		session.update(patient);
		
		*/	
		session.getTransaction().commit();
		session.close();
	}
	
	public static void insertTestData(){
		SessionFactory factory=getSessionFatory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		Consultant consultant =new Consultant();
		consultant.setName("ABCD");
		Consultant consultant2=new Consultant();
		consultant2.setName("XXYZ");
		session.save(consultant);
		session.save(consultant2);
		
		TestFields tf0=new TestFields();
		tf0.setFieldName("");
		tf0.setFieldType("hidden");
		tf0.setPropName("ptTest.testFee.id");
		session.save(tf0);
		
		TestFields tf1=new TestFields();
		tf1.setFieldName("Test");
		tf1.setFieldType("text");
		tf1.setPropName("ptTest.test");
		tf1.setUnits("Seconds");
		session.save(tf1);
		
		TestFields tf2=new TestFields();
		tf2.setFieldName("Control");
		tf2.setFieldType("text");
		tf2.setPropName("ptTest.contorl");
		tf2.setUnits("Seconds");
		session.save(tf2);

		TestFields tf3=new TestFields();
		tf3.setFieldName("INR");
		tf3.setFieldType("text");
		tf3.setPropName("ptTest.INR");
		session.save(tf3);
			
		List<TestFields> testFieldList=new ArrayList<TestFields>();
		testFieldList.add(tf0);
		testFieldList.add(tf1);
		testFieldList.add(tf2);
		testFieldList.add(tf3);
		
		TestFee pt=new TestFee();
		pt.setTestName("PT");
		pt.setDescription("Prothrobin Time");
		pt.setCategory("Hematology");
		pt.setFee(200.0);
		pt.setIndividualTestEnum(IndividualTestEnum.Y);
		pt.setTestFields(testFieldList);
		session.save(pt);
		
		/* ------- APTT start-------- */
		TestFields tf4=new TestFields();
		tf4.setFieldName("Test");
		tf4.setFieldType("text");
		tf4.setPropName("apttTest.test");
		tf4.setUnits("Seconds");
		session.save(tf4);

		TestFields tf5=new TestFields();
		tf5.setFieldName("Control");
		tf5.setFieldType("text");
		tf5.setPropName("apttTest.contorl");
		tf5.setUnits("Seconds");
		session.save(tf5);
			
		List<TestFields> testFieldList2=new ArrayList<TestFields>();
		testFieldList2.add(tf4);
		testFieldList2.add(tf5);
		
		TestFee pt2=new TestFee();
		pt2.setTestName("APTT"); 
		pt2.setDescription("Activted Partial Thromboplastin Time");
		pt2.setCategory("Hematology");
		pt2.setFee(250.0);
		pt2.setIndividualTestEnum(IndividualTestEnum.Y);
		pt2.setTestFields(testFieldList2);
		session.save(pt2);
		
		/* -------------APTT end----------- */
		
		/* -------------Stool Examination start--------*/
		
		TestFields tf6=new TestFields();
		tf6.setFieldName("macroscopic");
		tf6.setFieldType("text");
		tf6.setPropName("stollTest.macroscopic");
		session.save(tf6);

		TestFields tf7=new TestFields();
		tf7.setFieldName("reaction");
		tf7.setFieldType("text");
		tf7.setPropName("stollTest.reaction");
		session.save(tf7);
			
		TestFields tf8=new TestFields();
		tf8.setFieldName("microscopic");
		tf8.setFieldType("text");
		tf8.setPropName("stoolOccultBloodTest.microscopic");
		session.save(tf8);
		
		TestFields tf9=new TestFields();
		tf9.setFieldName("occultBlood");
		tf9.setFieldType("text");
		tf9.setPropName("stoolOccultBloodTest.occultBlood");
		session.save(tf9);
		
		List<TestFields> testFieldList3=new ArrayList<TestFields>();
		testFieldList3.add(tf6);
		testFieldList3.add(tf7);
		
		List<TestFields> testFieldList4=new ArrayList<TestFields>();
		testFieldList4.add(tf8);
		testFieldList4.add(tf9);
		
		TestFee pt3=new TestFee();
		pt3.setTestName("Stool Routine");
		pt3.setCategory("Hematology");
		pt3.setDescription("Stool Routine");
		pt3.setFee(150.0);
		pt3.setIndividualTestEnum(IndividualTestEnum.Y);
		pt3.setTestFields(testFieldList3);
		session.save(pt3);
		
		TestFee pt4=new TestFee();
		pt4.setTestName("Stool Occult Blood");
		pt4.setCategory("Hematology");
		pt4.setDescription("Stool Occult Blood");
		pt4.setIndividualTestEnum(IndividualTestEnum.Y);
		pt4.setFee(100.0);
		pt4.setTestFields(testFieldList4);
		session.save(pt4);
		/* ----------------Stool examintaion end-------------*/
		
		/* ------------Mantoux Test start---------------*/
		
		TestFields tf10=new TestFields();
		tf10.setFieldName("PPD Given Time");
		tf10.setFieldType("text");
		tf10.setDefaultValue("");
		tf10.setPropName("mantouxTest.inTime");
		session.save(tf10);

		TestFields tf11=new TestFields();
		tf11.setFieldName("Result Time");
		tf11.setFieldType("text");
		tf11.setDefaultValue("");
		tf11.setPropName("mantouxTest.observedTime");
		session.save(tf11);

		TestFields tf12=new TestFields();
		tf12.setFieldName("Result");
		tf12.setFieldType("text");
		tf12.setDefaultValue("No Induration");
		tf12.setPropName("mantouxTest.result");
		session.save(tf12);
		
		List<TestFields> testFieldList5=new ArrayList<TestFields>();
		testFieldList5.add(tf10);
		testFieldList5.add(tf11);
		testFieldList5.add(tf12);
		
		TestFee pt5=new TestFee();
		pt5.setTestName("Moantoux Screening Test");
		pt5.setCategory("Micro-Biology");
		pt5.setDescription("Moantoux Screening Test");
		pt5.setIndividualTestEnum(IndividualTestEnum.Y);
		pt5.setFee(100.0);
		pt5.setTestFields(testFieldList5);
		session.save(pt5);
		
		/* -------------Mantoux test end-------------*/
		/*--------------start*-----------------*/
		/*TestFields tf13=new TestFields();
		tf13.setFieldName("PPD Given Time");
		tf13.setFieldType("text");
		tf13.setDefaultValue("");
		tf13.setPropName("mantouxTest.inTime");
		session.save(tf13);
		
		TestFields tf14=new TestFields();
		tf14.setFieldName("PPD Given Time");
		tf14.setFieldType("text");
		tf14.setDefaultValue("");
		tf14.setPropName("mantouxTest.inTime");
		session.save(tf14);
		
		List<TestFields> testFieldList6=new ArrayList<TestFields>();
		testFieldList6.add(tf13);
		testFieldList6.add(tf14);
		
		TestFee pt6=new TestFee();
		pt6.setTestName("Moantoux Screening Test");
		pt6.setCategory("Serology");
		pt6.setDescription("Moantoux Screening Test");
		pt6.setFee(100.0);
		pt6.setTestFields(testFieldList6);
		session.save(pt6);		*/					
		/*--------------end--------------------*/
	
		session.getTransaction().commit();
		session.close();
	}
}
