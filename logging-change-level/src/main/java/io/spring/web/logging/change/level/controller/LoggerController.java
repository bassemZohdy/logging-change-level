package io.spring.web.logging.change.level.controller;

import io.spring.web.logging.change.level.model.LoggerForm;
import io.spring.web.logging.change.level.service.LoggerService;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.classic.Level;

@Controller
public class LoggerController {

	@Autowired
	private LoggerService service;

	@ModelAttribute("levels")
	public List<Level> levels() {
		List<Level> levels = new ArrayList<Level>();
		levels.add(Level.ALL);
		levels.add(Level.DEBUG);
		levels.add(Level.ERROR);
		levels.add(Level.INFO);
		levels.add(Level.OFF);
		levels.add(Level.TRACE);
		levels.add(Level.WARN);
		return levels;
	}

	@RequestMapping(value = "/loggers", method = RequestMethod.GET)
	public String get(Model model) {
		model.addAttribute("loggers", service.list());
		return "logger";
	}

	@RequestMapping(value = "/loggers", method = RequestMethod.POST)
	public String updateLevel(@ModelAttribute LoggerForm form, Model model) {
		service.updateLevel(form.getLogger(), form.getLevel());
		return "redirect:/loggers";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public void hello() {
		Logger logger = service.getLogger("hello");
		logger.trace("TRACE");
		logger.debug("DEBUG");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("ERROR");
	}

	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	@ResponseBody
	public void hello2() {
		Logger logger = service.getLogger("hello2");
		logger.trace("TRACE");
		logger.debug("DEBUG");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("ERROR");
	}

}
