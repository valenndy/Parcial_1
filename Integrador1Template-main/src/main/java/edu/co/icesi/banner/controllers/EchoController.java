package edu.co.icesi.banner.controllers;

import edu.co.icesi.banner.entity.Product;
import edu.co.icesi.banner.entity.User;
import edu.co.icesi.banner.repositories.ProductRepository;
import edu.co.icesi.banner.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProductRepository productRepository;

    @GetMapping("echo")
    public String echo(){
        //Registro de usuarios
        User Akimijaro = new User();
        Akimijaro.setName("Akimijaro");
        userRepository.save(Akimijaro);

        User SrRobinson = new User();
        SrRobinson.setName("Juan Carlos SrRobinson");
        userRepository.save(SrRobinson);

        User Favaso = new User();
        Favaso.setName("Favaso");
        userRepository.save(Favaso);

        //Registro de productos
        Product C1 = new Product();
        C1.setName("Cachicamo");
        productRepository.save(C1);

        Product C2 = new Product();
        C2.setName("Iphone 13");
        productRepository.save(C2);

        Product C3 = new Product();
        C3.setName("ASUS TUF GAMING");
        productRepository.save(C3);

        Product C4 = new Product();
        C4.setName("Mouse");
        productRepository.save(C4);

        return "done";
    }

}
