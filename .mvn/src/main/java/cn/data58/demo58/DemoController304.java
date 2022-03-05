package cn.data58.demo58;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController304 {

    @Autowired
    private CustomerRepository304 customerRepository;

    @PostMapping("/add")
    public String addCustomer(@RequestParam String first, @RequestParam String last, @RequestParam String addr,@RequestParam String hob) {
        Customer304 customer = new Customer304();
        customer.setFirstName(first);
        customer.setLastName(last);
        customer.setAddress(addr);
        customer.setHobby(hob);
        customerRepository.save(customer);
        return "Added new customer to repo!";
    }

    @GetMapping("/list")
    public Iterable<Customer304> getCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Customer304 findCustomerById(@PathVariable Integer id) {
        return customerRepository.findCustomerById(id);
    }
}

