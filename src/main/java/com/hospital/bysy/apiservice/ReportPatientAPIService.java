package com.hospital.bysy.apiservice;

import com.hospital.bysy.response.ImagingExaminationCategoryInfoListResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mint on 10/18/17.
 */
public interface ReportPatientAPIService {

    @RequestMapping(value = "/imaging-examination/category-list", method = RequestMethod.GET)
    @ResponseBody
    ImagingExaminationCategoryInfoListResponse getImagingExaminationCategoryList();

}
