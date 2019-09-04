package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionStateRetrieveOutputModelFinancialPositionStateInstanceAnalysis;
import org.bian.dto.CRFinancialPositionStateRetrieveOutputModelFinancialPositionStateInstanceReportRecord;
import org.bian.dto.CRFinancialPositionStateRetrieveOutputModelPositionManagementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionStateRetrieveOutputModel
 */
public class CRFinancialPositionStateRetrieveOutputModel   {
  private CRFinancialPositionStateRetrieveOutputModelPositionManagementInstanceRecord positionManagementInstanceRecord = null;

  private String financialPositionStateRetrieveActionTaskReference = null;

  private Object financialPositionStateRetrieveActionTaskRecord = null;

  private String financialPositionStateRetrieveActionResponse = null;

  private CRFinancialPositionStateRetrieveOutputModelFinancialPositionStateInstanceReportRecord financialPositionStateInstanceReportRecord = null;

  private CRFinancialPositionStateRetrieveOutputModelFinancialPositionStateInstanceAnalysis financialPositionStateInstanceAnalysis = null;


  /**
   * Get positionManagementInstanceRecord
   * @return positionManagementInstanceRecord
  **/

  public CRFinancialPositionStateRetrieveOutputModelPositionManagementInstanceRecord getPositionManagementInstanceRecord() {
    return positionManagementInstanceRecord;
  }

  public void setPositionManagementInstanceRecord(CRFinancialPositionStateRetrieveOutputModelPositionManagementInstanceRecord positionManagementInstanceRecord) {
    this.positionManagementInstanceRecord = positionManagementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Position State instance retrieve service call 
   * @return financialPositionStateRetrieveActionTaskReference
  **/

  public String getFinancialPositionStateRetrieveActionTaskReference() {
    return financialPositionStateRetrieveActionTaskReference;
  }

  public void setFinancialPositionStateRetrieveActionTaskReference(String financialPositionStateRetrieveActionTaskReference) {
    this.financialPositionStateRetrieveActionTaskReference = financialPositionStateRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return financialPositionStateRetrieveActionResponse
  **/

  public String getFinancialPositionStateRetrieveActionResponse() {
    return financialPositionStateRetrieveActionResponse;
  }

  public void setFinancialPositionStateRetrieveActionResponse(String financialPositionStateRetrieveActionResponse) {
    this.financialPositionStateRetrieveActionResponse = financialPositionStateRetrieveActionResponse;
  }


  /**
   * Get financialPositionStateInstanceReportRecord
   * @return financialPositionStateInstanceReportRecord
  **/

  public CRFinancialPositionStateRetrieveOutputModelFinancialPositionStateInstanceReportRecord getFinancialPositionStateInstanceReportRecord() {
    return financialPositionStateInstanceReportRecord;
  }

  public void setFinancialPositionStateInstanceReportRecord(CRFinancialPositionStateRetrieveOutputModelFinancialPositionStateInstanceReportRecord financialPositionStateInstanceReportRecord) {
    this.financialPositionStateInstanceReportRecord = financialPositionStateInstanceReportRecord;
  }


  /**
   * Get financialPositionStateInstanceAnalysis
   * @return financialPositionStateInstanceAnalysis
  **/

  public CRFinancialPositionStateRetrieveOutputModelFinancialPositionStateInstanceAnalysis getFinancialPositionStateInstanceAnalysis() {
    return financialPositionStateInstanceAnalysis;
  }

  public void setFinancialPositionStateInstanceAnalysis(CRFinancialPositionStateRetrieveOutputModelFinancialPositionStateInstanceAnalysis financialPositionStateInstanceAnalysis) {
    this.financialPositionStateInstanceAnalysis = financialPositionStateInstanceAnalysis;
  }


}

