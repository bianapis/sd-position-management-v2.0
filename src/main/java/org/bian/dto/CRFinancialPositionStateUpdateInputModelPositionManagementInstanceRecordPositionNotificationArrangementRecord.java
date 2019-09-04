package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateUpdateInputModelPositionManagementInstanceRecordPositionNotificationArrangementRecord
 */
public class CRFinancialPositionStateUpdateInputModelPositionManagementInstanceRecordPositionNotificationArrangementRecord   {
  private String positionNotificationBusinessUnitReference = null;

  private String positionNotificationDetails = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the notified party 
   * @return positionNotificationBusinessUnitReference
  **/

  public String getPositionNotificationBusinessUnitReference() {
    return positionNotificationBusinessUnitReference;
  }

  public void setPositionNotificationBusinessUnitReference(String positionNotificationBusinessUnitReference) {
    this.positionNotificationBusinessUnitReference = positionNotificationBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the requirements/schedule for position notification 
   * @return positionNotificationDetails
  **/

  public String getPositionNotificationDetails() {
    return positionNotificationDetails;
  }

  public void setPositionNotificationDetails(String positionNotificationDetails) {
    this.positionNotificationDetails = positionNotificationDetails;
  }


}

