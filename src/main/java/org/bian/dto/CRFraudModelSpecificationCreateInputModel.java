package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudModelSpecificationCreateInputModelFraudModelSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationCreateInputModel
 */
public class CRFraudModelSpecificationCreateInputModel   {
  private String fraudModelsServicingSessionReference = null;

  private Object fraudModelSpecificationCreateActionRecord = null;

  private String fraudModelSpecificationInstanceStatus = null;

  private CRFraudModelSpecificationCreateInputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return fraudModelsServicingSessionReference
  **/

  public String getFraudModelsServicingSessionReference() {
    return fraudModelsServicingSessionReference;
  }

  public void setFraudModelsServicingSessionReference(String fraudModelsServicingSessionReference) {
    this.fraudModelsServicingSessionReference = fraudModelsServicingSessionReference;
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

  public CRFraudModelSpecificationCreateInputModelFraudModelSpecificationInstanceRecord getFraudModelSpecificationInstanceRecord() {
    return fraudModelSpecificationInstanceRecord;
  }

  public void setFraudModelSpecificationInstanceRecord(CRFraudModelSpecificationCreateInputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord) {
    this.fraudModelSpecificationInstanceRecord = fraudModelSpecificationInstanceRecord;
  }


}

