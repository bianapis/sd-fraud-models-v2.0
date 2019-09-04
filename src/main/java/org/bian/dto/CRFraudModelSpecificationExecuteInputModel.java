package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudModelSpecificationExecuteInputModelExecuteRecordType;
import org.bian.dto.CRFraudModelSpecificationExecuteInputModelFraudModelSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationExecuteInputModel
 */
public class CRFraudModelSpecificationExecuteInputModel   {
  private String fraudModelsServicingSessionReference = null;

  private String fraudModelSpecificationInstanceReference = null;

  private CRFraudModelSpecificationExecuteInputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord = null;

  private Object fraudModelSpecificationExecuteActionTaskRecord = null;

  private CRFraudModelSpecificationExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRFraudModelSpecificationExecuteInputModelFraudModelSpecificationInstanceRecord getFraudModelSpecificationInstanceRecord() {
    return fraudModelSpecificationInstanceRecord;
  }

  public void setFraudModelSpecificationInstanceRecord(CRFraudModelSpecificationExecuteInputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord) {
    this.fraudModelSpecificationInstanceRecord = fraudModelSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return fraudModelSpecificationExecuteActionTaskRecord
  **/

  public Object getFraudModelSpecificationExecuteActionTaskRecord() {
    return fraudModelSpecificationExecuteActionTaskRecord;
  }

  public void setFraudModelSpecificationExecuteActionTaskRecord(Object fraudModelSpecificationExecuteActionTaskRecord) {
    this.fraudModelSpecificationExecuteActionTaskRecord = fraudModelSpecificationExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRFraudModelSpecificationExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRFraudModelSpecificationExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

