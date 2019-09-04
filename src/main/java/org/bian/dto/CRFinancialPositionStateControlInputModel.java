package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionStateControlInputModelFinancialPositionStateControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateControlInputModel
 */
public class CRFinancialPositionStateControlInputModel   {
  private String positionManagementServicingSessionReference = null;

  private String financialPositionStateInstanceReference = null;

  private Object financialPositionStateControlActionTaskRecord = null;

  private CRFinancialPositionStateControlInputModelFinancialPositionStateControlActionRequest financialPositionStateControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return financialPositionStateControlActionTaskRecord
  **/

  public Object getFinancialPositionStateControlActionTaskRecord() {
    return financialPositionStateControlActionTaskRecord;
  }

  public void setFinancialPositionStateControlActionTaskRecord(Object financialPositionStateControlActionTaskRecord) {
    this.financialPositionStateControlActionTaskRecord = financialPositionStateControlActionTaskRecord;
  }


  /**
   * Get financialPositionStateControlActionRequest
   * @return financialPositionStateControlActionRequest
  **/

  public CRFinancialPositionStateControlInputModelFinancialPositionStateControlActionRequest getFinancialPositionStateControlActionRequest() {
    return financialPositionStateControlActionRequest;
  }

  public void setFinancialPositionStateControlActionRequest(CRFinancialPositionStateControlInputModelFinancialPositionStateControlActionRequest financialPositionStateControlActionRequest) {
    this.financialPositionStateControlActionRequest = financialPositionStateControlActionRequest;
  }


}

