package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrialTransactionUpdateInputModelTrialTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTrialTransactionUpdateOutputModel
 */
public class BQTrialTransactionUpdateOutputModel   {
  private BQTrialTransactionUpdateInputModelTrialTransactionInstanceRecord trialTransactionInstanceRecord = null;

  private String trialTransactionUpdateActionTaskReference = null;

  private Object trialTransactionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return trialTransactionUpdateActionTaskReference
  **/

  public String getTrialTransactionUpdateActionTaskReference() {
    return trialTransactionUpdateActionTaskReference;
  }

  public void setTrialTransactionUpdateActionTaskReference(String trialTransactionUpdateActionTaskReference) {
    this.trialTransactionUpdateActionTaskReference = trialTransactionUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

