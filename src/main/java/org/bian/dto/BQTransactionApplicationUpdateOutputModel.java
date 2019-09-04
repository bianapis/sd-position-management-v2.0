package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionApplicationUpdateInputModelTransactionApplicationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionApplicationUpdateOutputModel
 */
public class BQTransactionApplicationUpdateOutputModel   {
  private BQTransactionApplicationUpdateInputModelTransactionApplicationInstanceRecord transactionApplicationInstanceRecord = null;

  private String transactionApplicationUpdateActionTaskReference = null;

  private Object transactionApplicationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return transactionApplicationUpdateActionTaskReference
  **/

  public String getTransactionApplicationUpdateActionTaskReference() {
    return transactionApplicationUpdateActionTaskReference;
  }

  public void setTransactionApplicationUpdateActionTaskReference(String transactionApplicationUpdateActionTaskReference) {
    this.transactionApplicationUpdateActionTaskReference = transactionApplicationUpdateActionTaskReference;
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

