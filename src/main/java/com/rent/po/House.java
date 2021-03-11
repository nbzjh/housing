package com.rent.po;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author zjh
 * @create 2021-03-05 10:11
 */
public class House {
    private String uuid;
    private String title;
    private String district;
    private Integer area;
    private String toward;
    private String layout;
    private Integer price;
    private String depict;
    private String two_type;
    private String img;
    private Date cdatetime;
    private Date adatetime;
    private String approver;
    private Integer status;
    private Integer rent_status;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getToward() {
        return toward;
    }

    public void setToward(String toward) {
        this.toward = toward;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }

    public String getTwo_type() {
        return two_type;
    }

    public void setTwo_type(String two_type) {
        this.two_type = two_type;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getCdatetime() {
        return cdatetime;
    }

    public void setCdatetime(Date cdatetime) {
        this.cdatetime = cdatetime;
    }

    public Date getAdatetime() {
        return adatetime;
    }

    public void setAdatetime(Date adatetime) {
        this.adatetime = adatetime;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRent_status() {
        return rent_status;
    }

    public void setRent_status(Integer rent_status) {
        this.rent_status = rent_status;
    }


}
