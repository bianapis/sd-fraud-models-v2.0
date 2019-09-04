package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingExchangeOutputModel
 */
public class BQTestingExchangeOutputModel   {
  private String testingExchangeActionTaskReference = null;

  private Object testingExchangeActionTaskRecord = null;

  private String testingExchangeActionResponse = null;

  private String testingInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Testing instance exchange service call 
   * @return testingExchangeActionTaskReference
  **/

  public String getTestingExchangeActionTaskReference() {
    return testingExchangeActionTaskReference;
  }

  public void setTestingExchangeActionTaskReference(String testingExchangeActionTaskReference) {
    this.testingExchangeActionTaskReference = testingExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return testingExchangeActionTaskRecord
  **/

  public Object getTestingExchangeActionTaskRecord() {
    return testingExchangeActionTaskRecord;
  }

  public void setTestingExchangeActionTaskRecord(Object testingExchangeActionTaskRecord) {
    this.testingExchangeActionTaskRecord = testingExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return testingExchangeActionResponse
  **/

  public String getTestingExchangeActionResponse() {
    return testingExchangeActionResponse;
  }

  public void setTestingExchangeActionResponse(String testingExchangeActionResponse) {
    this.testingExchangeActionResponse = testingExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Testing instance (e.g. accepted, rejected, verified) 
   * @return testingInstanceStatus
  **/

  public String getTestingInstanceStatus() {
    return testingInstanceStatus;
  }

  public void setTestingInstanceStatus(String testingInstanceStatus) {
    this.testingInstanceStatus = testingInstanceStatus;
  }


}

