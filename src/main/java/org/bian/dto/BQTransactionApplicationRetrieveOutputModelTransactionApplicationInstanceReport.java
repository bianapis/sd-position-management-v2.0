package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceReport
 */
public class BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceReport   {
  private Object transactionApplicationInstanceReportRecord = null;

  private String transactionApplicationInstanceReportType = null;

  private String transactionApplicationInstanceReportParameters = null;

  private Object transactionApplicationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return transactionApplicationInstanceReportRecord
  **/

  public Object getTransactionApplicationInstanceReportRecord() {
    return transactionApplicationInstanceReportRecord;
  }

  public void setTransactionApplicationInstanceReportRecord(Object transactionApplicationInstanceReportRecord) {
    this.transactionApplicationInstanceReportRecord = transactionApplicationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return transactionApplicationInstanceReportType
  **/

  public String getTransactionApplicationInstanceReportType() {
    return transactionApplicationInstanceReportType;
  }

  public void setTransactionApplicationInstanceReportType(String transactionApplicationInstanceReportType) {
    this.transactionApplicationInstanceReportType = transactionApplicationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return transactionApplicationInstanceReportParameters
  **/

  public String getTransactionApplicationInstanceReportParameters() {
    return transactionApplicationInstanceReportParameters;
  }

  public void setTransactionApplicationInstanceReportParameters(String transactionApplicationInstanceReportParameters) {
    this.transactionApplicationInstanceReportParameters = transactionApplicationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return transactionApplicationInstanceReport
  **/

  public Object getTransactionApplicationInstanceReport() {
    return transactionApplicationInstanceReport;
  }

  public void setTransactionApplicationInstanceReport(Object transactionApplicationInstanceReport) {
    this.transactionApplicationInstanceReport = transactionApplicationInstanceReport;
  }


}

