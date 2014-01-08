package io.spring.web.logging.change.level.controller;

import io.spring.web.logging.change.level.service.LoggerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoggerController {

	@Autowired
	private LoggerService service;

	@RequestMapping(value = "/loggers", method = RequestMethod.GET)
	public String get(Model model) {
		model.addAttribute("loggers", service.list());
		return "logger";
	}
}
