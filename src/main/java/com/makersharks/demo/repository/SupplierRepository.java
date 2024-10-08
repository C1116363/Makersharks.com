package com.makersharks.demo.repository;



import com.makersharks.demo.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(
        String location,
        String natureOfBusiness,
        List<String> manufacturingProcesses
    );
}



