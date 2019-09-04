package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceAnalysis;
import org.bian.dto.BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceRecord;
import org.bian.dto.BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTrialTransactionRetrieveOutputModel
 */
public class BQTrialTransactionRetrieveOutputModel   {
  private BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceRecord trialTransactionInstanceRecord = null;

  private String trialTransactionRetrieveActionTaskReference = null;

  private Object trialTransactionRetrieveActionTaskRecord = null;

  private String trialTransactionRetrieveActionResponse = null;

  private BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceReport trialTransactionInstanceReport = null;

  private BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceAnalysis trialTransactionInstanceAnalysis = null;


  /**
   * Get trialTransactionInstanceRecord
   * @return trialTransactionInstanceRecord
  **/

  public BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceRecord getTrialTransactionInstanceRecord() {
    return trialTransactionInstanceRecord;
  }

  public void setTrialTransactionInstanceRecord(BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceRecord trialTransactionInstanceRecord) {
    this.trialTransactionInstanceRecord = trialTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Trial Transaction instance retrieve service call 
   * @return trialTransactionRetrieveActionTaskReference
  **/

  public String getTrialTransactionRetrieveActionTaskReference() {
    return trialTransactionRetrieveActionTaskReference;
  }

  public void setTrialTransactionRetrieveActionTaskReference(String trialTransactionRetrieveActionTaskReference) {
    this.trialTransactionRetrieveActionTaskReference = trialTransactionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return trialTransactionRetrieveActionResponse
  **/

  public String getTrialTransactionRetrieveActionResponse() {
    return trialTransactionRetrieveActionResponse;
  }

  public void setTrialTransactionRetrieveActionResponse(String trialTransactionRetrieveActionResponse) {
    this.trialTransactionRetrieveActionResponse = trialTransactionRetrieveActionResponse;
  }


  /**
   * Get trialTransactionInstanceReport
   * @return trialTransactionInstanceReport
  **/

  public BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceReport getTrialTransactionInstanceReport() {
    return trialTransactionInstanceReport;
  }

  public void setTrialTransactionInstanceReport(BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceReport trialTransactionInstanceReport) {
    this.trialTransactionInstanceReport = trialTransactionInstanceReport;
  }


  /**
   * Get trialTransactionInstanceAnalysis
   * @return trialTransactionInstanceAnalysis
  **/

  public BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceAnalysis getTrialTransactionInstanceAnalysis() {
    return trialTransactionInstanceAnalysis;
  }

  public void setTrialTransactionInstanceAnalysis(BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceAnalysis trialTransactionInstanceAnalysis) {
    this.trialTransactionInstanceAnalysis = trialTransactionInstanceAnalysis;
  }


}

