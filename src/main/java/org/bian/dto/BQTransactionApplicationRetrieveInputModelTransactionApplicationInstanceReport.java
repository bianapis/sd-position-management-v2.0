package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionApplicationRetrieveInputModelTransactionApplicationInstanceReport
 */
public class BQTransactionApplicationRetrieveInputModelTransactionApplicationInstanceReport   {
  private String transactionApplicationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return transactionApplicationInstanceReportReference
  **/

  public String getTransactionApplicationInstanceReportReference() {
    return transactionApplicationInstanceReportReference;
  }

  public void setTransactionApplicationInstanceReportReference(String transactionApplicationInstanceReportReference) {
    this.transactionApplicationInstanceReportReference = transactionApplicationInstanceReportReference;
  }


}

