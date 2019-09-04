package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrialTransactionRetrieveInputModelTrialTransactionInstanceAnalysis;
import org.bian.dto.BQTrialTransactionRetrieveInputModelTrialTransactionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTrialTransactionRetrieveInputModel
 */
public class BQTrialTransactionRetrieveInputModel   {
  private Object trialTransactionRetrieveActionTaskRecord = null;

  private String trialTransactionRetrieveActionRequest = null;

  private BQTrialTransactionRetrieveInputModelTrialTransactionInstanceReport trialTransactionInstanceReport = null;

  private BQTrialTransactionRetrieveInputModelTrialTransactionInstanceAnalysis trialTransactionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return trialTransactionRetrieveActionTaskRecord
  **/

  public Object getTrialTransactionRetrieveActionTaskRecord() {
    return trialTransactionRetrieveActionTaskRecord;
  }

  public void setTrialTransactionRetrieveActionTaskRecord(Object trialTransactionRetrieveActionTaskRecord) {
    this.trialTransactionRetrieveActionTaskRecord = trialTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return trialTransactionRetrieveActionRequest
  **/

  public String getTrialTransactionRetrieveActionRequest() {
    return trialTransactionRetrieveActionRequest;
  }

  public void setTrialTransactionRetrieveActionRequest(String trialTransactionRetrieveActionRequest) {
    this.trialTransactionRetrieveActionRequest = trialTransactionRetrieveActionRequest;
  }


  /**
   * Get trialTransactionInstanceReport
   * @return trialTransactionInstanceReport
  **/

  public BQTrialTransactionRetrieveInputModelTrialTransactionInstanceReport getTrialTransactionInstanceReport() {
    return trialTransactionInstanceReport;
  }

  public void setTrialTransactionInstanceReport(BQTrialTransactionRetrieveInputModelTrialTransactionInstanceReport trialTransactionInstanceReport) {
    this.trialTransactionInstanceReport = trialTransactionInstanceReport;
  }


  /**
   * Get trialTransactionInstanceAnalysis
   * @return trialTransactionInstanceAnalysis
  **/

  public BQTrialTransactionRetrieveInputModelTrialTransactionInstanceAnalysis getTrialTransactionInstanceAnalysis() {
    return trialTransactionInstanceAnalysis;
  }

  public void setTrialTransactionInstanceAnalysis(BQTrialTransactionRetrieveInputModelTrialTransactionInstanceAnalysis trialTransactionInstanceAnalysis) {
    this.trialTransactionInstanceAnalysis = trialTransactionInstanceAnalysis;
  }


}

