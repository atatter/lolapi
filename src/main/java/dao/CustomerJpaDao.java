package dao;

import model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CustomerJpaDao implements CustomerDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insertCustomer(Customer customer) {
        if (customer.getId() == null) {
            em.persist(customer);
        } else {
            em.merge(customer);
        }
    }

    @Override
    public Customer getCustomer(Long id) {
        return em.createQuery("SELECT p FROM Customer p WHERE p.id = :id", Customer.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return em.createQuery("SELECT p FROM Customer p", Customer.class)
                .getResultList();

    }

    @Override
    public List<Customer> searchCustomers(String key) {
        System.out.println(key);
        return em.createQuery("SELECT p FROM Customer p where LOWER(p.firstName) LIKE LOWER(:string) or LOWER(p.lastName) LIKE LOWER(:string) or LOWER(p.code) LIKE LOWER(:string)", Customer.class)
                .setParameter("string", "%" + key + "%")
                .getResultList();
    }

    @Override
    @Transactional
    public void deleteAllCustomers() {
        em.createQuery("DELETE FROM Customer")
            .executeUpdate();
    }

    @Override
    @Transactional
    public void deleteCustomer(Long id) {
        em.createQuery("delete from Customer p where p.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }
}
