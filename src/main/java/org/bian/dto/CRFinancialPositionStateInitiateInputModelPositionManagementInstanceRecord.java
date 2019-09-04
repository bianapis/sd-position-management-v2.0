package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionStateInitiateInputModelPositionManagementInstanceRecordPositionNotificationArrangementRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateInitiateInputModelPositionManagementInstanceRecord
 */
public class CRFinancialPositionStateInitiateInputModelPositionManagementInstanceRecord   {
  private String positionType = null;

  private String positionCustomerReference = null;

  private String positionSector = null;

  private String positionProductType = null;

  private String positionDefinition = null;

  private String positionThresholdsLimits = null;

  private String positionNotificationArrangementReference = null;

  private CRFinancialPositionStateInitiateInputModelPositionManagementInstanceRecordPositionNotificationArrangementRecord positionNotificationArrangementRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of position being monitored (e.g. consolidated customer exposure, geographic/sector exposure) 
   * @return positionType
  **/

  public String getPositionType() {
    return positionType;
  }

  public void setPositionType(String positionType) {
    this.positionType = positionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The customer or customer type associated with the position if applicable 
   * @return positionCustomerReference
  **/

  public String getPositionCustomerReference() {
    return positionCustomerReference;
  }

  public void setPositionCustomerReference(String positionCustomerReference) {
    this.positionCustomerReference = positionCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The sector or segment associated with the position if applicable 
   * @return positionSector
  **/

  public String getPositionSector() {
    return positionSector;
  }

  public void setPositionSector(String positionSector) {
    this.positionSector = positionSector;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The product type or specific product associated with the position if applicable 
   * @return positionProductType
  **/

  public String getPositionProductType() {
    return positionProductType;
  }

  public void setPositionProductType(String positionProductType) {
    this.positionProductType = positionProductType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the specification and purpose position monitoring (e.g. real-time limit, trend) 
   * @return positionDefinition
  **/

  public String getPositionDefinition() {
    return positionDefinition;
  }

  public void setPositionDefinition(String positionDefinition) {
    this.positionDefinition = positionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Thresholds limits associated with the position 
   * @return positionThresholdsLimits
  **/

  public String getPositionThresholdsLimits() {
    return positionThresholdsLimits;
  }

  public void setPositionThresholdsLimits(String positionThresholdsLimits) {
    this.positionThresholdsLimits = positionThresholdsLimits;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a notification source requesting updates on position changes 
   * @return positionNotificationArrangementReference
  **/

  public String getPositionNotificationArrangementReference() {
    return positionNotificationArrangementReference;
  }

  public void setPositionNotificationArrangementReference(String positionNotificationArrangementReference) {
    this.positionNotificationArrangementReference = positionNotificationArrangementReference;
  }


  /**
   * Get positionNotificationArrangementRecord
   * @return positionNotificationArrangementRecord
  **/

  public CRFinancialPositionStateInitiateInputModelPositionManagementInstanceRecordPositionNotificationArrangementRecord getPositionNotificationArrangementRecord() {
    return positionNotificationArrangementRecord;
  }

  public void setPositionNotificationArrangementRecord(CRFinancialPositionStateInitiateInputModelPositionManagementInstanceRecordPositionNotificationArrangementRecord positionNotificationArrangementRecord) {
    this.positionNotificationArrangementRecord = positionNotificationArrangementRecord;
  }


}

