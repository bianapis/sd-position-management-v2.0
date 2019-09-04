package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionStateUpdateInputModelPositionManagementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateUpdateOutputModel
 */
public class CRFinancialPositionStateUpdateOutputModel   {
  private CRFinancialPositionStateUpdateInputModelPositionManagementInstanceRecord positionManagementInstanceRecord = null;

  private String financialPositionStateUpdateActionTaskReference = null;

  private Object financialPositionStateUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return financialPositionStateUpdateActionTaskReference
  **/

  public String getFinancialPositionStateUpdateActionTaskReference() {
    return financialPositionStateUpdateActionTaskReference;
  }

  public void setFinancialPositionStateUpdateActionTaskReference(String financialPositionStateUpdateActionTaskReference) {
    this.financialPositionStateUpdateActionTaskReference = financialPositionStateUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

