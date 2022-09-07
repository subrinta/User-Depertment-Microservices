package com.learning.depertment.service;

import com.learning.depertment.entity.Depertment;
import com.learning.depertment.repository.DepertmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepertmentService {

    @Autowired
    private DepertmentRepository depertmentRepository;

    public Depertment saveDepertment(Depertment depertment) {
        return depertmentRepository.save(depertment);
    }

    public Depertment findDepertmentById(Long id) {
        return depertmentRepository.findById(id).get();
    }
}
