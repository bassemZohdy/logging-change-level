package io.spring.web.logging.change.level.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;

@Service
public class LoggerService {

	private static final LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();

	public List<Logger> list() {
		return lc.getLoggerList();
	}

	public Logger updateLevel(String loggerName, Level level) {
		Logger logger = lc.getLogger(loggerName);
		logger.setLevel(level);
		return logger;
	}

	public Logger getLogger(String logger) {
		return lc.getLogger(logger);
	}
}
