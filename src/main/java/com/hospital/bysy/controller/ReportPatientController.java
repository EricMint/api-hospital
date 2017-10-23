package com.hospital.bysy.controller;

import com.hospital.bysy.response.ImagingExaminationCategoryInfoListResponse;
import com.hospital.bysy.apiservice.ReportPatientAPIService;
import com.hospital.bysy.service.ReportPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by mint on 10/18/17.
 */
@Controller
public class ReportPatientController implements ReportPatientAPIService {

    @Autowired
    ReportPatientService reportPatientService;

    public ImagingExaminationCategoryInfoListResponse getImagingExaminationCategoryList() {
        return reportPatientService.getImagingExaminationCategoryList();
    }

}
