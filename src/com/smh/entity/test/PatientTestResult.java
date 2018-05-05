package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.smh.entity.BaseEntity;
import com.smh.entity.PatientTest;

@Entity
public class PatientTestResult extends BaseEntity {
	
	private Integer patientTestId;

	@OneToOne
	private PTTest ptTest;
	
	@OneToOne
	private ApttTest apttTest;
	
	@OneToOne
	private StoolTest stollTest;
	
	@OneToOne
	private StoolOccultBloodTest stoolOccultBloodTest;
	
	@OneToOne
	private MantouxTest mantouxTest;
	
	@OneToOne
	private CbpTest cbpTest;
	
	@OneToOne
	private DlcCount dlcCount;
	
	@OneToOne
	private CbhTest cbhTest;
	
	
	@OneToOne
	private FbsTest  fbsTest;
	
	@OneToOne
	private PpBloodSugarTest ppBloodSugarTest;
	
	
	@OneToOne
	private RandomBloodSugarTest randomBloodSugarTest;
	
	@OneToOne
	private BloodUreaTest bloodUreaTest;
	
	@OneToOne
	private SerumCreatinineTest serumCreatinineTest;
	
	@OneToOne
	private SerumElectrolytes serumElectrolytes;
	
	
	@OneToOne
	private LftTest lftTest;
	
	@OneToOne
	private SgotTest sgotTest;
	
	@OneToOne
	private SgptTest sgptTest;
	
	@OneToOne
	private AlpTest alpTest;
	
	@OneToOne
	private SerumCalciumTest serumCalCiumTest;
	
	@OneToOne
	private IonisedCalciumTest ionisedCalciumTest;
	
	@OneToOne
	private IonisedCalciumMgTest ionisedCalciumMgTest;
	
	@OneToOne
	private SerumAmylaseTest serumAmylaseTest; 
	
	@OneToOne
	private CpkTest cpkTest;
	
	@OneToOne
	private CpkMbTest cpkMbTest;
	
	@OneToOne
	private SerumUricAcidTest serumUricAcidTest; 
	
	@OneToOne
	private PhosphorousTest phosphorousTest;
	
	@OneToOne
	private PseudoCholinesteraseTest pseudoCholinesteraseTest;
	
	@OneToOne
	private UrineExaminationTest urineExaminationTest;
	
	@OneToOne
	private ViralAntibodiesTest  viralAntiBodiesTest;
	
	@OneToOne
	private HbsAgTest hbsAgTest;
	
	@OneToOne
	private WidalTest widalTest;
	
	@OneToOne
	private CtniTropiTest ctniTropiTest;
	
	@OneToOne
	private RaFactorTest raFactorTest;
	
	@OneToOne
	private CrpTest crpTest;
	
	@OneToOne
	private AsoTest asoTest;
	
	@OneToOne
	private ChikengunyaTest chikengunyaTest;
	
	@OneToOne
	private VdrlTest vdrlTest;
	
	
	@OneToOne
	private DengueTest dengueTest;
	
	@OneToOne
	private SerumTTest serumTTest;
	
	
	
	
	public PTTest getPtTest() {
		return ptTest;
	}
	public void setPtTest(PTTest ptTest) {
		this.ptTest = ptTest;
	}
	public ApttTest getApttTest() {
		return apttTest;
	}
	public void setApttTest(ApttTest apttTest) {
		this.apttTest = apttTest;
	}
	public StoolTest getStollTest() {
		return stollTest;
	}
	public void setStollTest(StoolTest stollTest) {
		this.stollTest = stollTest;
	}
	public StoolOccultBloodTest getStoolOccultBloodTest() {
		return stoolOccultBloodTest;
	}
	public void setStoolOccultBloodTest(StoolOccultBloodTest stoolOccultBloodTest) {
		this.stoolOccultBloodTest = stoolOccultBloodTest;
	}
	public MantouxTest getMantouxTest() {
		return mantouxTest;
	}
	public void setMantouxTest(MantouxTest mantouxTest) {
		this.mantouxTest = mantouxTest;
	}
	public CbpTest getCbpTest() {
		return cbpTest;
	}
	public void setCbpTest(CbpTest cbpTest) {
		this.cbpTest = cbpTest;
	}
	
	public Integer getPatientTestId() {
		return patientTestId;
	}
	public void setPatientTestId(Integer patientTestId) {
		this.patientTestId = patientTestId;
	}
	public DlcCount getDlcCount() {
		return dlcCount;
	}
	public void setDlcCount(DlcCount dlcCount) {
		this.dlcCount = dlcCount;
	}
	public CbhTest getCbhTest() {
		return cbhTest;
	}
	public void setCbhTest(CbhTest cbhTest) {
		this.cbhTest = cbhTest;
	}
	public FbsTest getFbsTest() {
		return fbsTest;
	}
	public void setFbsTest(FbsTest fbsTest) {
		this.fbsTest = fbsTest;
	}
	public PpBloodSugarTest getPpBloodSugarTest() {
		return ppBloodSugarTest;
	}
	public void setPpBloodSugarTest(PpBloodSugarTest ppBloodSugarTest) {
		this.ppBloodSugarTest = ppBloodSugarTest;
	}
	public RandomBloodSugarTest getRandomBloodSugarTest() {
		return randomBloodSugarTest;
	}
	public void setRandomBloodSugarTest(RandomBloodSugarTest randomBloodSugarTest) {
		this.randomBloodSugarTest = randomBloodSugarTest;
	}
	public BloodUreaTest getBloodUreaTest() {
		return bloodUreaTest;
	}
	public void setBloodUreaTest(BloodUreaTest bloodUreaTest) {
		this.bloodUreaTest = bloodUreaTest;
	}
	public SerumCreatinineTest getSerumCreatinineTest() {
		return serumCreatinineTest;
	}
	public void setSerumCreatinineTest(SerumCreatinineTest serumCreatinineTest) {
		this.serumCreatinineTest = serumCreatinineTest;
	}
	public SerumElectrolytes getSerumElectrolytes() {
		return serumElectrolytes;
	}
	public void setSerumElectrolytes(SerumElectrolytes serumElectrolytes) {
		this.serumElectrolytes = serumElectrolytes;
	}
	public LftTest getLftTest() {
		return lftTest;
	}
	public void setLftTest(LftTest lftTest) {
		this.lftTest = lftTest;
	}
	public SgotTest getSgotTest() {
		return sgotTest;
	}
	public void setSgotTest(SgotTest sgotTest) {
		this.sgotTest = sgotTest;
	}
	public SgptTest getSgptTest() {
		return sgptTest;
	}
	public void setSgptTest(SgptTest sgptTest) {
		this.sgptTest = sgptTest;
	}
	public AlpTest getAlpTest() {
		return alpTest;
	}
	public void setAlpTest(AlpTest alpTest) {
		this.alpTest = alpTest;
	}
	public SerumCalciumTest getSerumCalCiumTest() {
		return serumCalCiumTest;
	}
	public void setSerumCalCiumTest(SerumCalciumTest serumCalCiumTest) {
		this.serumCalCiumTest = serumCalCiumTest;
	}
	public IonisedCalciumTest getIonisedCalciumTest() {
		return ionisedCalciumTest;
	}
	public void setIonisedCalciumTest(IonisedCalciumTest ionisedCalciumTest) {
		this.ionisedCalciumTest = ionisedCalciumTest;
	}
	public IonisedCalciumMgTest getIonisedCalciumMgTest() {
		return ionisedCalciumMgTest;
	}
	public void setIonisedCalciumMgTest(IonisedCalciumMgTest ionisedCalciumMgTest) {
		this.ionisedCalciumMgTest = ionisedCalciumMgTest;
	}
	public SerumAmylaseTest getSerumAmylaseTest() {
		return serumAmylaseTest;
	}
	public void setSerumAmylaseTest(SerumAmylaseTest serumAmylaseTest) {
		this.serumAmylaseTest = serumAmylaseTest;
	}
	public CpkTest getCpkTest() {
		return cpkTest;
	}
	public void setCpkTest(CpkTest cpkTest) {
		this.cpkTest = cpkTest;
	}
	public CpkMbTest getCpkMbTest() {
		return cpkMbTest;
	}
	public void setCpkMbTest(CpkMbTest cpkMbTest) {
		this.cpkMbTest = cpkMbTest;
	}
	public SerumUricAcidTest getSerumUricAcidTest() {
		return serumUricAcidTest;
	}
	public void setSerumUricAcidTest(SerumUricAcidTest serumUricAcidTest) {
		this.serumUricAcidTest = serumUricAcidTest;
	}
	public PhosphorousTest getPhosphorousTest() {
		return phosphorousTest;
	}
	public void setPhosphorousTest(PhosphorousTest phosphorousTest) {
		this.phosphorousTest = phosphorousTest;
	}
	public PseudoCholinesteraseTest getPseudoCholinesteraseTest() {
		return pseudoCholinesteraseTest;
	}
	public void setPseudoCholinesteraseTest(
			PseudoCholinesteraseTest pseudoCholinesteraseTest) {
		this.pseudoCholinesteraseTest = pseudoCholinesteraseTest;
	}
	public UrineExaminationTest getUrineExaminationTest() {
		return urineExaminationTest;
	}
	public void setUrineExaminationTest(UrineExaminationTest urineExaminationTest) {
		this.urineExaminationTest = urineExaminationTest;
	}
	public ViralAntibodiesTest getViralAntiBodiesTest() {
		return viralAntiBodiesTest;
	}
	public void setViralAntiBodiesTest(ViralAntibodiesTest viralAntiBodiesTest) {
		this.viralAntiBodiesTest = viralAntiBodiesTest;
	}
	public HbsAgTest getHbsAgTest() {
		return hbsAgTest;
	}
	public void setHbsAgTest(HbsAgTest hbsAgTest) {
		this.hbsAgTest = hbsAgTest;
	}
	public WidalTest getWidalTest() {
		return widalTest;
	}
	public void setWidalTest(WidalTest widalTest) {
		this.widalTest = widalTest;
	}
	public CtniTropiTest getCtniTropiTest() {
		return ctniTropiTest;
	}
	public void setCtniTropiTest(CtniTropiTest ctniTropiTest) {
		this.ctniTropiTest = ctniTropiTest;
	}
	public RaFactorTest getRaFactorTest() {
		return raFactorTest;
	}
	public void setRaFactorTest(RaFactorTest raFactorTest) {
		this.raFactorTest = raFactorTest;
	}
	public CrpTest getCrpTest() {
		return crpTest;
	}
	public void setCrpTest(CrpTest crpTest) {
		this.crpTest = crpTest;
	}
	public AsoTest getAsoTest() {
		return asoTest;
	}
	public void setAsoTest(AsoTest asoTest) {
		this.asoTest = asoTest;
	}
	public ChikengunyaTest getChikengunyaTest() {
		return chikengunyaTest;
	}
	public void setChikengunyaTest(ChikengunyaTest chikengunyaTest) {
		this.chikengunyaTest = chikengunyaTest;
	}
	public VdrlTest getVdrlTest() {
		return vdrlTest;
	}
	public void setVdrlTest(VdrlTest vdrlTest) {
		this.vdrlTest = vdrlTest;
	}
	public DengueTest getDengueTest() {
		return dengueTest;
	}
	public void setDengueTest(DengueTest dengueTest) {
		this.dengueTest = dengueTest;
	}
	public SerumTTest getSerumTTest() {
		return serumTTest;
	}
	public void setSerumTTest(SerumTTest serumTTest) {
		this.serumTTest = serumTTest;
	}
	
	
	
}
