package com.carrental.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carrental.entities.Company;
import com.carrental.entities.Variant;

@Repository
public interface VariantRepository extends JpaRepository<Variant, Integer> {

	List<Variant> findByCompanyIdOrderByPrice(int compid);
}
