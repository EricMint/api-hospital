package com.hospital.bysy.service;

import com.hospital.bysy.Entity.ImagingExaminationCategoryEntity;
import com.hospital.bysy.repository.ReportPatientRepository;
import com.hospital.bysy.response.ImagingExaminationCategoryInfoListResponse;
import com.hospital.bysy.domain.ImagingExaminationCategoryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mint on 10/18/17.
 */
@Service
public class ReportPatientService {

    @Autowired
    ReportPatientRepository reportPatientRepository;

    public ImagingExaminationCategoryInfoListResponse getImagingExaminationCategoryList() {
        ImagingExaminationCategoryInfoListResponse listResponse = new ImagingExaminationCategoryInfoListResponse();
        List<ImagingExaminationCategoryEntity> categoryEntityList =  reportPatientRepository.findAll();
        if (null == categoryEntityList || categoryEntityList.isEmpty()){
            return listResponse;
        }

        List<ImagingExaminationCategoryInfo> categoryInfoList = new ArrayList<ImagingExaminationCategoryInfo>();
        for (ImagingExaminationCategoryEntity categoryEntity : categoryEntityList) {
            ImagingExaminationCategoryInfo categoryInfo = new ImagingExaminationCategoryInfo();
            categoryInfo.setImagingExaminationCategoryId(categoryEntity.getId());
            categoryInfo.setImagingExaminationCategoryName(categoryEntity.getImagingExaminationCategoryName());
            categoryInfoList.add(categoryInfo);
        }
        listResponse.setImagingExaminationCategoryInfoList(categoryInfoList);
        return listResponse;
    }

}
