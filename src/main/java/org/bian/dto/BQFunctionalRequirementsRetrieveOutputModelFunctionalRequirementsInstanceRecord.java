package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceRecord
 */
public class BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceRecord   {
  private String fraudModelDesignTaskReference = null;

  private Object fraudModelDesignTaskRecord = null;

  private String customerMarketDataServiceReference = null;

  private Object customerMarketDataRecord = null;

  private Object fraudModelFeedbackRecord = null;

  private String fraudModelRequirementsSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a type of functional requirements specification activity 
   * @return fraudModelDesignTaskReference
  **/

  public String getFraudModelDesignTaskReference() {
    return fraudModelDesignTaskReference;
  }

  public void setFraudModelDesignTaskReference(String fraudModelDesignTaskReference) {
    this.fraudModelDesignTaskReference = fraudModelDesignTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record of work products used for the design task 
   * @return fraudModelDesignTaskRecord
  **/

  public Object getFraudModelDesignTaskRecord() {
    return fraudModelDesignTaskRecord;
  }

  public void setFraudModelDesignTaskRecord(Object fraudModelDesignTaskRecord) {
    this.fraudModelDesignTaskRecord = fraudModelDesignTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to external service information provider used to obtain example production data for design 
   * @return customerMarketDataServiceReference
  **/

  public String getCustomerMarketDataServiceReference() {
    return customerMarketDataServiceReference;
  }

  public void setCustomerMarketDataServiceReference(String customerMarketDataServiceReference) {
    this.customerMarketDataServiceReference = customerMarketDataServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Record of example production data file 
   * @return customerMarketDataRecord
  **/

  public Object getCustomerMarketDataRecord() {
    return customerMarketDataRecord;
  }

  public void setCustomerMarketDataRecord(Object customerMarketDataRecord) {
    this.customerMarketDataRecord = customerMarketDataRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: User provided and solicited feedback, suggestions for model refinement 
   * @return fraudModelFeedbackRecord
  **/

  public Object getFraudModelFeedbackRecord() {
    return fraudModelFeedbackRecord;
  }

  public void setFraudModelFeedbackRecord(Object fraudModelFeedbackRecord) {
    this.fraudModelFeedbackRecord = fraudModelFeedbackRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The model functional requirements specification (with versioning as appropriate) 
   * @return fraudModelRequirementsSpecification
  **/

  public String getFraudModelRequirementsSpecification() {
    return fraudModelRequirementsSpecification;
  }

  public void setFraudModelRequirementsSpecification(String fraudModelRequirementsSpecification) {
    this.fraudModelRequirementsSpecification = fraudModelRequirementsSpecification;
  }


}

