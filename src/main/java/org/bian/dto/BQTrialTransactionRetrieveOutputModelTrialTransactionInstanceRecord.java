package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrialTransactionInitiateInputModelTrialTransactionInstanceRecordTrialTransactionRecord;

import javax.validation.Valid;
  
/**
 * BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceRecord
 */
public class BQTrialTransactionRetrieveOutputModelTrialTransactionInstanceRecord   {
  private String trialTransactionReference = null;

  private String trialTransactionType = null;

  private BQTrialTransactionInitiateInputModelTrialTransactionInstanceRecordTrialTransactionRecord trialTransactionRecord = null;

  private String trailTransactionPositionImpactAssessment = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: A trial transaction that will impacts a managed position) 
   * @return trialTransactionReference
  **/

  public String getTrialTransactionReference() {
    return trialTransactionReference;
  }

  public void setTrialTransactionReference(String trialTransactionReference) {
    this.trialTransactionReference = trialTransactionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  The type of transaction that would be applied to the managed position 
   * @return trialTransactionType
  **/

  public String getTrialTransactionType() {
    return trialTransactionType;
  }

  public void setTrialTransactionType(String trialTransactionType) {
    this.trialTransactionType = trialTransactionType;
  }


  /**
   * Get trialTransactionRecord
   * @return trialTransactionRecord
  **/

  public BQTrialTransactionInitiateInputModelTrialTransactionInstanceRecordTrialTransactionRecord getTrialTransactionRecord() {
    return trialTransactionRecord;
  }

  public void setTrialTransactionRecord(BQTrialTransactionInitiateInputModelTrialTransactionInstanceRecordTrialTransactionRecord trialTransactionRecord) {
    this.trialTransactionRecord = trialTransactionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The projected impact the trial transaction will have on the managed position 
   * @return trailTransactionPositionImpactAssessment
  **/

  public String getTrailTransactionPositionImpactAssessment() {
    return trailTransactionPositionImpactAssessment;
  }

  public void setTrailTransactionPositionImpactAssessment(String trailTransactionPositionImpactAssessment) {
    this.trailTransactionPositionImpactAssessment = trailTransactionPositionImpactAssessment;
  }


}

