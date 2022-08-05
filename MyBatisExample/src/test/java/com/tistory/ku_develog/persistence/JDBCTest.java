package com.tistory.ku_develog.persistence;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class JDBCTest {
	@Autowired
	DataSource dataSource;
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	private static final Logger logger = Logger.getLogger(JDBCTest.class);
	
	@Before
	public void start() {
		logger.info("Test start.");
	}
	
	@After
	public void end() {
		logger.info("Test end.");
	}
	
	@Test
	public void ConnectionTest() throws Exception {
		try(Connection con = dataSource.getConnection(); 
			SqlSession sqlSession = sqlSessionFactory.openSession()) {
			logger.info(con);
			logger.info(sqlSession);
		}
	}
}