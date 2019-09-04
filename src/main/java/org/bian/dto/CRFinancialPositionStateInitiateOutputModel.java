package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionStateInitiateOutputModelPositionManagementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateInitiateOutputModel
 */
public class CRFinancialPositionStateInitiateOutputModel   {
  private String financialPositionStateInstanceReference = null;

  private String financialPositionStateInitiateActionReference = null;

  private Object financialPositionStateInitiateActionRecord = null;

  private String financialPositionStateInstanceStatus = null;

  private CRFinancialPositionStateInitiateOutputModelPositionManagementInstanceRecord positionManagementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Position State instance 
   * @return financialPositionStateInstanceReference
  **/

  public String getFinancialPositionStateInstanceReference() {
    return financialPositionStateInstanceReference;
  }

  public void setFinancialPositionStateInstanceReference(String financialPositionStateInstanceReference) {
    this.financialPositionStateInstanceReference = financialPositionStateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return financialPositionStateInitiateActionReference
  **/

  public String getFinancialPositionStateInitiateActionReference() {
    return financialPositionStateInitiateActionReference;
  }

  public void setFinancialPositionStateInitiateActionReference(String financialPositionStateInitiateActionReference) {
    this.financialPositionStateInitiateActionReference = financialPositionStateInitiateActionReference;
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

  public CRFinancialPositionStateInitiateOutputModelPositionManagementInstanceRecord getPositionManagementInstanceRecord() {
    return positionManagementInstanceRecord;
  }

  public void setPositionManagementInstanceRecord(CRFinancialPositionStateInitiateOutputModelPositionManagementInstanceRecord positionManagementInstanceRecord) {
    this.positionManagementInstanceRecord = positionManagementInstanceRecord;
  }


}

