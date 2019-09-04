package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionApplicationRetrieveInputModelTransactionApplicationInstanceAnalysis
 */
public class BQTransactionApplicationRetrieveInputModelTransactionApplicationInstanceAnalysis   {
  private String transactionApplicationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return transactionApplicationInstanceAnalysisReference
  **/

  public String getTransactionApplicationInstanceAnalysisReference() {
    return transactionApplicationInstanceAnalysisReference;
  }

  public void setTransactionApplicationInstanceAnalysisReference(String transactionApplicationInstanceAnalysisReference) {
    this.transactionApplicationInstanceAnalysisReference = transactionApplicationInstanceAnalysisReference;
  }


}

