package kr.or.digt.sw_project.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.digt.sw_project.dto.SupplyCompany;
import kr.or.digt.sw_project.service.SupplyCompanyService;

public class CompTest {
	private static SupplyCompanyService supplyCompanyService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		supplyCompanyService=  new SupplyCompanyService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		supplyCompanyService = null;
	}

	/*@Test
	public void testall() {
		List<SupplyCompany> list  = supplyCompany.selectAllCompany();
		
		
	}*/
	@Test
	public void aTestFindTutorById(){
		SupplyCompany supplyCompany = new SupplyCompany();
		supplyCompany.setCompCode("SC001");
		
		SupplyCompany selectSupplyCompany = supplyCompanyService.findTutorById(supplyCompany);
		Assert.assertNotNull(selectSupplyCompany);
	}
	
	/*@Test
	public void testInsertSupplyCompany() {
		SupplyCompany supplyCompany = new SupplyCompany("SC007", "testCompany", "testAddr","testTel",false);
		int res = supplyCompanyService.insertSupplyCompany(supplyCompany);
		Assert.assertEquals(1, res);
	}*/
	
	@Test
	public void testUpdateSupplyCompany() {
		SupplyCompany supplyCompany = new SupplyCompany("SC007", "testUpdate", "up","010",true);
		int res = supplyCompanyService.updateSupplyCompany(supplyCompany);
		Assert.assertEquals(1, res);
	}
	
	

}
