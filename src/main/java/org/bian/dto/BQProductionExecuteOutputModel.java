package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionExecuteOutputModelFraudModelSpecificationInstanceRecord;
import org.bian.dto.BQProductionExecuteOutputModelProductionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductionExecuteOutputModel
 */
public class BQProductionExecuteOutputModel   {
  private BQProductionExecuteOutputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord = null;

  private BQProductionExecuteOutputModelProductionInstanceRecord productionInstanceRecord = null;

  private String productionExecuteActionTaskReference = null;

  private Object productionExecuteActionTaskRecord = null;

  private String productionExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get fraudModelSpecificationInstanceRecord
   * @return fraudModelSpecificationInstanceRecord
  **/

  public BQProductionExecuteOutputModelFraudModelSpecificationInstanceRecord getFraudModelSpecificationInstanceRecord() {
    return fraudModelSpecificationInstanceRecord;
  }

  public void setFraudModelSpecificationInstanceRecord(BQProductionExecuteOutputModelFraudModelSpecificationInstanceRecord fraudModelSpecificationInstanceRecord) {
    this.fraudModelSpecificationInstanceRecord = fraudModelSpecificationInstanceRecord;
  }


  /**
   * Get productionInstanceRecord
   * @return productionInstanceRecord
  **/

  public BQProductionExecuteOutputModelProductionInstanceRecord getProductionInstanceRecord() {
    return productionInstanceRecord;
  }

  public void setProductionInstanceRecord(BQProductionExecuteOutputModelProductionInstanceRecord productionInstanceRecord) {
    this.productionInstanceRecord = productionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Production instance execute service call 
   * @return productionExecuteActionTaskReference
  **/

  public String getProductionExecuteActionTaskReference() {
    return productionExecuteActionTaskReference;
  }

  public void setProductionExecuteActionTaskReference(String productionExecuteActionTaskReference) {
    this.productionExecuteActionTaskReference = productionExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return productionExecuteActionTaskRecord
  **/

  public Object getProductionExecuteActionTaskRecord() {
    return productionExecuteActionTaskRecord;
  }

  public void setProductionExecuteActionTaskRecord(Object productionExecuteActionTaskRecord) {
    this.productionExecuteActionTaskRecord = productionExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production execute transaction/record 
   * @return productionExecuteRecordReference
  **/

  public String getProductionExecuteRecordReference() {
    return productionExecuteRecordReference;
  }

  public void setProductionExecuteRecordReference(String productionExecuteRecordReference) {
    this.productionExecuteRecordReference = productionExecuteRecordReference;
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

