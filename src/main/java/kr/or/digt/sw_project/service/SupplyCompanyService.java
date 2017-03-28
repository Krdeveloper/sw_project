package kr.or.digt.sw_project.service;

import org.apache.ibatis.session.SqlSession;


import kr.or.digt.sw_project.connection.MybatisSqlSessionFactory;
import kr.or.digt.sw_project.connection.SupplyCompanyMapperImpl;
import kr.or.digt.sw_project.dao.SupplyCompanyMapper;
import kr.or.digt.sw_project.dto.SupplyCompany;

public class SupplyCompanyService {
	
	
	/*public List<SupplyCompany> selectAllCompany() {
		try (SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion()) {
			SupplyCompanyMapperImpl comp = new SupplyCompanyMapperImpl(sqlsession);
			return comp.selectAllCompany();
		}
	}*/
	public SupplyCompany findTutorById(SupplyCompany supplyCompany) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.opensesstion()) {
			SupplyCompanyMapper supplyCompanyMapper = new SupplyCompanyMapperImpl(sqlSession);
			return supplyCompanyMapper.findSupplyCompanyByCode(supplyCompany);
		}
	}
	
	public int insertSupplyCompany (SupplyCompany supplyCompany) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.opensesstion()) {
			SupplyCompanyMapper supplyCompanyMapper = new SupplyCompanyMapperImpl(sqlSession);
			int res = supplyCompanyMapper.insertSupplyCompany(supplyCompany);
			sqlSession.commit();
			return res;
		}
	}
}
