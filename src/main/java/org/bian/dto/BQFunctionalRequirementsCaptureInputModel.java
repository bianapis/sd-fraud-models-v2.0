package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRequirementsCaptureInputModelCaptureRecordType;
import org.bian.dto.BQFunctionalRequirementsCaptureInputModelFraudModelSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsCaptureInputModel
 */
public class BQFunctionalRequirementsCaptureInputModel   {
  private BQFunctionalRequirementsCaptureInputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord = null;

  private String fraudModelSpecificationInstanceReference = null;

  private String functionalRequirementsInstanceReference = null;

  private Object functionalRequirementsCaptureActionTaskRecord = null;

  private BQFunctionalRequirementsCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * Get fraudModelSpecificationInstanceRecord
   * @return fraudModelSpecificationInstanceRecord
  **/

  public BQFunctionalRequirementsCaptureInputModelFraudModelSpecificationInstanceRecord getFraudModelSpecificationInstanceRecord() {
    return fraudModelSpecificationInstanceRecord;
  }

  public void setFraudModelSpecificationInstanceRecord(BQFunctionalRequirementsCaptureInputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord) {
    this.fraudModelSpecificationInstanceRecord = fraudModelSpecificationInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Functional Requirements instance fraudModelFeedbackRecord:  type: object  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary    general-info: User provided and solicited feedback, suggestions for model refinement 
   * @return functionalRequirementsInstanceReference
  **/

  public String getFunctionalRequirementsInstanceReference() {
    return functionalRequirementsInstanceReference;
  }

  public void setFunctionalRequirementsInstanceReference(String functionalRequirementsInstanceReference) {
    this.functionalRequirementsInstanceReference = functionalRequirementsInstanceReference;
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
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQFunctionalRequirementsCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQFunctionalRequirementsCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

