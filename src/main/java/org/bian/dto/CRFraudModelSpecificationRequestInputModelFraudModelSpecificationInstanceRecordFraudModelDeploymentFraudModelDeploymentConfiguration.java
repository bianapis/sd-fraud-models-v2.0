package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationRequestInputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration
 */
public class CRFraudModelSpecificationRequestInputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration   {
  private String fraudModelDeploymentTaskReference = null;


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


}

