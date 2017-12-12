/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istinurhalimah.kuis1035.repo;

import com.istinurhalimah.kuis1035.entity.Cv_1035;
import com.istinurhalimah.kuis1035.entity.Nilai_1035;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author PC-3-320
 */
public interface NilaiRepo extends CrudRepository<Nilai_1035, Long>{
    
    @Query("select c from Nilai_1035 c")
    public List<Nilai_1035> findAllNilai_1035();

    public Cv_1035 findOne(String id_nilai);
}
