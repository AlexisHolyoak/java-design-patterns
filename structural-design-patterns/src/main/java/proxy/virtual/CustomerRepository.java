package proxy.virtual;

public class CustomerRepository extends Repository<CustomerEntity> {

    @Override
    public CustomerEntity getById(int id) {
        System.out.println("--> Fetching Customer " + id);
        return new CustomerEntity(id, "Customer " + id);
    }
}
