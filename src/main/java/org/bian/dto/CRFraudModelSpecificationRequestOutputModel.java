package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudModelSpecificationRequestOutputModelFraudModelSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationRequestOutputModel
 */
public class CRFraudModelSpecificationRequestOutputModel   {
  private CRFraudModelSpecificationRequestOutputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord = null;

  private String fraudModelSpecificationRequestActionTaskReference = null;

  private Object fraudModelSpecificationRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get fraudModelSpecificationInstanceRecord
   * @return fraudModelSpecificationInstanceRecord
  **/

  public CRFraudModelSpecificationRequestOutputModelFraudModelSpecificationInstanceRecord getFraudModelSpecificationInstanceRecord() {
    return fraudModelSpecificationInstanceRecord;
  }

  public void setFraudModelSpecificationInstanceRecord(CRFraudModelSpecificationRequestOutputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord) {
    this.fraudModelSpecificationInstanceRecord = fraudModelSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Model Specification instance request service call 
   * @return fraudModelSpecificationRequestActionTaskReference
  **/

  public String getFraudModelSpecificationRequestActionTaskReference() {
    return fraudModelSpecificationRequestActionTaskReference;
  }

  public void setFraudModelSpecificationRequestActionTaskReference(String fraudModelSpecificationRequestActionTaskReference) {
    this.fraudModelSpecificationRequestActionTaskReference = fraudModelSpecificationRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

