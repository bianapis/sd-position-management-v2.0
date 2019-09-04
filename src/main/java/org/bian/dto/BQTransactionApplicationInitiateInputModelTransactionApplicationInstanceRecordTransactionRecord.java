package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionApplicationInitiateInputModelTransactionApplicationInstanceRecordTransactionRecord
 */
public class BQTransactionApplicationInitiateInputModelTransactionApplicationInstanceRecordTransactionRecord   {
  private String transactionAmount = null;

  private String transactionDate = null;

  private String transactionBookingEntity = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The make up of the values of the transaction 
   * @return transactionAmount
  **/

  public String getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(String transactionAmount) {
    this.transactionAmount = transactionAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Key dates and times associated with the trial transaction 
   * @return transactionDate
  **/

  public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The booking entity where the trial transaction would be made 
   * @return transactionBookingEntity
  **/

  public String getTransactionBookingEntity() {
    return transactionBookingEntity;
  }

  public void setTransactionBookingEntity(String transactionBookingEntity) {
    this.transactionBookingEntity = transactionBookingEntity;
  }


}

