package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrialTransactionInitiateInputModelTrialTransactionInstanceRecordTrialTransactionRecord
 */
public class BQTrialTransactionInitiateInputModelTrialTransactionInstanceRecordTrialTransactionRecord   {
  private String trialTransactionAmount = null;

  private String trialTransactionDate = null;

  private String trialTransactionBookingEntity = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The make up of the values of the transaction 
   * @return trialTransactionAmount
  **/

  public String getTrialTransactionAmount() {
    return trialTransactionAmount;
  }

  public void setTrialTransactionAmount(String trialTransactionAmount) {
    this.trialTransactionAmount = trialTransactionAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Key dates and times associated with the trial transaction 
   * @return trialTransactionDate
  **/

  public String getTrialTransactionDate() {
    return trialTransactionDate;
  }

  public void setTrialTransactionDate(String trialTransactionDate) {
    this.trialTransactionDate = trialTransactionDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The booking entity where the trial transaction would be made 
   * @return trialTransactionBookingEntity
  **/

  public String getTrialTransactionBookingEntity() {
    return trialTransactionBookingEntity;
  }

  public void setTrialTransactionBookingEntity(String trialTransactionBookingEntity) {
    this.trialTransactionBookingEntity = trialTransactionBookingEntity;
  }


}

