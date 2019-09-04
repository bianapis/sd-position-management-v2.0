package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateInitiateOutputModelPositionManagementInstanceRecordPositionNotificationArrangementRecord
 */
public class CRFinancialPositionStateInitiateOutputModelPositionManagementInstanceRecordPositionNotificationArrangementRecord   {
  private Object positionNotificationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The position notification record generated as required 
   * @return positionNotificationRecord
  **/

  public Object getPositionNotificationRecord() {
    return positionNotificationRecord;
  }

  public void setPositionNotificationRecord(Object positionNotificationRecord) {
    this.positionNotificationRecord = positionNotificationRecord;
  }


}

