package com.fleetmanagement.fleetapp.services;
import com.fleetmanagement.fleetapp.models.State;
import com.fleetmanagement.fleetapp.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    public StateRepository stateRepository;
    public List<State> getStates() {
        return stateRepository.findAll();
    }

    public void save(State state) {
        stateRepository.save(state);
    }


    public Optional<State> findById(Integer id) {
        return stateRepository.findById(id);
    }

    public void delete(Integer id) {
        stateRepository.deleteById(id);
    }
}
