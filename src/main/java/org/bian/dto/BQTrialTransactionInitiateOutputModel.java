package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrialTransactionInitiateInputModelPositionManagementInstanceRecord;
import org.bian.dto.BQTrialTransactionInitiateOutputModelTrialTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTrialTransactionInitiateOutputModel
 */
public class BQTrialTransactionInitiateOutputModel   {
  private BQTrialTransactionInitiateInputModelPositionManagementInstanceRecord positionManagementInstanceRecord = null;

  private String trialTransactionInstanceReference = null;

  private String trialTransactionInitiateActionReference = null;

  private Object trialTransactionInitiateActionRecord = null;

  private String trialTransactionInstanceStatus = null;

  private BQTrialTransactionInitiateOutputModelTrialTransactionInstanceRecord trialTransactionInstanceRecord = null;


  /**
   * Get positionManagementInstanceRecord
   * @return positionManagementInstanceRecord
  **/

  public BQTrialTransactionInitiateInputModelPositionManagementInstanceRecord getPositionManagementInstanceRecord() {
    return positionManagementInstanceRecord;
  }

  public void setPositionManagementInstanceRecord(BQTrialTransactionInitiateInputModelPositionManagementInstanceRecord positionManagementInstanceRecord) {
    this.positionManagementInstanceRecord = positionManagementInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return trialTransactionInitiateActionReference
  **/

  public String getTrialTransactionInitiateActionReference() {
    return trialTransactionInitiateActionReference;
  }

  public void setTrialTransactionInitiateActionReference(String trialTransactionInitiateActionReference) {
    this.trialTransactionInitiateActionReference = trialTransactionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return trialTransactionInitiateActionRecord
  **/

  public Object getTrialTransactionInitiateActionRecord() {
    return trialTransactionInitiateActionRecord;
  }

  public void setTrialTransactionInitiateActionRecord(Object trialTransactionInitiateActionRecord) {
    this.trialTransactionInitiateActionRecord = trialTransactionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Trial Transaction instance (e.g. initialised, pending, active) 
   * @return trialTransactionInstanceStatus
  **/

  public String getTrialTransactionInstanceStatus() {
    return trialTransactionInstanceStatus;
  }

  public void setTrialTransactionInstanceStatus(String trialTransactionInstanceStatus) {
    this.trialTransactionInstanceStatus = trialTransactionInstanceStatus;
  }


  /**
   * Get trialTransactionInstanceRecord
   * @return trialTransactionInstanceRecord
  **/

  public BQTrialTransactionInitiateOutputModelTrialTransactionInstanceRecord getTrialTransactionInstanceRecord() {
    return trialTransactionInstanceRecord;
  }

  public void setTrialTransactionInstanceRecord(BQTrialTransactionInitiateOutputModelTrialTransactionInstanceRecord trialTransactionInstanceRecord) {
    this.trialTransactionInstanceRecord = trialTransactionInstanceRecord;
  }


}

