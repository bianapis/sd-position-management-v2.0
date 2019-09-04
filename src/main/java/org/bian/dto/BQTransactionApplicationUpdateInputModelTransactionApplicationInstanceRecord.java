package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionApplicationInitiateInputModelTransactionApplicationInstanceRecordTransactionRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionApplicationUpdateInputModelTransactionApplicationInstanceRecord
 */
public class BQTransactionApplicationUpdateInputModelTransactionApplicationInstanceRecord   {
  private String transactionReference = null;

  private String transactionType = null;

  private BQTransactionApplicationInitiateInputModelTransactionApplicationInstanceRecordTransactionRecord transactionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: A trial transaction that will impacts a managed position) 
   * @return transactionReference
  **/

  public String getTransactionReference() {
    return transactionReference;
  }

  public void setTransactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  The type of transaction that would be applied to the managed position 
   * @return transactionType
  **/

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  /**
   * Get transactionRecord
   * @return transactionRecord
  **/

  public BQTransactionApplicationInitiateInputModelTransactionApplicationInstanceRecordTransactionRecord getTransactionRecord() {
    return transactionRecord;
  }

  public void setTransactionRecord(BQTransactionApplicationInitiateInputModelTransactionApplicationInstanceRecordTransactionRecord transactionRecord) {
    this.transactionRecord = transactionRecord;
  }


}

