/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istinurhalimah.kuis1035.repo;

import com.istinurhalimah.kuis1035.entity.Cv_1035;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author PC-3-320
 */
public interface CvRepo extends CrudRepository<Cv_1035, Long>{
    
     @Query("select c from Cv_1035 c")
    public List<Cv_1035> findAllCv_1035();

    public Cv_1035 findOne(String id_cv);
}
