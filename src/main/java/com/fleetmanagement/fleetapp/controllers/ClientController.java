package com.fleetmanagement.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Validated
public class ClientController {

    @GetMapping("/clients")
    public String getCountries() {
        return "Client";
    }


}
