package com.hospital.bysy.Entity;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by mint on 10/19/17.
 */
@Entity
@Table(name = "imaging_examination_category")
public class ImagingExaminationCategoryEntity {
    private int id;
    private String imagingExaminationCategoryName;
    private Date create_time;
    private String create_by;
    private Date update_time;
    private String update_by;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "imaging_examination_category_name")
    public String getImagingExaminationCategoryName() {
        return imagingExaminationCategoryName;
    }

    public void setImagingExaminationCategoryName(String imagingExaminationCategoryName) {
        this.imagingExaminationCategoryName = imagingExaminationCategoryName;
    }

    @Basic
    @Column(name = "create_time")
    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Basic
    @Column(name = "create_by")
    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    @Basic
    @Column(name = "update_time")
    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Basic
    @Column(name = "update_by")
    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }
}
