package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrialTransactionInitiateInputModelPositionManagementInstanceRecord;
import org.bian.dto.BQTrialTransactionInitiateInputModelTrialTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTrialTransactionInitiateInputModel
 */
public class BQTrialTransactionInitiateInputModel   {
  private BQTrialTransactionInitiateInputModelPositionManagementInstanceRecord positionManagementInstanceRecord = null;

  private String financialPositionStateInstanceReference = null;

  private Object trialTransactionInitiateActionRecord = null;

  private BQTrialTransactionInitiateInputModelTrialTransactionInstanceRecord trialTransactionInstanceRecord = null;


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
   * @return trialTransactionInitiateActionRecord
  **/

  public Object getTrialTransactionInitiateActionRecord() {
    return trialTransactionInitiateActionRecord;
  }

  public void setTrialTransactionInitiateActionRecord(Object trialTransactionInitiateActionRecord) {
    this.trialTransactionInitiateActionRecord = trialTransactionInitiateActionRecord;
  }


  /**
   * Get trialTransactionInstanceRecord
   * @return trialTransactionInstanceRecord
  **/

  public BQTrialTransactionInitiateInputModelTrialTransactionInstanceRecord getTrialTransactionInstanceRecord() {
    return trialTransactionInstanceRecord;
  }

  public void setTrialTransactionInstanceRecord(BQTrialTransactionInitiateInputModelTrialTransactionInstanceRecord trialTransactionInstanceRecord) {
    this.trialTransactionInstanceRecord = trialTransactionInstanceRecord;
  }


}

