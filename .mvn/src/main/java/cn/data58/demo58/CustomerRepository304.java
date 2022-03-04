package cn.data58.demo58;


import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository304 extends CrudRepository<Customer304, Integer> {

    Customer304 findCustomerById(Integer id);
}
