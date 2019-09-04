package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRequirementsRetrieveOutputModelFraudModelSpecificationInstanceRecord;
import org.bian.dto.BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceAnalysis;
import org.bian.dto.BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceRecord;
import org.bian.dto.BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRetrieveOutputModel
 */
public class BQFunctionalRequirementsRetrieveOutputModel   {
  private BQFunctionalRequirementsRetrieveOutputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord = null;

  private BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord = null;

  private String functionalRequirementsRetrieveActionTaskReference = null;

  private Object functionalRequirementsRetrieveActionTaskRecord = null;

  private String functionalRequirementsRetrieveActionResponse = null;

  private BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceReport functionalRequirementsInstanceReport = null;

  private BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceAnalysis functionalRequirementsInstanceAnalysis = null;


  /**
   * Get fraudModelSpecificationInstanceRecord
   * @return fraudModelSpecificationInstanceRecord
  **/

  public BQFunctionalRequirementsRetrieveOutputModelFraudModelSpecificationInstanceRecord getFraudModelSpecificationInstanceRecord() {
    return fraudModelSpecificationInstanceRecord;
  }

  public void setFraudModelSpecificationInstanceRecord(BQFunctionalRequirementsRetrieveOutputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord) {
    this.fraudModelSpecificationInstanceRecord = fraudModelSpecificationInstanceRecord;
  }


  /**
   * Get functionalRequirementsInstanceRecord
   * @return functionalRequirementsInstanceRecord
  **/

  public BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceRecord getFunctionalRequirementsInstanceRecord() {
    return functionalRequirementsInstanceRecord;
  }

  public void setFunctionalRequirementsInstanceRecord(BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord) {
    this.functionalRequirementsInstanceRecord = functionalRequirementsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Functional Requirements instance retrieve service call 
   * @return functionalRequirementsRetrieveActionTaskReference
  **/

  public String getFunctionalRequirementsRetrieveActionTaskReference() {
    return functionalRequirementsRetrieveActionTaskReference;
  }

  public void setFunctionalRequirementsRetrieveActionTaskReference(String functionalRequirementsRetrieveActionTaskReference) {
    this.functionalRequirementsRetrieveActionTaskReference = functionalRequirementsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return functionalRequirementsRetrieveActionTaskRecord
  **/

  public Object getFunctionalRequirementsRetrieveActionTaskRecord() {
    return functionalRequirementsRetrieveActionTaskRecord;
  }

  public void setFunctionalRequirementsRetrieveActionTaskRecord(Object functionalRequirementsRetrieveActionTaskRecord) {
    this.functionalRequirementsRetrieveActionTaskRecord = functionalRequirementsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return functionalRequirementsRetrieveActionResponse
  **/

  public String getFunctionalRequirementsRetrieveActionResponse() {
    return functionalRequirementsRetrieveActionResponse;
  }

  public void setFunctionalRequirementsRetrieveActionResponse(String functionalRequirementsRetrieveActionResponse) {
    this.functionalRequirementsRetrieveActionResponse = functionalRequirementsRetrieveActionResponse;
  }


  /**
   * Get functionalRequirementsInstanceReport
   * @return functionalRequirementsInstanceReport
  **/

  public BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceReport getFunctionalRequirementsInstanceReport() {
    return functionalRequirementsInstanceReport;
  }

  public void setFunctionalRequirementsInstanceReport(BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceReport functionalRequirementsInstanceReport) {
    this.functionalRequirementsInstanceReport = functionalRequirementsInstanceReport;
  }


  /**
   * Get functionalRequirementsInstanceAnalysis
   * @return functionalRequirementsInstanceAnalysis
  **/

  public BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceAnalysis getFunctionalRequirementsInstanceAnalysis() {
    return functionalRequirementsInstanceAnalysis;
  }

  public void setFunctionalRequirementsInstanceAnalysis(BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceAnalysis functionalRequirementsInstanceAnalysis) {
    this.functionalRequirementsInstanceAnalysis = functionalRequirementsInstanceAnalysis;
  }


}

