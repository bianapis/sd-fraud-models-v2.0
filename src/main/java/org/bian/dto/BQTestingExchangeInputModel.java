package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRequirementsExchangeInputModelFunctionalRequirementsExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQTestingExchangeInputModel
 */
public class BQTestingExchangeInputModel   {
  private String fraudModelSpecificationInstanceReference = null;

  private String testingInstanceReference = null;

  private Object testingExchangeActionTaskRecord = null;

  private BQFunctionalRequirementsExchangeInputModelFunctionalRequirementsExchangeActionRequest testingExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Fraud Model Specification instance 
   * @return fraudModelSpecificationInstanceReference
  **/

  public String getFraudModelSpecificationInstanceReference() {
    return fraudModelSpecificationInstanceReference;
  }

  public void setFraudModelSpecificationInstanceReference(String fraudModelSpecificationInstanceReference) {
    this.fraudModelSpecificationInstanceReference = fraudModelSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Testing instance 
   * @return testingInstanceReference
  **/

  public String getTestingInstanceReference() {
    return testingInstanceReference;
  }

  public void setTestingInstanceReference(String testingInstanceReference) {
    this.testingInstanceReference = testingInstanceReference;
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
   * Get testingExchangeActionRequest
   * @return testingExchangeActionRequest
  **/

  public BQFunctionalRequirementsExchangeInputModelFunctionalRequirementsExchangeActionRequest getTestingExchangeActionRequest() {
    return testingExchangeActionRequest;
  }

  public void setTestingExchangeActionRequest(BQFunctionalRequirementsExchangeInputModelFunctionalRequirementsExchangeActionRequest testingExchangeActionRequest) {
    this.testingExchangeActionRequest = testingExchangeActionRequest;
  }


}

