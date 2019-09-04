package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateRetrieveOutputModelFinancialPositionStateInstanceReportRecord
 */
public class CRFinancialPositionStateRetrieveOutputModelFinancialPositionStateInstanceReportRecord   {
  private String financialPositionStateInstanceReportData = null;

  private String financialPositionStateInstanceReportType = null;

  private Object financialPositionStateInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialPositionStateInstanceReportData
  **/

  public String getFinancialPositionStateInstanceReportData() {
    return financialPositionStateInstanceReportData;
  }

  public void setFinancialPositionStateInstanceReportData(String financialPositionStateInstanceReportData) {
    this.financialPositionStateInstanceReportData = financialPositionStateInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialPositionStateInstanceReport
  **/

  public Object getFinancialPositionStateInstanceReport() {
    return financialPositionStateInstanceReport;
  }

  public void setFinancialPositionStateInstanceReport(Object financialPositionStateInstanceReport) {
    this.financialPositionStateInstanceReport = financialPositionStateInstanceReport;
  }


}

