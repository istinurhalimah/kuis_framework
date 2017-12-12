/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istinurhalimah.kuis1035.service;

import com.istinurhalimah.kuis1035.entity.Cv_1035;
import com.istinurhalimah.kuis1035.repo.CvRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-3-320
 */
@Service("CvService")
@Transactional
public class CvService {

    @Autowired
    private CvRepo repo;

    public Cv_1035 insertOrUpdate(Cv_1035 Cv_1035) {
        return repo.save(Cv_1035);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Cv_1035> findAll() {
        return repo.findAllCv_1035();
    }

     public Cv_1035 getById(Long id_cv){
        return repo.findOne(id_cv);
    }
    
    public List<Cv_1035> getAll(){
        return repo.findAllCv_1035();
    }
}
