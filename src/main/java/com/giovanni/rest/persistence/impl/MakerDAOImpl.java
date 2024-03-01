package com.giovanni.rest.persistence.impl;

import com.giovanni.rest.entities.Maker;
import com.giovanni.rest.persistence.IMakerDAO;
import com.giovanni.rest.repository.MakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MakerDAOImpl implements IMakerDAO {

    @Autowired
    private MakerRepository makerRepository;

    @Override
    public List<Maker> findAll() {
        return (List<Maker>) makerRepository.findAll();
    }

    @Override
    public Optional<Maker> findById(Long id) {
        return makerRepository.findById(id);
    }

    @Override
    public void save(Maker maker) {
        makerRepository.save(maker);

    }

    @Override
    public void deleteById(Long id) {
        makerRepository.deleteById(id);

    }
}
