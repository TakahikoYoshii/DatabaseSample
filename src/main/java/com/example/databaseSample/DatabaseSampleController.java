package com.example.databaseSample;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.databaseSample.model.DataModel;

@Controller
public class DatabaseSampleController {	     
	    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	     
	    @ModelAttribute
	    public DataModel setUpDataModel(){
	    	return new DataModel();
	    }

	    @RequestMapping(value = "/data", method = RequestMethod.GET)
	    public String data(Locale locale, DataModel dataModel, Model model) {
	        logger.info("Welcome home! The client locale is {}.", locale);
	        
	        model.addAttribute("dataModel", dataModel);
	        return "data";
	    }
}
