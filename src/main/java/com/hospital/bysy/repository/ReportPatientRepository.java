package com.hospital.bysy.repository;

import com.hospital.bysy.Entity.ImagingExaminationCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mint on 10/19/17.
 */
@Repository
public interface ReportPatientRepository extends JpaRepository<ImagingExaminationCategoryEntity, Integer> {
}
