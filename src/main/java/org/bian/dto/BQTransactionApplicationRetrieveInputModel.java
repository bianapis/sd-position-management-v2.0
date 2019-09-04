package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionApplicationRetrieveInputModelTransactionApplicationInstanceAnalysis;
import org.bian.dto.BQTransactionApplicationRetrieveInputModelTransactionApplicationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransactionApplicationRetrieveInputModel
 */
public class BQTransactionApplicationRetrieveInputModel   {
  private Object transactionApplicationRetrieveActionTaskRecord = null;

  private String transactionApplicationRetrieveActionRequest = null;

  private BQTransactionApplicationRetrieveInputModelTransactionApplicationInstanceReport transactionApplicationInstanceReport = null;

  private BQTransactionApplicationRetrieveInputModelTransactionApplicationInstanceAnalysis transactionApplicationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return transactionApplicationRetrieveActionTaskRecord
  **/

  public Object getTransactionApplicationRetrieveActionTaskRecord() {
    return transactionApplicationRetrieveActionTaskRecord;
  }

  public void setTransactionApplicationRetrieveActionTaskRecord(Object transactionApplicationRetrieveActionTaskRecord) {
    this.transactionApplicationRetrieveActionTaskRecord = transactionApplicationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return transactionApplicationRetrieveActionRequest
  **/

  public String getTransactionApplicationRetrieveActionRequest() {
    return transactionApplicationRetrieveActionRequest;
  }

  public void setTransactionApplicationRetrieveActionRequest(String transactionApplicationRetrieveActionRequest) {
    this.transactionApplicationRetrieveActionRequest = transactionApplicationRetrieveActionRequest;
  }


  /**
   * Get transactionApplicationInstanceReport
   * @return transactionApplicationInstanceReport
  **/

  public BQTransactionApplicationRetrieveInputModelTransactionApplicationInstanceReport getTransactionApplicationInstanceReport() {
    return transactionApplicationInstanceReport;
  }

  public void setTransactionApplicationInstanceReport(BQTransactionApplicationRetrieveInputModelTransactionApplicationInstanceReport transactionApplicationInstanceReport) {
    this.transactionApplicationInstanceReport = transactionApplicationInstanceReport;
  }


  /**
   * Get transactionApplicationInstanceAnalysis
   * @return transactionApplicationInstanceAnalysis
  **/

  public BQTransactionApplicationRetrieveInputModelTransactionApplicationInstanceAnalysis getTransactionApplicationInstanceAnalysis() {
    return transactionApplicationInstanceAnalysis;
  }

  public void setTransactionApplicationInstanceAnalysis(BQTransactionApplicationRetrieveInputModelTransactionApplicationInstanceAnalysis transactionApplicationInstanceAnalysis) {
    this.transactionApplicationInstanceAnalysis = transactionApplicationInstanceAnalysis;
  }


}

