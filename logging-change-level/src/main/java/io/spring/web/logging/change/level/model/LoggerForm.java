package io.spring.web.logging.change.level.model;

import ch.qos.logback.classic.Level;

public class LoggerForm {
	private String logger;
	private Level level;

	public String getLogger() {
		return logger;
	}

	public void setLogger(String logger) {
		this.logger = logger;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

}
