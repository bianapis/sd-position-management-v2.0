package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionApplicationInitiateInputModelPositionManagementInstanceRecord;
import org.bian.dto.BQTransactionApplicationInitiateInputModelTransactionApplicationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionApplicationInitiateInputModel
 */
public class BQTransactionApplicationInitiateInputModel   {
  private BQTransactionApplicationInitiateInputModelPositionManagementInstanceRecord positionManagementInstanceRecord = null;

  private String financialPositionStateInstanceReference = null;

  private Object transactionApplicationInitiateActionRecord = null;

  private BQTransactionApplicationInitiateInputModelTransactionApplicationInstanceRecord transactionApplicationInstanceRecord = null;


  /**
   * Get positionManagementInstanceRecord
   * @return positionManagementInstanceRecord
  **/

  public BQTransactionApplicationInitiateInputModelPositionManagementInstanceRecord getPositionManagementInstanceRecord() {
    return positionManagementInstanceRecord;
  }

  public void setPositionManagementInstanceRecord(BQTransactionApplicationInitiateInputModelPositionManagementInstanceRecord positionManagementInstanceRecord) {
    this.positionManagementInstanceRecord = positionManagementInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return transactionApplicationInitiateActionRecord
  **/

  public Object getTransactionApplicationInitiateActionRecord() {
    return transactionApplicationInitiateActionRecord;
  }

  public void setTransactionApplicationInitiateActionRecord(Object transactionApplicationInitiateActionRecord) {
    this.transactionApplicationInitiateActionRecord = transactionApplicationInitiateActionRecord;
  }


  /**
   * Get transactionApplicationInstanceRecord
   * @return transactionApplicationInstanceRecord
  **/

  public BQTransactionApplicationInitiateInputModelTransactionApplicationInstanceRecord getTransactionApplicationInstanceRecord() {
    return transactionApplicationInstanceRecord;
  }

  public void setTransactionApplicationInstanceRecord(BQTransactionApplicationInitiateInputModelTransactionApplicationInstanceRecord transactionApplicationInstanceRecord) {
    this.transactionApplicationInstanceRecord = transactionApplicationInstanceRecord;
  }


}

