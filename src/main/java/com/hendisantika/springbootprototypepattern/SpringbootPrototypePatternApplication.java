package com.hendisantika.springbootprototypepattern;

import com.hendisantika.springbootprototypepattern.model.Role;
import com.hendisantika.springbootprototypepattern.prototype.Developer;
import com.hendisantika.springbootprototypepattern.prototype.ProjectManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPrototypePatternApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootPrototypePatternApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPrototypePatternApplication.class, args);

		// create original instance of developer...
		Developer hDeveloper = new Developer("Heril Muratovic", Role.DEVELOPER);
		LOGGER.info("hDeveloper - original instance: {}", hDeveloper);

		// create prototype of developer...
		Developer jDeveloper = (Developer) hDeveloper.cloneObject();
		jDeveloper.setFullName("Jane Doe");

		// logging the output...
		LOGGER.info("hDeveloper - again original instance: {}", hDeveloper);
		LOGGER.info("jDeveloper - prototype instance: {}", jDeveloper);

		ProjectManager jProjectManager = new ProjectManager("John Doe", Role.PROJECT_MANAGER);
		ProjectManager aProjectManager = (ProjectManager) jProjectManager.cloneObject();

		LOGGER.info("Project Manager - Original instance: {}", jProjectManager);
		LOGGER.info("Project Manager - Prototype instance: {}", aProjectManager);
	}

}
