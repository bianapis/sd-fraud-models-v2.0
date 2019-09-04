package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudModelSpecificationRetrieveInputModelFraudModelSpecificationInstanceAnalysis;
import org.bian.dto.CRFraudModelSpecificationRetrieveInputModelFraudModelSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationRetrieveInputModel
 */
public class CRFraudModelSpecificationRetrieveInputModel   {
  private Object fraudModelSpecificationRetrieveActionTaskRecord = null;

  private String fraudModelSpecificationRetrieveActionRequest = null;

  private CRFraudModelSpecificationRetrieveInputModelFraudModelSpecificationInstanceReportRecord fraudModelSpecificationInstanceReportRecord = null;

  private CRFraudModelSpecificationRetrieveInputModelFraudModelSpecificationInstanceAnalysis fraudModelSpecificationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fraudModelSpecificationRetrieveActionTaskRecord
  **/

  public Object getFraudModelSpecificationRetrieveActionTaskRecord() {
    return fraudModelSpecificationRetrieveActionTaskRecord;
  }

  public void setFraudModelSpecificationRetrieveActionTaskRecord(Object fraudModelSpecificationRetrieveActionTaskRecord) {
    this.fraudModelSpecificationRetrieveActionTaskRecord = fraudModelSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fraudModelSpecificationRetrieveActionRequest
  **/

  public String getFraudModelSpecificationRetrieveActionRequest() {
    return fraudModelSpecificationRetrieveActionRequest;
  }

  public void setFraudModelSpecificationRetrieveActionRequest(String fraudModelSpecificationRetrieveActionRequest) {
    this.fraudModelSpecificationRetrieveActionRequest = fraudModelSpecificationRetrieveActionRequest;
  }


  /**
   * Get fraudModelSpecificationInstanceReportRecord
   * @return fraudModelSpecificationInstanceReportRecord
  **/

  public CRFraudModelSpecificationRetrieveInputModelFraudModelSpecificationInstanceReportRecord getFraudModelSpecificationInstanceReportRecord() {
    return fraudModelSpecificationInstanceReportRecord;
  }

  public void setFraudModelSpecificationInstanceReportRecord(CRFraudModelSpecificationRetrieveInputModelFraudModelSpecificationInstanceReportRecord fraudModelSpecificationInstanceReportRecord) {
    this.fraudModelSpecificationInstanceReportRecord = fraudModelSpecificationInstanceReportRecord;
  }


  /**
   * Get fraudModelSpecificationInstanceAnalysis
   * @return fraudModelSpecificationInstanceAnalysis
  **/

  public CRFraudModelSpecificationRetrieveInputModelFraudModelSpecificationInstanceAnalysis getFraudModelSpecificationInstanceAnalysis() {
    return fraudModelSpecificationInstanceAnalysis;
  }

  public void setFraudModelSpecificationInstanceAnalysis(CRFraudModelSpecificationRetrieveInputModelFraudModelSpecificationInstanceAnalysis fraudModelSpecificationInstanceAnalysis) {
    this.fraudModelSpecificationInstanceAnalysis = fraudModelSpecificationInstanceAnalysis;
  }


}

