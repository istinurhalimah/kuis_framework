/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istinurhalimah.kuis1035.controller;

import com.istinurhalimah.kuis1035.entity.Cv_1035;
import com.istinurhalimah.kuis1035.entity.Nilai_1035;
import com.istinurhalimah.kuis1035.service.CvService;
import com.istinurhalimah.kuis1035.service.NilaiService;
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
@RequestMapping("/Nilai_1035")
public class NilaiController {
    
    @Autowired
    private NilaiService NilaiService;
    
    @RequestMapping(method = RequestMethod.POST)
    public Nilai_1035 insertOrUpdate(@RequestBody Nilai_1035 Nilai_1035){
        return NilaiService.insertOrUpdate(Nilai_1035);
    }
  
}
