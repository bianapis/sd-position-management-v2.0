package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateRetrieveInputModelFinancialPositionStateInstanceReportRecord
 */
public class CRFinancialPositionStateRetrieveInputModelFinancialPositionStateInstanceReportRecord   {
  private String financialPositionStateInstanceReportReference = null;

  private String financialPositionStateInstanceReportType = null;

  private String financialPositionStateInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return financialPositionStateInstanceReportReference
  **/

  public String getFinancialPositionStateInstanceReportReference() {
    return financialPositionStateInstanceReportReference;
  }

  public void setFinancialPositionStateInstanceReportReference(String financialPositionStateInstanceReportReference) {
    this.financialPositionStateInstanceReportReference = financialPositionStateInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialPositionStateInstanceReportType
  **/

  public String getFinancialPositionStateInstanceReportType() {
    return financialPositionStateInstanceReportType;
  }

  public void setFinancialPositionStateInstanceReportType(String financialPositionStateInstanceReportType) {
    this.financialPositionStateInstanceReportType = financialPositionStateInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialPositionStateInstanceReportParameters
  **/

  public String getFinancialPositionStateInstanceReportParameters() {
    return financialPositionStateInstanceReportParameters;
  }

  public void setFinancialPositionStateInstanceReportParameters(String financialPositionStateInstanceReportParameters) {
    this.financialPositionStateInstanceReportParameters = financialPositionStateInstanceReportParameters;
  }


}

