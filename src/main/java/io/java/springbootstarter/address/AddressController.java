package io.java.springbootstarter.address;

import io.java.springbootstarter.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping ("/users/ {id} /addresses")
    public List<Address> getAllAddresses(@PathVariable int id){
        return addressService.getAllAddresses(id);
    }

    @RequestMapping ("/users/{userId}/addresses/ {id}")
    public Optional<Address> getAddress(@PathVariable int id){
        return addressService.getAddress(id);
    }

    @RequestMapping (method = RequestMethod.POST, value = "/users/ {userId} /addresses")
    public void addAddress(@RequestBody Address address, @PathVariable int userId){
        address.setUser(new User(userId, "", "", "", ""));
        addressService.addAddress(address);
    }

    @RequestMapping (method = RequestMethod.PUT, value = "/users/ {userId} /addresses/ {id}")
    public void updateAddress(@RequestBody Address address, @PathVariable int userId, @PathVariable int id){
        address.setUser(new User(userId, "", "", "", ""));
        addressService.updateAddress(address);
    }

    @RequestMapping (method = RequestMethod.DELETE, value = "/users/ {userId}/addresses/ {id}")
    public void deleteAddress(@PathVariable int id){
        addressService.deleteAddress(id);
    }




}
