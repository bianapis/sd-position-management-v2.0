package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrialTransactionUpdateInputModelTrialTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTrialTransactionUpdateInputModel
 */
public class BQTrialTransactionUpdateInputModel   {
  private String financialPositionStateInstanceReference = null;

  private String trialTransactionInstanceReference = null;

  private BQTrialTransactionUpdateInputModelTrialTransactionInstanceRecord trialTransactionInstanceRecord = null;

  private Object trialTransactionUpdateActionTaskRecord = null;

  private String trialTransactionUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Financial Position State instance 
   * @return financialPositionStateInstanceReference
  **/

  public String getFinancialPositionStateInstanceReference() {
    return financialPositionStateInstanceReference;
  }

  public void setFinancialPositionStateInstanceReference(String financialPositionStateInstanceReference) {
    this.financialPositionStateInstanceReference = financialPositionStateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Trial Transaction instance 
   * @return trialTransactionInstanceReference
  **/

  public String getTrialTransactionInstanceReference() {
    return trialTransactionInstanceReference;
  }

  public void setTrialTransactionInstanceReference(String trialTransactionInstanceReference) {
    this.trialTransactionInstanceReference = trialTransactionInstanceReference;
  }


  /**
   * Get trialTransactionInstanceRecord
   * @return trialTransactionInstanceRecord
  **/

  public BQTrialTransactionUpdateInputModelTrialTransactionInstanceRecord getTrialTransactionInstanceRecord() {
    return trialTransactionInstanceRecord;
  }

  public void setTrialTransactionInstanceRecord(BQTrialTransactionUpdateInputModelTrialTransactionInstanceRecord trialTransactionInstanceRecord) {
    this.trialTransactionInstanceRecord = trialTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return trialTransactionUpdateActionTaskRecord
  **/

  public Object getTrialTransactionUpdateActionTaskRecord() {
    return trialTransactionUpdateActionTaskRecord;
  }

  public void setTrialTransactionUpdateActionTaskRecord(Object trialTransactionUpdateActionTaskRecord) {
    this.trialTransactionUpdateActionTaskRecord = trialTransactionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return trialTransactionUpdateActionRequest
  **/

  public String getTrialTransactionUpdateActionRequest() {
    return trialTransactionUpdateActionRequest;
  }

  public void setTrialTransactionUpdateActionRequest(String trialTransactionUpdateActionRequest) {
    this.trialTransactionUpdateActionRequest = trialTransactionUpdateActionRequest;
  }


}

