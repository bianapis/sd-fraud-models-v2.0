package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudModelSpecificationRequestInputModelFraudModelSpecificationInstanceRecord;
import org.bian.dto.CRFraudModelSpecificationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationRequestInputModel
 */
public class CRFraudModelSpecificationRequestInputModel   {
  private String fraudModelsServicingSessionReference = null;

  private String fraudModelSpecificationInstanceReference = null;

  private CRFraudModelSpecificationRequestInputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord = null;

  private Object fraudModelSpecificationRequestActionTaskRecord = null;

  private CRFraudModelSpecificationRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get fraudModelSpecificationInstanceRecord
   * @return fraudModelSpecificationInstanceRecord
  **/

  public CRFraudModelSpecificationRequestInputModelFraudModelSpecificationInstanceRecord getFraudModelSpecificationInstanceRecord() {
    return fraudModelSpecificationInstanceRecord;
  }

  public void setFraudModelSpecificationInstanceRecord(CRFraudModelSpecificationRequestInputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord) {
    this.fraudModelSpecificationInstanceRecord = fraudModelSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return fraudModelSpecificationRequestActionTaskRecord
  **/

  public Object getFraudModelSpecificationRequestActionTaskRecord() {
    return fraudModelSpecificationRequestActionTaskRecord;
  }

  public void setFraudModelSpecificationRequestActionTaskRecord(Object fraudModelSpecificationRequestActionTaskRecord) {
    this.fraudModelSpecificationRequestActionTaskRecord = fraudModelSpecificationRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRFraudModelSpecificationRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRFraudModelSpecificationRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

