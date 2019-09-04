package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionApplicationInitiateInputModelPositionManagementInstanceRecord;
import org.bian.dto.BQTransactionApplicationInitiateOutputModelTransactionApplicationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionApplicationInitiateOutputModel
 */
public class BQTransactionApplicationInitiateOutputModel   {
  private BQTransactionApplicationInitiateInputModelPositionManagementInstanceRecord positionManagementInstanceRecord = null;

  private String transactionApplicationInstanceReference = null;

  private String transactionApplicationInitiateActionReference = null;

  private Object transactionApplicationInitiateActionRecord = null;

  private String transactionApplicationInstanceStatus = null;

  private BQTransactionApplicationInitiateOutputModelTransactionApplicationInstanceRecord transactionApplicationInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return transactionApplicationInitiateActionReference
  **/

  public String getTransactionApplicationInitiateActionReference() {
    return transactionApplicationInitiateActionReference;
  }

  public void setTransactionApplicationInitiateActionReference(String transactionApplicationInitiateActionReference) {
    this.transactionApplicationInitiateActionReference = transactionApplicationInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Transaction Application instance (e.g. initialised, pending, active) 
   * @return transactionApplicationInstanceStatus
  **/

  public String getTransactionApplicationInstanceStatus() {
    return transactionApplicationInstanceStatus;
  }

  public void setTransactionApplicationInstanceStatus(String transactionApplicationInstanceStatus) {
    this.transactionApplicationInstanceStatus = transactionApplicationInstanceStatus;
  }


  /**
   * Get transactionApplicationInstanceRecord
   * @return transactionApplicationInstanceRecord
  **/

  public BQTransactionApplicationInitiateOutputModelTransactionApplicationInstanceRecord getTransactionApplicationInstanceRecord() {
    return transactionApplicationInstanceRecord;
  }

  public void setTransactionApplicationInstanceRecord(BQTransactionApplicationInitiateOutputModelTransactionApplicationInstanceRecord transactionApplicationInstanceRecord) {
    this.transactionApplicationInstanceRecord = transactionApplicationInstanceRecord;
  }


}

