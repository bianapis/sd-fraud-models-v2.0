package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRequestInputModelFraudModelSpecificationInstanceRecord;
import org.bian.dto.CRFraudModelSpecificationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQProductionRequestInputModel
 */
public class BQProductionRequestInputModel   {
  private BQProductionRequestInputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord = null;

  private String fraudModelSpecificationInstanceReference = null;

  private String productionInstanceReference = null;

  private Object productionRequestActionTaskRecord = null;

  private CRFraudModelSpecificationRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get fraudModelSpecificationInstanceRecord
   * @return fraudModelSpecificationInstanceRecord
  **/

  public BQProductionRequestInputModelFraudModelSpecificationInstanceRecord getFraudModelSpecificationInstanceRecord() {
    return fraudModelSpecificationInstanceRecord;
  }

  public void setFraudModelSpecificationInstanceRecord(BQProductionRequestInputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production instance 
   * @return productionInstanceReference
  **/

  public String getProductionInstanceReference() {
    return productionInstanceReference;
  }

  public void setProductionInstanceReference(String productionInstanceReference) {
    this.productionInstanceReference = productionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productionRequestActionTaskRecord
  **/

  public Object getProductionRequestActionTaskRecord() {
    return productionRequestActionTaskRecord;
  }

  public void setProductionRequestActionTaskRecord(Object productionRequestActionTaskRecord) {
    this.productionRequestActionTaskRecord = productionRequestActionTaskRecord;
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

