package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceReport
 */
public class BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceReport   {
  private Object trialTransactionInstanceReportRecord = null;

  private String trialTransactionInstanceReportType = null;

  private String trialTransactionInstanceReportParameters = null;

  private Object trialTransactionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return trialTransactionInstanceReportRecord
  **/

  public Object getTrialTransactionInstanceReportRecord() {
    return trialTransactionInstanceReportRecord;
  }

  public void setTrialTransactionInstanceReportRecord(Object trialTransactionInstanceReportRecord) {
    this.trialTransactionInstanceReportRecord = trialTransactionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return trialTransactionInstanceReportType
  **/

  public String getTrialTransactionInstanceReportType() {
    return trialTransactionInstanceReportType;
  }

  public void setTrialTransactionInstanceReportType(String trialTransactionInstanceReportType) {
    this.trialTransactionInstanceReportType = trialTransactionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return trialTransactionInstanceReportParameters
  **/

  public String getTrialTransactionInstanceReportParameters() {
    return trialTransactionInstanceReportParameters;
  }

  public void setTrialTransactionInstanceReportParameters(String trialTransactionInstanceReportParameters) {
    this.trialTransactionInstanceReportParameters = trialTransactionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return trialTransactionInstanceReport
  **/

  public Object getTrialTransactionInstanceReport() {
    return trialTransactionInstanceReport;
  }

  public void setTrialTransactionInstanceReport(Object trialTransactionInstanceReport) {
    this.trialTransactionInstanceReport = trialTransactionInstanceReport;
  }


}

