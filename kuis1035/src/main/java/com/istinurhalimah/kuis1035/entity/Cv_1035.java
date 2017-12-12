/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istinurhalimah.kuis1035.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PC-3-320
 */
@Entity
@Table(name = "Cv_1035")
public class Cv_1035 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cv;
    @Column(length = 150, nullable = false)
    private String nama;
    @Column(length = 150, nullable = false)
    private String alamat;
    @Column(length = 150, nullable = false)
    private double nohp;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_nilai")
    private Nilai_1035 owner;
   

    /**
     * @return the id_cv
     */
    public Long getId_cv() {
        return id_cv;
    }

    /**
     * @param id_cv the id_cv to set
     */
    public void setId_cv(Long id_cv) {
        this.id_cv = id_cv;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the nohp
     */
    public double getNohp() {
        return nohp;
    }

    /**
     * @param nohp the nohp to set
     */
    public void setNohp(double nohp) {
        this.nohp = nohp;
    }

}
    
   
