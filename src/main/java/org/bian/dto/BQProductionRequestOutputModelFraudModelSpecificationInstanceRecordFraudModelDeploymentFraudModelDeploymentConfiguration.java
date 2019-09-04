package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration
 */
public class BQProductionRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration   {
  private String fraudModelDeploymentTaskReference = null;

  private Object fraudModelDeploymentTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to deployment task 
   * @return fraudModelDeploymentTaskReference
  **/

  public String getFraudModelDeploymentTaskReference() {
    return fraudModelDeploymentTaskReference;
  }

  public void setFraudModelDeploymentTaskReference(String fraudModelDeploymentTaskReference) {
    this.fraudModelDeploymentTaskReference = fraudModelDeploymentTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Recorded details of a deployment task 
   * @return fraudModelDeploymentTaskRecord
  **/

  public Object getFraudModelDeploymentTaskRecord() {
    return fraudModelDeploymentTaskRecord;
  }

  public void setFraudModelDeploymentTaskRecord(Object fraudModelDeploymentTaskRecord) {
    this.fraudModelDeploymentTaskRecord = fraudModelDeploymentTaskRecord;
  }


}

