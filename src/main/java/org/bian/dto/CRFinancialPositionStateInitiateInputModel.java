package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionStateInitiateInputModelPositionManagementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateInitiateInputModel
 */
public class CRFinancialPositionStateInitiateInputModel   {
  private String positionManagementServicingSessionReference = null;

  private Object financialPositionStateInitiateActionRecord = null;

  private String financialPositionStateInstanceStatus = null;

  private CRFinancialPositionStateInitiateInputModelPositionManagementInstanceRecord positionManagementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return positionManagementServicingSessionReference
  **/

  public String getPositionManagementServicingSessionReference() {
    return positionManagementServicingSessionReference;
  }

  public void setPositionManagementServicingSessionReference(String positionManagementServicingSessionReference) {
    this.positionManagementServicingSessionReference = positionManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return financialPositionStateInitiateActionRecord
  **/

  public Object getFinancialPositionStateInitiateActionRecord() {
    return financialPositionStateInitiateActionRecord;
  }

  public void setFinancialPositionStateInitiateActionRecord(Object financialPositionStateInitiateActionRecord) {
    this.financialPositionStateInitiateActionRecord = financialPositionStateInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Financial Position State instance (e.g. initialised, pending, active) 
   * @return financialPositionStateInstanceStatus
  **/

  public String getFinancialPositionStateInstanceStatus() {
    return financialPositionStateInstanceStatus;
  }

  public void setFinancialPositionStateInstanceStatus(String financialPositionStateInstanceStatus) {
    this.financialPositionStateInstanceStatus = financialPositionStateInstanceStatus;
  }


  /**
   * Get positionManagementInstanceRecord
   * @return positionManagementInstanceRecord
  **/

  public CRFinancialPositionStateInitiateInputModelPositionManagementInstanceRecord getPositionManagementInstanceRecord() {
    return positionManagementInstanceRecord;
  }

  public void setPositionManagementInstanceRecord(CRFinancialPositionStateInitiateInputModelPositionManagementInstanceRecord positionManagementInstanceRecord) {
    this.positionManagementInstanceRecord = positionManagementInstanceRecord;
  }


}

