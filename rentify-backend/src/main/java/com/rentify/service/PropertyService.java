package com.rentify.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentify.entity.Property;
import com.rentify.repository.PropertyRepository;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;

    public Property addProperty(Property property) {
        return propertyRepository.save(property);
    }

    public List<Property> getPropertiesBySellerId(Long sellerId) {
        return propertyRepository.findBySellerId(sellerId);
    }

    public List<Property> getAllProperties() {
        return propertyRepository.findAll();
    }

    public void deleteProperty(Long propertyId) {
        propertyRepository.deleteById(propertyId);
    }
}
