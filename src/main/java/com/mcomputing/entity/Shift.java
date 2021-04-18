/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcomputing.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 *
 * @author MHakimov
 */
public class Shift {

    @JsonProperty("shiftId")
    private Long shiftId;

    @JsonProperty("shiftDate")
    private Date shiftDate;

    @JsonProperty("shiftUserId")
    private Long shiftUserId;

    public Long getShiftId() {
        return shiftId;
    }

    public void setShiftId(Long shiftId) {
        this.shiftId = shiftId;
    }

    public Date getShiftDate() {
        return shiftDate;
    }

    public void setShiftDate(Date shiftDate) {
        this.shiftDate = shiftDate;
    }

    public Long getShiftUserId() {
        return shiftUserId;
    }

    public void setShiftUserId(Long shiftUserId) {
        this.shiftUserId = shiftUserId;
    }

   
    
    
}
