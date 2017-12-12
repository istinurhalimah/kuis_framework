/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istinurhalimah.kuis1035.service;

import com.istinurhalimah.kuis1035.entity.Cv_1035;
import com.istinurhalimah.kuis1035.entity.Nilai_1035;
import com.istinurhalimah.kuis1035.repo.CvRepo;
import com.istinurhalimah.kuis1035.repo.NilaiRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-3-320
 */
@Service("NilaiService")
@Transactional
public class NilaiService {

    @Autowired
    private NilaiRepo repo;

    public Nilai_1035 insertOrUpdate(Nilai_1035 Nilai_1035) {
        return repo.save(Nilai_1035);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Nilai_1035> findAll() {
        return repo.findAllNilai_1035();
    }

    public Cv_1035 getById(String id_nilai){
        return repo.findOne(id_nilai);
    }
    
    public List<Nilai_1035> getAll(){
        return repo.findAllNilai_1035();
    }
}
