package com.hospital.bysy.response;

import com.hospital.bysy.domain.ImagingExaminationCategoryInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by mint on 10/18/17.
 */
@XmlRootElement(name = "imaging_examination_category_info_list_response")
@XmlAccessorType(XmlAccessType.FIELD)
public class ImagingExaminationCategoryInfoListResponse {

    @XmlElement(name = "imaging-examination-category-info")
    private List<ImagingExaminationCategoryInfo> imagingExaminationCategoryInfoList;

    public List<ImagingExaminationCategoryInfo> getImagingExaminationCategoryInfoList() {
        return imagingExaminationCategoryInfoList;
    }

    public void setImagingExaminationCategoryInfoList(List<ImagingExaminationCategoryInfo> imagingExaminationCategoryInfoList) {
        this.imagingExaminationCategoryInfoList = imagingExaminationCategoryInfoList;
    }
}
