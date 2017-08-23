package com.futureBacken.com.futureBacken;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.futureBacken.controller.LogerController;

@RunWith(SpringJUnit4ClassRunner.class)
public class LogerControllerTest {

	private MockMvc mockMvc;
	private LogerController logerController;
	
	@Before
	public void setUp() {
		logerController = new LogerController();
		this.mockMvc = MockMvcBuilders.standaloneSetup(logerController).build();
	}
	
	@Test
	public void testFirst() throws Exception {
		this.mockMvc.perform(get("/getUser/{name}","hello"))
		.andExpect(status().isOk())
		.andExpect(content().json("{'username':'hello'}"));
	}
}
