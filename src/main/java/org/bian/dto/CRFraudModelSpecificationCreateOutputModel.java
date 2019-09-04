package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudModelSpecificationCreateOutputModelFraudModelSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationCreateOutputModel
 */
public class CRFraudModelSpecificationCreateOutputModel   {
  private String fraudModelSpecificationInstanceReference = null;

  private String fraudModelSpecificationCreateActionReference = null;

  private Object fraudModelSpecificationCreateActionRecord = null;

  private String fraudModelSpecificationInstanceStatus = null;

  private CRFraudModelSpecificationCreateOutputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fraud Model Specification instance 
   * @return fraudModelSpecificationInstanceReference
  **/

  public String getFraudModelSpecificationInstanceReference() {
    return fraudModelSpecificationInstanceReference;
  }

  public void setFraudModelSpecificationInstanceReference(String fraudModelSpecificationInstanceReference) {
    this.fraudModelSpecificationInstanceReference = fraudModelSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return fraudModelSpecificationCreateActionReference
  **/

  public String getFraudModelSpecificationCreateActionReference() {
    return fraudModelSpecificationCreateActionReference;
  }

  public void setFraudModelSpecificationCreateActionReference(String fraudModelSpecificationCreateActionReference) {
    this.fraudModelSpecificationCreateActionReference = fraudModelSpecificationCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return fraudModelSpecificationCreateActionRecord
  **/

  public Object getFraudModelSpecificationCreateActionRecord() {
    return fraudModelSpecificationCreateActionRecord;
  }

  public void setFraudModelSpecificationCreateActionRecord(Object fraudModelSpecificationCreateActionRecord) {
    this.fraudModelSpecificationCreateActionRecord = fraudModelSpecificationCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Fraud Model Specification instance (e.g. initialised, pending, active) 
   * @return fraudModelSpecificationInstanceStatus
  **/

  public String getFraudModelSpecificationInstanceStatus() {
    return fraudModelSpecificationInstanceStatus;
  }

  public void setFraudModelSpecificationInstanceStatus(String fraudModelSpecificationInstanceStatus) {
    this.fraudModelSpecificationInstanceStatus = fraudModelSpecificationInstanceStatus;
  }


  /**
   * Get fraudModelSpecificationInstanceRecord
   * @return fraudModelSpecificationInstanceRecord
  **/

  public CRFraudModelSpecificationCreateOutputModelFraudModelSpecificationInstanceRecord getFraudModelSpecificationInstanceRecord() {
    return fraudModelSpecificationInstanceRecord;
  }

  public void setFraudModelSpecificationInstanceRecord(CRFraudModelSpecificationCreateOutputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord) {
    this.fraudModelSpecificationInstanceRecord = fraudModelSpecificationInstanceRecord;
  }


}

