package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeControllers {
    @GetMapping("/timeword")
    public String getTimeByTimeZone(ModelMap modelMap, @RequestParam(name = "city", required = false, defaultValue = "Asia/Ho_Chi_Minh") String city){
        // Get current time at local
        Date date = new Date();
// Get timezone by the local
        TimeZone local = TimeZone.getDefault();
// Get timezone by the specified city
        TimeZone locale = TimeZone.getTimeZone(city);
        // Calculate the current time in the specified city
        long locale_time = date.getTime() +
                (locale.getRawOffset() - local.getRawOffset());
// Reset the date by locale_time
        date.setTime(locale_time);
        // Set the data sent to the view
        modelMap.addAttribute("city", city);
        modelMap.addAttribute("date", date);
        return "Time";
    }
}
