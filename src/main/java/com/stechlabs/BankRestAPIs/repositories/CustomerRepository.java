package com.stechlabs.BankRestAPIs.repositories;

import com.stechlabs.BankRestAPIs.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
