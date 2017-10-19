package com.hospital.bysy.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mint on 10/18/17.
 */
@XmlRootElement(name = "imaging-examination-category-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class ImagingExaminationCategoryInfo {
    
    @XmlElement(name = "imaging-examination-category-name")
    private String imagingExaminationCategoryName;

    @XmlElement(name = "imaging-examination-category-id")
    private Integer imagingExaminationCategoryId;

    public String getImagingExaminationCategoryName() {
        return imagingExaminationCategoryName;
    }

    public void setImagingExaminationCategoryName(String imagingExaminationCategoryName) {
        this.imagingExaminationCategoryName = imagingExaminationCategoryName;
    }

    public Integer getImagingExaminationCategoryId() {
        return imagingExaminationCategoryId;
    }

    public void setImagingExaminationCategoryId(Integer imagingExaminationCategoryId) {
        this.imagingExaminationCategoryId = imagingExaminationCategoryId;
    }
}
