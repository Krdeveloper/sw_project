package kr.or.digt.sw_project.connection;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.digt.sw_project.dao.SupplyCompanyMapper;
import kr.or.digt.sw_project.dto.SupplyCompany;

public class SupplyCompanyMapperImpl implements SupplyCompanyMapper {
	private static final Log log = LogFactory.getLog(SupplyCompanyMapperImpl.class);
	private SqlSession sqlSession;
	private String namespace = "kr.or.digt.sw_project.dao.SupplyCompanyMapper.";

	public SupplyCompanyMapperImpl(SqlSession sqlSession) {

		this.sqlSession = sqlSession;
	}

	/*
	 * @Override public List<SupplyCompany> selectAllCompany() {
	 * log.debug("searchCourse()"); return sqlsession.selectList(namespace
	 * +".selectAllCompany"); }
	 */
	@Override
	public SupplyCompany findSupplyCompanyByCode(SupplyCompany supplyCompany) {
		log.debug("findSupplyCompanyByCode()");
		return sqlSession.selectOne(namespace + "findSupplyCompanyByCode", supplyCompany);
	}
	
	@Override
	public int insertSupplyCompany(SupplyCompany supplyCompany) {
		log.debug("insertSupplyCompany()");
		return sqlSession.insert(namespace + "insertSupplyCompany", supplyCompany);
	}

	
}


