package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrialTransactionRetrieveInputModelTrialTransactionInstanceAnalysis
 */
public class BQTrialTransactionRetrieveInputModelTrialTransactionInstanceAnalysis   {
  private String trialTransactionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return trialTransactionInstanceAnalysisReference
  **/

  public String getTrialTransactionInstanceAnalysisReference() {
    return trialTransactionInstanceAnalysisReference;
  }

  public void setTrialTransactionInstanceAnalysisReference(String trialTransactionInstanceAnalysisReference) {
    this.trialTransactionInstanceAnalysisReference = trialTransactionInstanceAnalysisReference;
  }


}

