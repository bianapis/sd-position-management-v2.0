package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrialTransactionRetrieveInputModelTrialTransactionInstanceReport
 */
public class BQTrialTransactionRetrieveInputModelTrialTransactionInstanceReport   {
  private String trialTransactionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return trialTransactionInstanceReportReference
  **/

  public String getTrialTransactionInstanceReportReference() {
    return trialTransactionInstanceReportReference;
  }

  public void setTrialTransactionInstanceReportReference(String trialTransactionInstanceReportReference) {
    this.trialTransactionInstanceReportReference = trialTransactionInstanceReportReference;
  }


}

