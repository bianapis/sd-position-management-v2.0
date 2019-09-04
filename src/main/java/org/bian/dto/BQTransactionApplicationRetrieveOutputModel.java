package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceAnalysis;
import org.bian.dto.BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceRecord;
import org.bian.dto.BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransactionApplicationRetrieveOutputModel
 */
public class BQTransactionApplicationRetrieveOutputModel   {
  private BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceRecord transactionApplicationInstanceRecord = null;

  private String transactionApplicationRetrieveActionTaskReference = null;

  private Object transactionApplicationRetrieveActionTaskRecord = null;

  private String transactionApplicationRetrieveActionResponse = null;

  private BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceReport transactionApplicationInstanceReport = null;

  private BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceAnalysis transactionApplicationInstanceAnalysis = null;


  /**
   * Get transactionApplicationInstanceRecord
   * @return transactionApplicationInstanceRecord
  **/

  public BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceRecord getTransactionApplicationInstanceRecord() {
    return transactionApplicationInstanceRecord;
  }

  public void setTransactionApplicationInstanceRecord(BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceRecord transactionApplicationInstanceRecord) {
    this.transactionApplicationInstanceRecord = transactionApplicationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Application instance retrieve service call 
   * @return transactionApplicationRetrieveActionTaskReference
  **/

  public String getTransactionApplicationRetrieveActionTaskReference() {
    return transactionApplicationRetrieveActionTaskReference;
  }

  public void setTransactionApplicationRetrieveActionTaskReference(String transactionApplicationRetrieveActionTaskReference) {
    this.transactionApplicationRetrieveActionTaskReference = transactionApplicationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return transactionApplicationRetrieveActionResponse
  **/

  public String getTransactionApplicationRetrieveActionResponse() {
    return transactionApplicationRetrieveActionResponse;
  }

  public void setTransactionApplicationRetrieveActionResponse(String transactionApplicationRetrieveActionResponse) {
    this.transactionApplicationRetrieveActionResponse = transactionApplicationRetrieveActionResponse;
  }


  /**
   * Get transactionApplicationInstanceReport
   * @return transactionApplicationInstanceReport
  **/

  public BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceReport getTransactionApplicationInstanceReport() {
    return transactionApplicationInstanceReport;
  }

  public void setTransactionApplicationInstanceReport(BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceReport transactionApplicationInstanceReport) {
    this.transactionApplicationInstanceReport = transactionApplicationInstanceReport;
  }


  /**
   * Get transactionApplicationInstanceAnalysis
   * @return transactionApplicationInstanceAnalysis
  **/

  public BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceAnalysis getTransactionApplicationInstanceAnalysis() {
    return transactionApplicationInstanceAnalysis;
  }

  public void setTransactionApplicationInstanceAnalysis(BQTransactionApplicationRetrieveOutputModelTransactionApplicationInstanceAnalysis transactionApplicationInstanceAnalysis) {
    this.transactionApplicationInstanceAnalysis = transactionApplicationInstanceAnalysis;
  }


}

