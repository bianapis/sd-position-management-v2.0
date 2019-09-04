package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionStateUpdateInputModelPositionManagementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateUpdateInputModel
 */
public class CRFinancialPositionStateUpdateInputModel   {
  private String positionManagementServicingSessionReference = null;

  private String financialPositionStateInstanceReference = null;

  private CRFinancialPositionStateUpdateInputModelPositionManagementInstanceRecord positionManagementInstanceRecord = null;

  private Object financialPositionStateUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get positionManagementInstanceRecord
   * @return positionManagementInstanceRecord
  **/

  public CRFinancialPositionStateUpdateInputModelPositionManagementInstanceRecord getPositionManagementInstanceRecord() {
    return positionManagementInstanceRecord;
  }

  public void setPositionManagementInstanceRecord(CRFinancialPositionStateUpdateInputModelPositionManagementInstanceRecord positionManagementInstanceRecord) {
    this.positionManagementInstanceRecord = positionManagementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return financialPositionStateUpdateActionTaskRecord
  **/

  public Object getFinancialPositionStateUpdateActionTaskRecord() {
    return financialPositionStateUpdateActionTaskRecord;
  }

  public void setFinancialPositionStateUpdateActionTaskRecord(Object financialPositionStateUpdateActionTaskRecord) {
    this.financialPositionStateUpdateActionTaskRecord = financialPositionStateUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

