package com.learning.depertment.repository;

import com.learning.depertment.entity.Depertment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepertmentRepository extends JpaRepository<Depertment, Long> {
}
