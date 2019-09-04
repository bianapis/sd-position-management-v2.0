package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionApplicationUpdateInputModelTransactionApplicationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionApplicationUpdateInputModel
 */
public class BQTransactionApplicationUpdateInputModel   {
  private String financialPositionStateInstanceReference = null;

  private String transactionApplicationInstanceReference = null;

  private BQTransactionApplicationUpdateInputModelTransactionApplicationInstanceRecord transactionApplicationInstanceRecord = null;

  private Object transactionApplicationUpdateActionTaskRecord = null;

  private String transactionApplicationUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Application instance 
   * @return transactionApplicationInstanceReference
  **/

  public String getTransactionApplicationInstanceReference() {
    return transactionApplicationInstanceReference;
  }

  public void setTransactionApplicationInstanceReference(String transactionApplicationInstanceReference) {
    this.transactionApplicationInstanceReference = transactionApplicationInstanceReference;
  }


  /**
   * Get transactionApplicationInstanceRecord
   * @return transactionApplicationInstanceRecord
  **/

  public BQTransactionApplicationUpdateInputModelTransactionApplicationInstanceRecord getTransactionApplicationInstanceRecord() {
    return transactionApplicationInstanceRecord;
  }

  public void setTransactionApplicationInstanceRecord(BQTransactionApplicationUpdateInputModelTransactionApplicationInstanceRecord transactionApplicationInstanceRecord) {
    this.transactionApplicationInstanceRecord = transactionApplicationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return transactionApplicationUpdateActionTaskRecord
  **/

  public Object getTransactionApplicationUpdateActionTaskRecord() {
    return transactionApplicationUpdateActionTaskRecord;
  }

  public void setTransactionApplicationUpdateActionTaskRecord(Object transactionApplicationUpdateActionTaskRecord) {
    this.transactionApplicationUpdateActionTaskRecord = transactionApplicationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return transactionApplicationUpdateActionRequest
  **/

  public String getTransactionApplicationUpdateActionRequest() {
    return transactionApplicationUpdateActionRequest;
  }

  public void setTransactionApplicationUpdateActionRequest(String transactionApplicationUpdateActionRequest) {
    this.transactionApplicationUpdateActionRequest = transactionApplicationUpdateActionRequest;
  }


}

