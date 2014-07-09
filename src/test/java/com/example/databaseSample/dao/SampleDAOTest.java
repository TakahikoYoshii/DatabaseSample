package com.example.databaseSample.dao;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
public class SampleDAOTest {
	@Autowired
	private SampleDAO sampleDAO;
	
	@Test
	public void test_insert() {
		assertThat(sampleDAO, notNullValue());
		sampleDAO.insert(35, "testedData");
	}

}
