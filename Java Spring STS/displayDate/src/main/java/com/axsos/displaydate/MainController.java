package com.axsos.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String dashboard() {
		return "displaydate.jsp";
	}

	@GetMapping("/date")
	public String datePage(Model model) {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat SDF = new SimpleDateFormat(pattern);
		model.addAttribute("currentDate", SDF.format(new Date()));
		return "date.jsp";
	}

	@GetMapping("/time")
	public String timePage(Model model) {
		String pattern = "hh:mm a";
		SimpleDateFormat SDF = new SimpleDateFormat(pattern);
		model.addAttribute("currentTime", SDF.format(new Date()));
		return "time.jsp";
	}
}
