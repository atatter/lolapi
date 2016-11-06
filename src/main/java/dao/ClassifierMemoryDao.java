package dao;

import org.springframework.stereotype.Repository;
import vm.Classifier;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClassifierMemoryDao implements ClassifierDao{

    @Override
    public Classifier getAll() {
        Classifier classifier = new Classifier();

        List<String> phone_types = new ArrayList<>();
        List<String> customer_types = new ArrayList<>();

        phone_types.add("phone_type.fixed");
        phone_types.add("phone_type.mobile");

        customer_types.add("customer_type.private");
        customer_types.add("customer_type.corporate");

        classifier.setCustomerTypes(customer_types);
        classifier.setPhoneTypes(phone_types);

        return classifier;
    }
}
