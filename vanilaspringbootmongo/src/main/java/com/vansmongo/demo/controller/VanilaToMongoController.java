package com.vansmongo.demo.controller;

import com.vansmongo.demo.service.VanilaMongoRepoSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vanila")
public class VanilaToMongoController {
    // @Autowired
    private VanilaMongoRepoSerive vanilaMongoRepoSerive;
@Autowired
    public VanilaToMongoController(VanilaMongoRepoSerive vanilaMongoRepoSerive) {
        this.vanilaMongoRepoSerive = vanilaMongoRepoSerive;
    }

    @GetMapping("/mongo/{name}/add")
    public String casesByPostcode(@PathVariable("name") String name) {
        vanilaMongoRepoSerive.saveName(name);
        return "scusses";
    }
}
