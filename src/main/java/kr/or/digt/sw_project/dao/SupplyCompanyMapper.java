package kr.or.digt.sw_project.dao;

import java.util.List;


import kr.or.digt.sw_project.dto.SupplyCompany;

public interface SupplyCompanyMapper {
	//List<SupplyCompany> selectAllCompany(); 
	SupplyCompany findSupplyCompanyByCode(SupplyCompany supplyCompany);
	int insertSupplyCompany(SupplyCompany supplyCompany);
	int updateSupplyCompany(SupplyCompany supplyCompany);
}
