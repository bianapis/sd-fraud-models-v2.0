package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsExchangeOutputModel
 */
public class BQFunctionalRequirementsExchangeOutputModel   {
  private String functionalRequirementsExchangeActionTaskReference = null;

  private Object functionalRequirementsExchangeActionTaskRecord = null;

  private String functionalRequirementsExchangeActionResponse = null;

  private String functionalRequirementsInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Functional Requirements instance exchange service call 
   * @return functionalRequirementsExchangeActionTaskReference
  **/

  public String getFunctionalRequirementsExchangeActionTaskReference() {
    return functionalRequirementsExchangeActionTaskReference;
  }

  public void setFunctionalRequirementsExchangeActionTaskReference(String functionalRequirementsExchangeActionTaskReference) {
    this.functionalRequirementsExchangeActionTaskReference = functionalRequirementsExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return functionalRequirementsExchangeActionTaskRecord
  **/

  public Object getFunctionalRequirementsExchangeActionTaskRecord() {
    return functionalRequirementsExchangeActionTaskRecord;
  }

  public void setFunctionalRequirementsExchangeActionTaskRecord(Object functionalRequirementsExchangeActionTaskRecord) {
    this.functionalRequirementsExchangeActionTaskRecord = functionalRequirementsExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return functionalRequirementsExchangeActionResponse
  **/

  public String getFunctionalRequirementsExchangeActionResponse() {
    return functionalRequirementsExchangeActionResponse;
  }

  public void setFunctionalRequirementsExchangeActionResponse(String functionalRequirementsExchangeActionResponse) {
    this.functionalRequirementsExchangeActionResponse = functionalRequirementsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Functional Requirements instance (e.g. accepted, rejected, verified) 
   * @return functionalRequirementsInstanceStatus
  **/

  public String getFunctionalRequirementsInstanceStatus() {
    return functionalRequirementsInstanceStatus;
  }

  public void setFunctionalRequirementsInstanceStatus(String functionalRequirementsInstanceStatus) {
    this.functionalRequirementsInstanceStatus = functionalRequirementsInstanceStatus;
  }


}

