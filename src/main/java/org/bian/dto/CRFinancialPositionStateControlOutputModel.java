package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateControlOutputModel
 */
public class CRFinancialPositionStateControlOutputModel   {
  private String financialPositionStateControlActionTaskReference = null;

  private Object financialPositionStateControlActionTaskRecord = null;

  private String financialPositionStateControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Position State instance control processing service call 
   * @return financialPositionStateControlActionTaskReference
  **/

  public String getFinancialPositionStateControlActionTaskReference() {
    return financialPositionStateControlActionTaskReference;
  }

  public void setFinancialPositionStateControlActionTaskReference(String financialPositionStateControlActionTaskReference) {
    this.financialPositionStateControlActionTaskReference = financialPositionStateControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return financialPositionStateControlActionResponse
  **/

  public String getFinancialPositionStateControlActionResponse() {
    return financialPositionStateControlActionResponse;
  }

  public void setFinancialPositionStateControlActionResponse(String financialPositionStateControlActionResponse) {
    this.financialPositionStateControlActionResponse = financialPositionStateControlActionResponse;
  }


}

