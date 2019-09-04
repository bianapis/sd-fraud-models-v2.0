package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudModelSpecificationExecuteOutputModelFraudModelSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationExecuteOutputModel
 */
public class CRFraudModelSpecificationExecuteOutputModel   {
  private CRFraudModelSpecificationExecuteOutputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord = null;

  private String fraudModelSpecificationExecuteActionTaskReference = null;

  private Object fraudModelSpecificationExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get fraudModelSpecificationInstanceRecord
   * @return fraudModelSpecificationInstanceRecord
  **/

  public CRFraudModelSpecificationExecuteOutputModelFraudModelSpecificationInstanceRecord getFraudModelSpecificationInstanceRecord() {
    return fraudModelSpecificationInstanceRecord;
  }

  public void setFraudModelSpecificationInstanceRecord(CRFraudModelSpecificationExecuteOutputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord) {
    this.fraudModelSpecificationInstanceRecord = fraudModelSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Model Specification instance execute service call 
   * @return fraudModelSpecificationExecuteActionTaskReference
  **/

  public String getFraudModelSpecificationExecuteActionTaskReference() {
    return fraudModelSpecificationExecuteActionTaskReference;
  }

  public void setFraudModelSpecificationExecuteActionTaskReference(String fraudModelSpecificationExecuteActionTaskReference) {
    this.fraudModelSpecificationExecuteActionTaskReference = fraudModelSpecificationExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

