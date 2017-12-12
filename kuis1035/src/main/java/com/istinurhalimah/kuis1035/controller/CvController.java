/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istinurhalimah.kuis1035.controller;

import com.istinurhalimah.kuis1035.entity.Cv_1035;
import com.istinurhalimah.kuis1035.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC-3-320
 */
@RestController
@RequestMapping("/Cv_1035")
public class CvController {
    
    @Autowired
    private CvService CvService;
    
    @RequestMapping(method = RequestMethod.POST)
    public Cv_1035 insertOrUpdate(@RequestBody Cv_1035 Cv_1035){
        return CvService.insertOrUpdate(Cv_1035);
    }
  
}
