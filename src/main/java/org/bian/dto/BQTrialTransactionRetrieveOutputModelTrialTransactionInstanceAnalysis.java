package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceAnalysis
 */
public class BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceAnalysis   {
  private Object trialTransactionInstanceAnalysisRecord = null;

  private String trialTransactionInstanceAnalysisReportType = null;

  private String trialTransactionInstanceAnalysisParameters = null;

  private Object trialTransactionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return trialTransactionInstanceAnalysisRecord
  **/

  public Object getTrialTransactionInstanceAnalysisRecord() {
    return trialTransactionInstanceAnalysisRecord;
  }

  public void setTrialTransactionInstanceAnalysisRecord(Object trialTransactionInstanceAnalysisRecord) {
    this.trialTransactionInstanceAnalysisRecord = trialTransactionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return trialTransactionInstanceAnalysisReportType
  **/

  public String getTrialTransactionInstanceAnalysisReportType() {
    return trialTransactionInstanceAnalysisReportType;
  }

  public void setTrialTransactionInstanceAnalysisReportType(String trialTransactionInstanceAnalysisReportType) {
    this.trialTransactionInstanceAnalysisReportType = trialTransactionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return trialTransactionInstanceAnalysisParameters
  **/

  public String getTrialTransactionInstanceAnalysisParameters() {
    return trialTransactionInstanceAnalysisParameters;
  }

  public void setTrialTransactionInstanceAnalysisParameters(String trialTransactionInstanceAnalysisParameters) {
    this.trialTransactionInstanceAnalysisParameters = trialTransactionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return trialTransactionInstanceAnalysisReport
  **/

  public Object getTrialTransactionInstanceAnalysisReport() {
    return trialTransactionInstanceAnalysisReport;
  }

  public void setTrialTransactionInstanceAnalysisReport(Object trialTransactionInstanceAnalysisReport) {
    this.trialTransactionInstanceAnalysisReport = trialTransactionInstanceAnalysisReport;
  }


}

