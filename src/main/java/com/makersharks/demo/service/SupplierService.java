package com.makersharks.demo.service;



import com.makersharks.demo.entity.Supplier;
import com.makersharks.demo.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> findSuppliers(String location, String natureOfBusiness, List<String> manufacturingProcesses) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(location, natureOfBusiness, manufacturingProcesses);
    }
}



