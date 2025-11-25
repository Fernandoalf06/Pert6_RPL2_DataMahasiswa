/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert6_50422569.repository;

import com.mycompany.pert6_50422569.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ferna
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Integer> {
    

}

