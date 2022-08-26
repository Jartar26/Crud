package com.vansmongo.demo.service;

import com.vansmongo.demo.domain.Person;
import com.vansmongo.demo.repository.VanilaMongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class VanilaMongoRepoSeriveImpl implements VanilaMongoRepoSerive {

    private VanilaMongoRepo vanilaMongoRepo;

    @Autowired
    public VanilaMongoRepoSeriveImpl(VanilaMongoRepo vanilaMongoRepo) {
        this.vanilaMongoRepo = vanilaMongoRepo;
    }
    @Override
    public void saveName(String name) {
        Random random = new Random();
        Person person = new Person();
        int y = random.nextInt(1000);
        person.setId(y);
        person.setName(name);
        vanilaMongoRepo.save(person);

    }
}
