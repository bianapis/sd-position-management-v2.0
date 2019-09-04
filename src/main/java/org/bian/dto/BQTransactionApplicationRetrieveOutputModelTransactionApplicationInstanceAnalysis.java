package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceAnalysis
 */
public class BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceAnalysis   {
  private Object transactionApplicationInstanceAnalysisRecord = null;

  private String transactionApplicationInstanceAnalysisReportType = null;

  private String transactionApplicationInstanceAnalysisParameters = null;

  private Object transactionApplicationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return transactionApplicationInstanceAnalysisRecord
  **/

  public Object getTransactionApplicationInstanceAnalysisRecord() {
    return transactionApplicationInstanceAnalysisRecord;
  }

  public void setTransactionApplicationInstanceAnalysisRecord(Object transactionApplicationInstanceAnalysisRecord) {
    this.transactionApplicationInstanceAnalysisRecord = transactionApplicationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return transactionApplicationInstanceAnalysisReportType
  **/

  public String getTransactionApplicationInstanceAnalysisReportType() {
    return transactionApplicationInstanceAnalysisReportType;
  }

  public void setTransactionApplicationInstanceAnalysisReportType(String transactionApplicationInstanceAnalysisReportType) {
    this.transactionApplicationInstanceAnalysisReportType = transactionApplicationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return transactionApplicationInstanceAnalysisParameters
  **/

  public String getTransactionApplicationInstanceAnalysisParameters() {
    return transactionApplicationInstanceAnalysisParameters;
  }

  public void setTransactionApplicationInstanceAnalysisParameters(String transactionApplicationInstanceAnalysisParameters) {
    this.transactionApplicationInstanceAnalysisParameters = transactionApplicationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return transactionApplicationInstanceAnalysisReport
  **/

  public Object getTransactionApplicationInstanceAnalysisReport() {
    return transactionApplicationInstanceAnalysisReport;
  }

  public void setTransactionApplicationInstanceAnalysisReport(Object transactionApplicationInstanceAnalysisReport) {
    this.transactionApplicationInstanceAnalysisReport = transactionApplicationInstanceAnalysisReport;
  }


}

