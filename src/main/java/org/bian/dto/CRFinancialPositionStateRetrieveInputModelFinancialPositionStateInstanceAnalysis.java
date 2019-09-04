package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateRetrieveInputModelFinancialPositionStateInstanceAnalysis
 */
public class CRFinancialPositionStateRetrieveInputModelFinancialPositionStateInstanceAnalysis   {
  private String financialPositionStateInstanceAnalysisReference = null;

  private String financialPositionStateInstanceAnalysisReportType = null;

  private String financialPositionStateInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return financialPositionStateInstanceAnalysisReference
  **/

  public String getFinancialPositionStateInstanceAnalysisReference() {
    return financialPositionStateInstanceAnalysisReference;
  }

  public void setFinancialPositionStateInstanceAnalysisReference(String financialPositionStateInstanceAnalysisReference) {
    this.financialPositionStateInstanceAnalysisReference = financialPositionStateInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialPositionStateInstanceAnalysisReportType
  **/

  public String getFinancialPositionStateInstanceAnalysisReportType() {
    return financialPositionStateInstanceAnalysisReportType;
  }

  public void setFinancialPositionStateInstanceAnalysisReportType(String financialPositionStateInstanceAnalysisReportType) {
    this.financialPositionStateInstanceAnalysisReportType = financialPositionStateInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialPositionStateInstanceAnalysisParameters
  **/

  public String getFinancialPositionStateInstanceAnalysisParameters() {
    return financialPositionStateInstanceAnalysisParameters;
  }

  public void setFinancialPositionStateInstanceAnalysisParameters(String financialPositionStateInstanceAnalysisParameters) {
    this.financialPositionStateInstanceAnalysisParameters = financialPositionStateInstanceAnalysisParameters;
  }


}

