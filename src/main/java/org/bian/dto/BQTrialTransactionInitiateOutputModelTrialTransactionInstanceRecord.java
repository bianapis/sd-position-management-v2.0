package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrialTransactionInitiateOutputModelTrialTransactionInstanceRecord
 */
public class BQTrialTransactionInitiateOutputModelTrialTransactionInstanceRecord   {
  private String trailTransactionPositionImpactAssessment = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The projected impact the trial transaction will have on the managed position 
   * @return trailTransactionPositionImpactAssessment
  **/

  public String getTrailTransactionPositionImpactAssessment() {
    return trailTransactionPositionImpactAssessment;
  }

  public void setTrailTransactionPositionImpactAssessment(String trailTransactionPositionImpactAssessment) {
    this.trailTransactionPositionImpactAssessment = trailTransactionPositionImpactAssessment;
  }


}

