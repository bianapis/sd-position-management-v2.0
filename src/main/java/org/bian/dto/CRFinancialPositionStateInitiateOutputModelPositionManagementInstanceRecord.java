package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionStateInitiateOutputModelPositionManagementInstanceRecordPositionNotificationArrangementRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateInitiateOutputModelPositionManagementInstanceRecord
 */
public class CRFinancialPositionStateInitiateOutputModelPositionManagementInstanceRecord   {
  private String positionValue = null;

  private CRFinancialPositionStateInitiateOutputModelPositionManagementInstanceRecordPositionNotificationArrangementRecord positionNotificationArrangementRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current, historical and if applicable projected values of the monitored position 
   * @return positionValue
  **/

  public String getPositionValue() {
    return positionValue;
  }

  public void setPositionValue(String positionValue) {
    this.positionValue = positionValue;
  }


  /**
   * Get positionNotificationArrangementRecord
   * @return positionNotificationArrangementRecord
  **/

  public CRFinancialPositionStateInitiateOutputModelPositionManagementInstanceRecordPositionNotificationArrangementRecord getPositionNotificationArrangementRecord() {
    return positionNotificationArrangementRecord;
  }

  public void setPositionNotificationArrangementRecord(CRFinancialPositionStateInitiateOutputModelPositionManagementInstanceRecordPositionNotificationArrangementRecord positionNotificationArrangementRecord) {
    this.positionNotificationArrangementRecord = positionNotificationArrangementRecord;
  }


}

