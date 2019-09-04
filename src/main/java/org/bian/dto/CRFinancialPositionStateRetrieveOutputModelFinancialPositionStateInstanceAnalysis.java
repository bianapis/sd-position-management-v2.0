package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateRetrieveOutputModelFinancialPositionStateInstanceAnalysis
 */
public class CRFinancialPositionStateRetrieveOutputModelFinancialPositionStateInstanceAnalysis   {
  private String financialPositionStateInstanceAnalysisData = null;

  private String financialPositionStateInstanceAnalysisReportType = null;

  private Object financialPositionStateInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialPositionStateInstanceAnalysisData
  **/

  public String getFinancialPositionStateInstanceAnalysisData() {
    return financialPositionStateInstanceAnalysisData;
  }

  public void setFinancialPositionStateInstanceAnalysisData(String financialPositionStateInstanceAnalysisData) {
    this.financialPositionStateInstanceAnalysisData = financialPositionStateInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return financialPositionStateInstanceAnalysisReport
  **/

  public Object getFinancialPositionStateInstanceAnalysisReport() {
    return financialPositionStateInstanceAnalysisReport;
  }

  public void setFinancialPositionStateInstanceAnalysisReport(Object financialPositionStateInstanceAnalysisReport) {
    this.financialPositionStateInstanceAnalysisReport = financialPositionStateInstanceAnalysisReport;
  }


}

