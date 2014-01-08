package io.spring.web.logging.change.level.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;

@Service
public class LoggerService {

	@Autowired
	LoggerContext lc;

	public List<Logger> list() {
		return lc.getLoggerList();
	}
}
