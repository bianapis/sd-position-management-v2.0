package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionStateRetrieveInputModelFinancialPositionStateInstanceAnalysis;
import org.bian.dto.CRFinancialPositionStateRetrieveInputModelFinancialPositionStateInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateRetrieveInputModel
 */
public class CRFinancialPositionStateRetrieveInputModel   {
  private Object financialPositionStateRetrieveActionTaskRecord = null;

  private String financialPositionStateRetrieveActionRequest = null;

  private CRFinancialPositionStateRetrieveInputModelFinancialPositionStateInstanceReportRecord financialPositionStateInstanceReportRecord = null;

  private CRFinancialPositionStateRetrieveInputModelFinancialPositionStateInstanceAnalysis financialPositionStateInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialPositionStateRetrieveActionTaskRecord
  **/

  public Object getFinancialPositionStateRetrieveActionTaskRecord() {
    return financialPositionStateRetrieveActionTaskRecord;
  }

  public void setFinancialPositionStateRetrieveActionTaskRecord(Object financialPositionStateRetrieveActionTaskRecord) {
    this.financialPositionStateRetrieveActionTaskRecord = financialPositionStateRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialPositionStateRetrieveActionRequest
  **/

  public String getFinancialPositionStateRetrieveActionRequest() {
    return financialPositionStateRetrieveActionRequest;
  }

  public void setFinancialPositionStateRetrieveActionRequest(String financialPositionStateRetrieveActionRequest) {
    this.financialPositionStateRetrieveActionRequest = financialPositionStateRetrieveActionRequest;
  }


  /**
   * Get financialPositionStateInstanceReportRecord
   * @return financialPositionStateInstanceReportRecord
  **/

  public CRFinancialPositionStateRetrieveInputModelFinancialPositionStateInstanceReportRecord getFinancialPositionStateInstanceReportRecord() {
    return financialPositionStateInstanceReportRecord;
  }

  public void setFinancialPositionStateInstanceReportRecord(CRFinancialPositionStateRetrieveInputModelFinancialPositionStateInstanceReportRecord financialPositionStateInstanceReportRecord) {
    this.financialPositionStateInstanceReportRecord = financialPositionStateInstanceReportRecord;
  }


  /**
   * Get financialPositionStateInstanceAnalysis
   * @return financialPositionStateInstanceAnalysis
  **/

  public CRFinancialPositionStateRetrieveInputModelFinancialPositionStateInstanceAnalysis getFinancialPositionStateInstanceAnalysis() {
    return financialPositionStateInstanceAnalysis;
  }

  public void setFinancialPositionStateInstanceAnalysis(CRFinancialPositionStateRetrieveInputModelFinancialPositionStateInstanceAnalysis financialPositionStateInstanceAnalysis) {
    this.financialPositionStateInstanceAnalysis = financialPositionStateInstanceAnalysis;
  }


}

