/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istinurhalimah.kuis1035.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PC-3-320
 */
@Entity
@Table(name = "Nilai_1035")
public class Nilai_1035 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nilai;
    @Column(length = 150, nullable = false)
    private String nama;
    @Column(length = 150, nullable = false)
    private double nilai;
    @OneToMany(mappedBy="owner")
    private List<Cv_1035> Cv_1035;

    /**
     * @return the id_nilai
     */
    public Long getId_nilai() {
        return id_nilai;
    }

    /**
     * @param id_nilai the id_nilai to set
     */
    public void setId_nilai(Long id_nilai) {
        this.id_nilai = id_nilai;
    }

    /**
     * @return the nilai
     */
    public double getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(double nilai) {
        this.nilai = nilai;
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
}
