package com.fleetmanagement.fleetapp.controllers;

import com.fleetmanagement.fleetapp.models.Country;
import com.fleetmanagement.fleetapp.models.State;
import com.fleetmanagement.fleetapp.services.CountryService;
import com.fleetmanagement.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {

    @Autowired
    public StateService stateService;

    @Autowired
    public CountryService countryService;

    @GetMapping("/states")
    public String getSates(Model model) {

        List<State> stateList = stateService.getStates();

        model.addAttribute("states", stateList);

        List<Country> countryList = countryService.getCountries();

        model.addAttribute("countries", countryList);

        return "state";
    }

    @PostMapping("/states/addNew")
    public String addNew(State state){
        stateService.save(state);
        return "redirect:/states";
    }

    @RequestMapping("/states/findById")
    @ResponseBody
    public Optional <State> findById( Integer id){
        return stateService.findById(id);
    }

//      ANOTHER OPTION
//    @RequestMapping("/states/findById/{id}")
//    @ResponseBody
//    public Optional <State> findById(@PathVariable Integer id){
//        return stateService.findById(id);
//    }

    @RequestMapping(value = "/states/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(State state){
        stateService.save(state);
        return "redirect:/states";
    }

    @RequestMapping(value = "/states/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        stateService.delete(id);
        return "redirect:/states";
    }
}
