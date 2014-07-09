package com.example.databaseSample;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.core.IsNull.notNullValue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;

import com.example.databaseSample.model.DataModel;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
public class DatabaseSampleControllerTest {
	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	@Before
	public void setUp() {
		mockMvc = webAppContextSetup(wac).build();
	}

	@Test
	public void test_slash_data_slashへのGET() throws Exception {
		MvcResult mvcResult = mockMvc.perform(get("/data"))
				.andExpect(status().isOk()).andExpect(view().name("data"))
				.andExpect(model().attributeExists("dataModel")).andReturn();

		// Modelの中身までテストする場合には、equalsToメソッドを実装するかMvcResultからModelを取得しないといけない
		ModelMap modelMap = mvcResult.getModelAndView().getModelMap();
		Object object = modelMap.get("name");
		assertThat(object, notNullValue());
		assertThat(object, is(instanceOf(DataModel.class)));
		DataModel dataModel = (DataModel) object;
		assertThat(dataModel.getName(), notNullValue());
		assertThat(dataModel.getId(), notNullValue());
	}

}
