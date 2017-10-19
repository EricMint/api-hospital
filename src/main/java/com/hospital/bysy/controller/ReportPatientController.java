package com.hospital.bysy.controller;

import com.hospital.bysy.response.ImagingExaminationCategoryInfoListResponse;
import com.hospital.bysy.apiservice.ReportPatientAPIService;
import com.hospital.bysy.service.ReportPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mint on 10/18/17.
 */
@Controller
public class ReportPatientController {

    @Autowired
    ReportPatientService reportPatientService;

    @RequestMapping(value = "/imaging-examination/category-list", method = RequestMethod.GET)
    @ResponseBody
    public ImagingExaminationCategoryInfoListResponse getImagingExaminationCategoryList() {
        return reportPatientService.getImagingExaminationCategoryList();
    }

}
