package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceAnalysis;
import org.bian.dto.CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceRecord;
import org.bian.dto.CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationRetrieveOutputModel
 */
public class CRFraudModelSpecificationRetrieveOutputModel   {
  private CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord = null;

  private String fraudModelSpecificationRetrieveActionTaskReference = null;

  private Object fraudModelSpecificationRetrieveActionTaskRecord = null;

  private String fraudModelSpecificationRetrieveActionResponse = null;

  private CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceReportRecord fraudModelSpecificationInstanceReportRecord = null;

  private CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceAnalysis fraudModelSpecificationInstanceAnalysis = null;


  /**
   * Get fraudModelSpecificationInstanceRecord
   * @return fraudModelSpecificationInstanceRecord
  **/

  public CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceRecord getFraudModelSpecificationInstanceRecord() {
    return fraudModelSpecificationInstanceRecord;
  }

  public void setFraudModelSpecificationInstanceRecord(CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord) {
    this.fraudModelSpecificationInstanceRecord = fraudModelSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Model Specification instance retrieve service call 
   * @return fraudModelSpecificationRetrieveActionTaskReference
  **/

  public String getFraudModelSpecificationRetrieveActionTaskReference() {
    return fraudModelSpecificationRetrieveActionTaskReference;
  }

  public void setFraudModelSpecificationRetrieveActionTaskReference(String fraudModelSpecificationRetrieveActionTaskReference) {
    this.fraudModelSpecificationRetrieveActionTaskReference = fraudModelSpecificationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fraudModelSpecificationRetrieveActionResponse
  **/

  public String getFraudModelSpecificationRetrieveActionResponse() {
    return fraudModelSpecificationRetrieveActionResponse;
  }

  public void setFraudModelSpecificationRetrieveActionResponse(String fraudModelSpecificationRetrieveActionResponse) {
    this.fraudModelSpecificationRetrieveActionResponse = fraudModelSpecificationRetrieveActionResponse;
  }


  /**
   * Get fraudModelSpecificationInstanceReportRecord
   * @return fraudModelSpecificationInstanceReportRecord
  **/

  public CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceReportRecord getFraudModelSpecificationInstanceReportRecord() {
    return fraudModelSpecificationInstanceReportRecord;
  }

  public void setFraudModelSpecificationInstanceReportRecord(CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceReportRecord fraudModelSpecificationInstanceReportRecord) {
    this.fraudModelSpecificationInstanceReportRecord = fraudModelSpecificationInstanceReportRecord;
  }


  /**
   * Get fraudModelSpecificationInstanceAnalysis
   * @return fraudModelSpecificationInstanceAnalysis
  **/

  public CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceAnalysis getFraudModelSpecificationInstanceAnalysis() {
    return fraudModelSpecificationInstanceAnalysis;
  }

  public void setFraudModelSpecificationInstanceAnalysis(CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceAnalysis fraudModelSpecificationInstanceAnalysis) {
    this.fraudModelSpecificationInstanceAnalysis = fraudModelSpecificationInstanceAnalysis;
  }


}

