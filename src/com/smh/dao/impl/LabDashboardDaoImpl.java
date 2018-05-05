package com.smh.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smh.dao.LabDashboardDao;
import com.smh.entity.Patient;
import com.smh.entity.PatientTest;
import com.smh.entity.TestFee;
import com.smh.entity.TestStatusEnum;
import com.smh.entity.test.PatientTestResult;
import com.smh.util.HibernateUtil;

@Repository("labDashboardDao")
public class LabDashboardDaoImpl implements LabDashboardDao {

	@Autowired
	HibernateUtil hibernateUtil;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<TestFee> listOfTest(){
		Session session= hibernateUtil.getSession();
		Criteria criteria =session.createCriteria(TestFee.class);
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<TestFee> list=criteria.list();
		return list;
	}

	public void savePatientTest(PatientTest patientTest) {
		Session session=hibernateUtil.getSession();
		session.save(patientTest);
	}

	public Patient getPatientById(Long id){
		Patient patient=null;
		Session session=hibernateUtil.getSession();
		patient=(Patient)session.get(Patient.class,id);
		return patient;
	}
	
	public TestFee getTestFeeById(Integer id) {
		Session session=hibernateUtil.getSession();
		TestFee testFee= (TestFee)session.get(TestFee.class,id);
		return testFee;
	}

	public PatientTest getPatientTest(Long id) {
		Session session= hibernateUtil.getSession();
		Criteria criteria =session.createCriteria(PatientTest.class);
		List<PatientTest> list=null;
		list=criteria.createCriteria("patientList").add(Restrictions.eq("id", id)).list();
		if(list!=null){
			return list.get(list.size()-1);
			
		}
		return null;
		
	}

	public List<PatientTest> getPatientTestList() {
		Session session=hibernateUtil.getSession();
		Criteria criteria=session.createCriteria(PatientTest.class);
		List<PatientTest> patientList=null;
		patientList=criteria.add(Restrictions.eq("status",TestStatusEnum.N)).list();
		return patientList;
	}

	public void savePatientTestResult(PatientTestResult patientTestResult) {
		Session session=hibernateUtil.getSession();
		PatientTest patientTest=(PatientTest)session.get(PatientTest.class,patientTestResult.getPatientTestId());
		patientTest.setStatus(TestStatusEnum.Y);
		session.saveOrUpdate(patientTest);
		
		if(patientTestResult.getPtTest()!=null){
			session.saveOrUpdate(patientTestResult.getPtTest());
		}
		if(patientTestResult.getApttTest()!=null){
			session.saveOrUpdate(patientTestResult.getApttTest());
		}
		if(patientTestResult.getStollTest()!=null){
			session.saveOrUpdate(patientTestResult.getStollTest());
		}
		if(patientTestResult.getStoolOccultBloodTest()!=null){
			session.saveOrUpdate(patientTestResult.getStoolOccultBloodTest());
		}
		if(patientTestResult.getMantouxTest()!=null){
			session.saveOrUpdate(patientTestResult.getMantouxTest());
		}
		if(patientTestResult.getCbpTest()!=null){
			session.saveOrUpdate(patientTestResult.getCbpTest());
		}
		if(patientTestResult.getDlcCount()!=null){
		    session.saveOrUpdate(patientTestResult.getDlcCount());
		}
	    if(patientTestResult.getCbhTest()!=null){
		    session.saveOrUpdate(patientTestResult.getCbhTest());
         }
         if(patientTestResult.getFbsTest()!=null){
	        session.saveOrUpdate(patientTestResult.getFbsTest());
         }
        if(patientTestResult.getPpBloodSugarTest()!=null){
            session.saveOrUpdate(patientTestResult.getPpBloodSugarTest());
        }
        if(patientTestResult.getRandomBloodSugarTest()!=null){
        	session.saveOrUpdate(patientTestResult.getRandomBloodSugarTest());
        }
        if(patientTestResult.getBloodUreaTest()!=null){
        	session.saveOrUpdate(patientTestResult.getBloodUreaTest());
        }
        
        if(patientTestResult.getSerumCreatinineTest()!=null){
        	session.saveOrUpdate(patientTestResult.getSerumCreatinineTest());
        }
        if(patientTestResult.getSerumElectrolytes()!=null){
        	session.saveOrUpdate(patientTestResult.getSerumElectrolytes());
        }
        if(patientTestResult.getLftTest()!=null){
        	session.saveOrUpdate(patientTestResult.getLftTest());
        }
        if(patientTestResult.getSgotTest()!=null){
        	session.saveOrUpdate(patientTestResult.getSgotTest());
        }
        if(patientTestResult.getSgptTest()!=null){
        	session.saveOrUpdate(patientTestResult.getSgptTest());
        }
        if(patientTestResult.getAlpTest()!=null){
        	session.saveOrUpdate(patientTestResult.getAlpTest());
        }
        if(patientTestResult.getSerumCalCiumTest()!=null){
        	session.saveOrUpdate(patientTestResult.getSerumCalCiumTest());
        }
        if(patientTestResult.getIonisedCalciumTest()!=null){
        	session.saveOrUpdate(patientTestResult.getIonisedCalciumTest());
        }
        if(patientTestResult.getIonisedCalciumMgTest()!=null){
        	session.saveOrUpdate(patientTestResult.getIonisedCalciumMgTest());
        }
        if(patientTestResult.getSerumAmylaseTest()!=null){
        	session.saveOrUpdate(patientTestResult.getSerumAmylaseTest());
        }
        if(patientTestResult.getCpkTest()!=null){
        	session.saveOrUpdate(patientTestResult.getCpkTest());
        }
        if(patientTestResult.getCpkMbTest()!=null){
        	session.saveOrUpdate(patientTestResult.getCpkMbTest());
        }
        if(patientTestResult.getSerumUricAcidTest()!=null){
        	session.saveOrUpdate(patientTestResult.getSerumUricAcidTest());
        }
        
        if(patientTestResult.getPhosphorousTest()!=null){
        	session.saveOrUpdate(patientTestResult.getPhosphorousTest());
        }
        if(patientTestResult.getPseudoCholinesteraseTest()!=null){
        	session.saveOrUpdate(patientTestResult.getPseudoCholinesteraseTest());
        }
        if(patientTestResult.getUrineExaminationTest()!=null){
        	session.saveOrUpdate(patientTestResult.getUrineExaminationTest());
        }
        if(patientTestResult.getViralAntiBodiesTest()!=null){
        	session.saveOrUpdate(patientTestResult.getViralAntiBodiesTest());
        }
        if(patientTestResult.getHbsAgTest()!=null){
        	session.saveOrUpdate(patientTestResult.getHbsAgTest());
        }
        if(patientTestResult.getWidalTest()!=null){
        	session.saveOrUpdate(patientTestResult.getWidalTest());
        }
        if(patientTestResult.getCtniTropiTest()!=null){
        	session.saveOrUpdate(patientTestResult.getCtniTropiTest());
        }
        
        if(patientTestResult.getRaFactorTest()!=null){
        	session.saveOrUpdate(patientTestResult.getRaFactorTest());
        }
        if(patientTestResult.getCrpTest()!=null){
        	session.saveOrUpdate(patientTestResult.getCrpTest());
        }
        if(patientTestResult.getAsoTest()!=null){
        	session.saveOrUpdate(patientTestResult.getAsoTest());
        }
        if(patientTestResult.getChikengunyaTest()!=null){
        	session.saveOrUpdate(patientTestResult.getChikengunyaTest());
        }
        if(patientTestResult.getVdrlTest()!=null){
        	session.saveOrUpdate(patientTestResult.getVdrlTest());
        }
        if(patientTestResult.getDengueTest()!=null){
        	session.saveOrUpdate(patientTestResult.getDengueTest());
        }
        if(patientTestResult.getSerumTTest()!=null){
        	session.saveOrUpdate(patientTestResult.getSerumTTest());
        }
        session.save(patientTestResult);
	}  

	public List<PatientTestResult> getPatientTestResultById(Long id) {
		Session session=hibernateUtil.getSession();
		Patient patient=(Patient)session.get(Patient.class, id);
		List<PatientTest> patientTestList=patient.getPatientTest();
		List<PatientTestResult> testResult=new ArrayList<PatientTestResult>();
		for (PatientTest patientTest : patientTestList) {
			testResult.add((PatientTestResult)session.get(PatientTestResult.class, patientTest.getId()));
		}
		return testResult;
	}
	

}
