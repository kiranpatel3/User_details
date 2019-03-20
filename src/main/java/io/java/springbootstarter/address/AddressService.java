package io.java.springbootstarter.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses(int userId) {
        List<Address> addresses = new ArrayList<>();
        addressRepository.findByUserId(userId).forEach(addresses :: add);
//        Address address : addressRepository.findAll()) {
//            addresses.add(address);
//        }
        return addresses;

    }

    public Optional<Address> getAddress(int id) {
       return addressRepository.findById(id);
    }

    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    public void updateAddress(Address address) {
        addressRepository.save(address);
    }

    public void deleteAddress(int id) {
        addressRepository.deleteById(id);
    }
}
