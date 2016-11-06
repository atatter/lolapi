package controller;

import dao.ClassifierDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vm.Classifier;

import javax.annotation.Resource;

@RestController
public class ClassifierController {

    @Resource
    private ClassifierDao dao;

    @GetMapping("classifiers")
    public Classifier getSomething() {
        return dao.getAll();
    }
}
