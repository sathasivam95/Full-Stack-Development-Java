package com.sg.classroster;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sg.classroster.controller.ClassRosterController;


public class App {

	public static void main(String[] args) {
//	    UserIO myIo = new UserIOConsoleImpl();
//	    ClassRosterView myView = new ClassRosterView(myIo);
//	    ClassRosterDao myDao = new ClassRosterDaoFileImpl();
//	    ClassRosterController controller =new ClassRosterController(myDao, myView);
//	    controller.run();
		
		// Instantiate Spring Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassRosterController controller = ctx.getBean("controller",ClassRosterController.class);
		controller.run();
		
	}
}   
	