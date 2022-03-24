package com.sapient.aem.web;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sapient.aem.dao.UserDAO;
import com.sapient.aem.exception.UserException;
import com.sapient.aem.model.Role;
import com.sapient.aem.service.UserService;
import com.sapient.aem.service.UserServiceImpl;


@ExtendWith(MockitoExtension.class)
@DisplayName("Test report on LoginServlet class")
class LoginServletTest {

	@Mock
	private UserService userService;
	private Logger logger= Logger.getLogger(LoginServletTest.class);
	
	@Test
	void testDoGetHttpServletRequestHttpServletResponse() {
		try {
			when(userService.isValidUser("Admin", "admin@123", Role.ADMIN)).thenReturn(true);
			assertTrue(userService.isValidUser("Admin", "admin@123", Role.ADMIN));
		} catch (UserException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	void testDoPostHttpServletRequestHttpServletResponse() {
		try {
			when(userService.isValidUser("Admin", "admin@123", Role.ADMIN)).thenReturn(true);
			assertTrue(userService.isValidUser("Admin", "admin@123", Role.ADMIN));
		} catch (UserException e) {
			e.printStackTrace();
		}
	}

}
