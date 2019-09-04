package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionApplicationInitiateOutputModelTransactionApplicationInstanceRecord
 */
public class BQTransactionApplicationInitiateOutputModelTransactionApplicationInstanceRecord   {
  private String transactionPositionImpactAssessment = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The projected impact the trial transaction will have on the managed position 
   * @return transactionPositionImpactAssessment
  **/

  public String getTransactionPositionImpactAssessment() {
    return transactionPositionImpactAssessment;
  }

  public void setTransactionPositionImpactAssessment(String transactionPositionImpactAssessment) {
    this.transactionPositionImpactAssessment = transactionPositionImpactAssessment;
  }


}

