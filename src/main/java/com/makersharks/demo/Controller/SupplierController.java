package com.makersharks.demo.Controller;


import com.makersharks.demo.SupplierSearchCriteria;
import com.makersharks.demo.entity.Supplier;
import com.makersharks.demo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public List<Supplier> searchSuppliers(@RequestBody SupplierSearchCriteria criteria) {
        return supplierService.findSuppliers(
            criteria.getLocation(),
            criteria.getNatureOfBusiness(),
            criteria.getManufacturingProcesses()
        );
    }
}



