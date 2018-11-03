package com.unimed.cfd.incidents.gateways;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unimed.cfd.incidents.Register;

public interface RegisterRepository extends JpaRepository<Register, Integer> {

}
