package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRequestOutputModel
 */
public class BQFunctionalRequirementsRequestOutputModel   {
  private String functionalRequirementsRequestActionTaskReference = null;

  private Object functionalRequirementsRequestActionTaskRecord = null;

  private String functionalRequirementsRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Functional Requirements instance request service call 
   * @return functionalRequirementsRequestActionTaskReference
  **/

  public String getFunctionalRequirementsRequestActionTaskReference() {
    return functionalRequirementsRequestActionTaskReference;
  }

  public void setFunctionalRequirementsRequestActionTaskReference(String functionalRequirementsRequestActionTaskReference) {
    this.functionalRequirementsRequestActionTaskReference = functionalRequirementsRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return functionalRequirementsRequestActionTaskRecord
  **/

  public Object getFunctionalRequirementsRequestActionTaskRecord() {
    return functionalRequirementsRequestActionTaskRecord;
  }

  public void setFunctionalRequirementsRequestActionTaskRecord(Object functionalRequirementsRequestActionTaskRecord) {
    this.functionalRequirementsRequestActionTaskRecord = functionalRequirementsRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Functional Requirements service request record 
   * @return functionalRequirementsRequestRecordReference
  **/

  public String getFunctionalRequirementsRequestRecordReference() {
    return functionalRequirementsRequestRecordReference;
  }

  public void setFunctionalRequirementsRequestRecordReference(String functionalRequirementsRequestRecordReference) {
    this.functionalRequirementsRequestRecordReference = functionalRequirementsRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

