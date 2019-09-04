package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsCaptureOutputModel
 */
public class BQFunctionalRequirementsCaptureOutputModel   {
  private String functionalRequirementsCaptureActionTaskReference = null;

  private Object functionalRequirementsCaptureActionTaskRecord = null;

  private String functionalRequirementsCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Functional Requirements instance capture service call 
   * @return functionalRequirementsCaptureActionTaskReference
  **/

  public String getFunctionalRequirementsCaptureActionTaskReference() {
    return functionalRequirementsCaptureActionTaskReference;
  }

  public void setFunctionalRequirementsCaptureActionTaskReference(String functionalRequirementsCaptureActionTaskReference) {
    this.functionalRequirementsCaptureActionTaskReference = functionalRequirementsCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return functionalRequirementsCaptureActionTaskRecord
  **/

  public Object getFunctionalRequirementsCaptureActionTaskRecord() {
    return functionalRequirementsCaptureActionTaskRecord;
  }

  public void setFunctionalRequirementsCaptureActionTaskRecord(Object functionalRequirementsCaptureActionTaskRecord) {
    this.functionalRequirementsCaptureActionTaskRecord = functionalRequirementsCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Functional Requirements structured input transaction/record 
   * @return functionalRequirementsCaptureRecordReference
  **/

  public String getFunctionalRequirementsCaptureRecordReference() {
    return functionalRequirementsCaptureRecordReference;
  }

  public void setFunctionalRequirementsCaptureRecordReference(String functionalRequirementsCaptureRecordReference) {
    this.functionalRequirementsCaptureRecordReference = functionalRequirementsCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

